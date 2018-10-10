package com.catbattle.spider.cat;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.catbattle.bean.CatInfo;
import com.catbattle.spider.CommonConst;

public class CatSpider {
	public static CatInfo getCat(String catId) {
		return getCatData(catId);
	}

	private static CatInfo getCatData(String catId) {
		CatInfo cat = new CatInfo();
		try {
			String url = "https:battlecats-db.com/unit/" + catId.substring(0,3) + ".html";
			int retryTime = 0;
			while(true) {
				boolean flag = true;
				String errMsg = "";
				try {
					cat = getCatDetail(url, catId);
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
			System.out.println("处理成功");
		} catch (Exception e) {
			System.out.println("处理失败：" + e.getMessage());
		}
		return cat;
	}

	private static CatInfo getCatDetail(String url,String catId) throws Exception {
		Document document = Jsoup.connect(url).timeout(10000).get();
		Element element = document.select("tbody").get(0);
//		System.out.println(element);
		int index = CatPropertyTool.getCatIndex(catId,element);
		CatInfo cat = new CatInfo();
		String catName = CatPropertyTool.getCatName(element)[index];
		String categoryDescribe = CatPropertyTool.getCategoryDescribe(element)[index];
		String category = CatPropertyTool.getCategory(categoryDescribe);
		String defaultLevel = CatPropertyTool.getDefaultLevel(element)[index];
		String maxLevel = CatPropertyTool.getMaxLevel(element)[index];
		String hp = CatPropertyTool.getHP(element)[index];
		String kb = CatPropertyTool.getKB(element)[index];
		String attack = CatPropertyTool.getAttack(element)[index];
		String attackRate = CatPropertyTool.getAttackRate(element)[index];
		String speed = CatPropertyTool.getSpeed(element)[index];
		String attackAnimation = CatPropertyTool.getAttackAnimation(element)[index];
		String attackDistance = CatPropertyTool.getAttackDistance(element)[index];
		String cooldown = CatPropertyTool.getCooldown(element)[index];
		String attackType = CatPropertyTool.getAttackType(element)[index];
		String cost = CatPropertyTool.getCost(element)[index];
		String cd = CatPropertyTool.getCD(element)[index];
		String skill = CatPropertyTool.getSkill(element)[index];
		String getCondition = CatPropertyTool.getGetCondition(element)[index];
		String img = CatPropertyTool.getImg(element)[index];
		cat.setCatId(catId);
		cat.setCatName(catName);
		cat.setCategoryDescribe(categoryDescribe);
		cat.setCategory(category);
		cat.setDefaultLevel(defaultLevel);
		cat.setMaxLevel(maxLevel);
		cat.setHp(hp);
		cat.setKb(kb);
		cat.setAttack(attack);
		cat.setAttackRate(attackRate);
		cat.setSpeed(speed);
		cat.setAttackAnimation(attackAnimation);
		cat.setAttackDistance(attackDistance);
		cat.setCooldown(cooldown);
		cat.setAttackType(attackType);
		cat.setCost(cost);
		cat.setCd(cd);
		cat.setSkill(skill);
		cat.setGetCondition(getCondition);
		cat.setImg(img);
		cat.setAlias("");
		cat.setAntiEnemy("");
		cat.setSkillType("");
		cat.setAntiEnemyDescribe("");
		cat.setSkillTypeDescribe("");
		cat.setAttackLevel(0);
		cat.setAttackBefore(0f);
		cat.setAttackAfter(0f);
		cat.setBasicAttack(0f);
		cat.setHpLevel(0);
		cat.setHpBefore(0f);
		cat.setHpAfter(0f);
		cat.setBasicHp(0f);
		return cat;
	}

	/*public static void getNormalCat() {
		getCatDataInsertDB(CatConst.NORMAL_CAT_ID_ARR);
	}

	public static void getEXCat() throws Exception {
		getCatDataInsertDB(CatConst.EX_CAT_ID_ARR);
	}

	public static void getRareCat() {
		getCatDataInsertDB(CatConst.RARE_CAT_ID_ARR);
	}

	public static void getVeryRareCat() {
		getCatDataInsertDB(CatConst.VERY_RARE_CAT_ID_ARR);
	}

	public static void getSuperRareCat() {
		getCatDataInsertDB(CatConst.SUPER_RARE_CAT_ID_ARR);
	}

	public static void getCat(String[] arr) {
		getCatDataInsertDB(arr);
	}

	private static void getCatDataInsertDB(String[] catIds) {
		List<String> errList = new ArrayList<String>();
		for (int i = 0; i < catIds.length; i++) {
			try {
				String url = "https:battlecats-db.com/unit/" + catIds[i] + ".html";
				int retryTime = 0;
				List<List<String>> allList = null;
				while(true) {
					boolean flag = true;
					String errMsg = "";
					try {
						allList = getCatDetailInsertDB(url, catIds[i]);
						DatabaseTool.saveCat(allList);
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
				System.out.println("处理" + catIds[i] + "成功");
			} catch (Exception e) {
				errList.add(catIds[i]);
				System.out.println("处理" + catIds[i] + "失败：" + e.getMessage());
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



	private static List<List<String>> getCatDetailInsertDB(String url,String catId) throws Exception {
		List<List<String>> allList = new ArrayList<List<String>>();
		Document document = Jsoup.connect(url).timeout(10000).get();
		Element element = document.select("tbody").get(0);
//		System.out.println(element);
		String[] catName = CatPropertyTool.getCatName(element);
		String[] category = CatPropertyTool.getCategoryDescribe(element);
		String[] defaultLevel = CatPropertyTool.getDefaultLevel(element);
		String[] maxLevel = CatPropertyTool.getMaxLevel(element);
		String[] hp = CatPropertyTool.getHP(element);
		String[] kb = CatPropertyTool.getKB(element);
		String[] attackRate = CatPropertyTool.getAttackRate(element);
		String[] attack = CatPropertyTool.getAttack(element);
		String[] speed = CatPropertyTool.getSpeed(element);
		String[] attackAnimation = CatPropertyTool.getAttackAnimation(element);
		String[] attackDistance = CatPropertyTool.getAttackDistance(element);
		String[] cooldown = CatPropertyTool.getCooldown(element);
		String[] attackType = CatPropertyTool.getAttackType(element);
		String[] cost = CatPropertyTool.getCost(element);
		String[] cd = CatPropertyTool.getCD(element);
		String[] skill = CatPropertyTool.getSkill(element);
		String[] getCondition = CatPropertyTool.getGetCondition(element);
		if(getCondition.length < catName.length) {
			String[] clone = getCondition.clone();
			getCondition = new String[catName.length];
			int diff = getCondition.length - clone.length;
			for (int i = 0; i < getCondition.length; i++) {
				if(i < diff) {
					getCondition[i] = "";
				} else {
					getCondition[i] = clone[i - diff];
				}
			}
		}
		String[] img = CatPropertyTool.getImg(element);
		for (int j = 0; j < catName.length; j++) {
			List<String> list = new ArrayList<String>();
			list.add(catId + "-" + (j + 1));
			list.add(catName[j]);
			list.add(category[j]);
			list.add(defaultLevel[j]);
			list.add(maxLevel[j]);
			list.add(hp[j]);
			list.add(kb[j]);
			list.add(attack[j]);
			list.add(attackRate[j]);
			list.add(speed[j]);
			list.add(attackAnimation[j]);
			list.add(attackDistance[j]);
			list.add(cooldown[j]);
			list.add(attackType[j]);
			list.add(cost[j]);
			list.add(cd[j]);
			list.add(skill[j]);
			list.add(getCondition[j]);
			list.add(img[j]);
			allList.add(list);
		}
		System.out.println(allList);
		return allList;
	}*/
}
