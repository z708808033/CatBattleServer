package com.catbattle.spider;

import com.catbattle.spider.cat.CatSpider;
import com.catbattle.spider.enemy.EnemySpider;

public class CatBattleMain {
	public static void main(String[] args) throws Exception {
		catSpiderGo();
//		enemySpiderGo();
	}
	
	private static void enemySpiderGo() {
		EnemySpider.getAllEnemy();
//		EnemySpider.getEnemy(new String[]{"002"});
	}

	private static void catSpiderGo() throws Exception {
		CatSpider.getNormalCat();
		CatSpider.getEXCat();
		CatSpider.getRareCat();
		CatSpider.getVeryRareCat();
		CatSpider.getSuperRareCat();
//		MySpider.getCat(new String[]{"001"});
	}
	
	
}
