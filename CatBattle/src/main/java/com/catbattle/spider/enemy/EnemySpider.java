package com.catbattle.spider.enemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.catbattle.spider.CommonConst;
import com.catbattle.spider.common.DatabaseTool;

public class EnemySpider {
	public static void getAllEnemy() {
		getEnemyData(EnemyConst.ENEMY_ID_ARR);
	}
	
	public static void getEnemy(String[] arr) {
		getEnemyData(arr);
	}
	
	private static void getEnemyData(String[] enemyIds) {
		List<String> errList = new ArrayList<String>();
		for (int i = 0; i < enemyIds.length; i++) {
			try {
				String url = "https://battlecats-db.com/enemy/" + enemyIds[i] + ".html";		//normal
				int retryTime = 0;
				List<String> list = null;
				while(true) {
					boolean flag = true;
					String errMsg = "";
					try {
						list = getEnemyDetail(url, enemyIds[i]);
						DatabaseTool.saveEnemy(list);
					} catch (Exception e) {
						flag = false;
						retryTime++;
						if(errMsg.isEmpty()) {
							errMsg = e.getMessage();
						}
					}
					if(flag) {
						break;
					}
					if(retryTime >= CommonConst.RETYR_TIME) {
						throw new Exception("重试超过" + CommonConst.RETYR_TIME + "次后仍然失败，失败原因:" + errMsg);
					}
				}
				System.out.println("处理" + enemyIds[i] + "成功");
			} catch (Exception e) {
				errList.add(enemyIds[i]);
				System.out.println("处理" + enemyIds[i] + "失败：" + e.getMessage());
			}
		}
		if(errList.isEmpty()) {
			System.out.println("全部处理成功");
		} else {
			StringBuilder sb = new StringBuilder();
			int size = errList.size();
			for (int i = 0;i < size;i++) {
				sb.append(errList.get(i));
				if(i != size - 1) {
					sb.append(",");
				}
			}
			System.out.println("-----------------------------------");
			System.out.println("部分处理失败，失败列表：" + sb.toString());
		}
	}

	private static List<String> getEnemyDetail(String url,String enemyId) throws Exception {
		Document document = Jsoup.connect(url).timeout(10000).get();
		Element element = document.select("tbody").get(0);
//		System.out.println(element);
		String name = EnemyPropertyTool.getEnemyName(element);
		String category = EnemyPropertyTool.getCategory(element);
		String powerUpRate = EnemyPropertyTool.getPowerUpRate(element);
		String HP = EnemyPropertyTool.getHP(element);
		String kB = EnemyPropertyTool.getKB(element);
		String attack = EnemyPropertyTool.getAttack(element);
		String speed = EnemyPropertyTool.getSpeed(element);
		String attackAnimation = EnemyPropertyTool.getAttackAnimation(element);
		String attackDistance = EnemyPropertyTool.getAttackDistance(element);
		String cooldown = EnemyPropertyTool.getCooldown(element);
		String attackType = EnemyPropertyTool.getAttackType(element);
		String reward = EnemyPropertyTool.getReward(element);
		String skill = EnemyPropertyTool.getSkill(element);
		String img = EnemyPropertyTool.getImg(element);
		List<String> list = new ArrayList<String>();
		list.add(enemyId);
		list.add(name);
		list.add(category);
		list.add(powerUpRate);
		list.add(HP);
		list.add(kB);
		list.add(attack);
		list.add(speed);
		list.add(attackAnimation);
		list.add(attackDistance);
		list.add(cooldown);
		list.add(attackType);
		list.add(reward);
		list.add(skill);
		list.add(img);
		return list;
	}
}
