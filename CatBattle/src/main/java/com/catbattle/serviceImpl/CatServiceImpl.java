package com.catbattle.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catbattle.bean.CatInfo;
import com.catbattle.bean.CatInfoExample;
import com.catbattle.bean.EnemyInfo;
import com.catbattle.bean.EnemyInfoExample;
import com.catbattle.bean.CatInfoExample.Criteria;
import com.catbattle.mapper.CatInfoMapper;
import com.catbattle.mapper.EnemyInfoMapper;
import com.catbattle.service.CatService;
import com.catbattle.spider.cat.CatSpider;

@Service
@Transactional
public class CatServiceImpl implements CatService{
	@Autowired
	private CatInfoMapper catMapper;

	@Autowired
	private EnemyInfoMapper enemyMapper;

	@Override
	public List<CatInfo> getCatsByCategory(String category) {
		CatInfoExample example = new CatInfoExample();
		if(!category.equals("all")) {
			Criteria criteria = example.createCriteria();
			criteria.andCategoryEqualTo(category);
		}
		List<CatInfo> list = catMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<CatInfo> getCatsByCatId(String catId) {
		CatInfoExample example = new CatInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andCatIdLike(catId + "%");
		List<CatInfo> list = catMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<CatInfo> getCatsByCatName(String catName) {
		CatInfoExample example = new CatInfoExample();
		Criteria criteria1 = example.createCriteria();
		criteria1.andCatNameLike("%" + catName + "%");
		Criteria criteria2 = example.or();
		criteria2.andAliasLike("%" + catName + "%");
		List<CatInfo> list = catMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<CatInfo> getCatsByAntiEnemy(String antiEnemy) {
		CatInfoExample example = new CatInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andAntiEnemyLike("%" + antiEnemy + "%");
		List<CatInfo> list = catMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<CatInfo> getCatsBySkillType(String skillType) {
		CatInfoExample example = new CatInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andSkillTypeLike("%" + skillType + "%");
		List<CatInfo> list = catMapper.selectByExample(example);
		return list;
	}

	@Override
	public String saveCat(CatInfo cat) {
		try {
			catMapper.insert(cat);
			return "SUCCESS";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String updateCats(List<CatInfo> cats) {
		try {
			for (CatInfo cat : cats) {
				catMapper.updateByPrimaryKey(cat);
			}
			return "SUCCESS";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public CatInfo previewCat(String catId) {
		return CatSpider.getCat(catId);
	}

//	@Override
//	public void test() {
//		CatInfoExample e = new CatInfoExample();
//		List<CatInfo> list = catMapper.selectByExample(e);
//		for (CatInfo c : list) {
//			String img = c.getImg();
//			img = "http://localhost:8080" + img.substring(img.indexOf("/image"));
//			c.setImg(img);
//			catMapper.updateByPrimaryKey(c);
//		}
//	}
	
	@Override
	public void test() {
		EnemyInfoExample e = new EnemyInfoExample();
		List<EnemyInfo> list = enemyMapper.selectByExample(e);
		for (EnemyInfo en : list) {
			String img = en.getImg();
			img = "http://localhost:8080" + img.substring(img.indexOf("/image"));
			en.setImg(img);
			enemyMapper.updateByPrimaryKey(en);
		}
	}
}
