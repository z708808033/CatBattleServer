package com.catbattle.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catbattle.bean.CatInfo;
import com.catbattle.bean.EnemyInfo;
import com.catbattle.bean.EnemyInfoExample;
import com.catbattle.bean.EnemyInfoExample.Criteria;
import com.catbattle.mapper.EnemyInfoMapper;
import com.catbattle.service.EnemyService;
import com.catbattle.spider.cat.CatSpider;
import com.catbattle.spider.enemy.EnemySpider;

@Service
@Transactional
public class EnemyServiceImpl implements EnemyService{
	@Autowired
	private EnemyInfoMapper enemyMapper;
	
	@Override
	public List<EnemyInfo> getEnemiesByCategory(String category) {
		EnemyInfoExample example = new EnemyInfoExample();
		if(!category.equals("all")) {
			Criteria criteria = example.createCriteria();
			criteria.andCategoryLike("%" + category + "%");
		}
		List<EnemyInfo> list = enemyMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public EnemyInfo getEnemyByEnemyId(String enemyId) {
		EnemyInfo enemy = enemyMapper.selectByPrimaryKey(enemyId);
		return enemy;
	}
	
	@Override
	public List<EnemyInfo> getEnemiesBySkillType(String skillType) {
		EnemyInfoExample example = new EnemyInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andSkillTypeLike("%" + skillType + "%");
		List<EnemyInfo> list = enemyMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public List<EnemyInfo> getEnemiesByEnemyName(String enemyName) {
		EnemyInfoExample example = new EnemyInfoExample();
		Criteria criteria1 = example.createCriteria();
		criteria1.andEnemyNameLike("%" + enemyName + "%");
		Criteria criteria2 = example.or();
		criteria2.andAliasLike("%" + enemyName + "%");
		List<EnemyInfo> list = enemyMapper.selectByExample(example);
		return list;
	}

	@Override
	public String updateEnemy(EnemyInfo enemy) {
		try {
			enemyMapper.updateByPrimaryKey(enemy);
			return "SUCCESS";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public EnemyInfo previewEnemy(String enemyId) {
		return EnemySpider.getEnemy(enemyId);
	}

	@Override
	public String saveEnemy(EnemyInfo enemy) {
		try {
			this.enemyMapper.insert(enemy);
			return "SUCCESS";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
