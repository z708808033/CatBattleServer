package com.catbattle.service;

import java.util.List;

import com.catbattle.bean.CatInfo;
import com.catbattle.bean.EnemyInfo;

public interface EnemyService {
	public List<EnemyInfo> getEnemiesByCategory(String category);

	public EnemyInfo getEnemyByEnemyId(String enemyId);

	public List<EnemyInfo> getEnemiesBySkillType(String skillType);

	public List<EnemyInfo> getEnemiesByEnemyName(String enemyName);

	public String updateEnemy(EnemyInfo enemy);

	public EnemyInfo previewEnemy(String enemyId);

	public String saveEnemy(EnemyInfo enemy);
}
