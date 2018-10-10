package com.catbattle.spider.enemy;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EnemyPropertyTool {
	public static String getCategoryDescribe(Element element) {
		Elements elements = element.select("td[class=bgc12][rowspan=2]");
		String categoryDescribe = elements.get(0).text();
		StringBuilder sb = new StringBuilder();
		if(categoryDescribe.contains("白い敵")) {
			sb.append("白,");
		}
		if(categoryDescribe.contains("赤い敵")) {
			sb.append("红,");
		}
		if(categoryDescribe.contains("黒い敵")) {
			sb.append("黑,");
		}
		if(categoryDescribe.contains("浮いてる敵")) {
			sb.append("浮空,");
		}
		if(categoryDescribe.contains("メタルな敵")) {
			sb.append("钢铁,");
		}
		if(categoryDescribe.contains("天使")) {
			sb.append("天使,");
		}
		if(categoryDescribe.contains("エイリアン")) {
			sb.append("外星,");
		}
		if(categoryDescribe.contains("スターエイリアン")) {
			sb.append("外星(有星星),");
		}
		if(categoryDescribe.contains("ゾンビ")) {
			sb.append("僵尸,");
		}
		if(categoryDescribe.contains("古代種")) {
			sb.append("古代,");
		}
		if(categoryDescribe.contains("魔女")) {
			sb.append("魔女,");
		}
		if(categoryDescribe.contains("使徒")) {
			sb.append("使徒,");
		}
		if(categoryDescribe.contains("無属性な敵")) {
			sb.append("无属性,");
		}
		return sb.toString();
	}

	public static String getReward(Element element) {
		Elements elements = element.select("td:contains(お金) + td");
		return elements.get(0).text();
	}

	public static String getHP(Element element) {
		Elements elements = element.select("td:contains(体力) + td > font");
		return elements.get(0).text();
	}

	public static String getEnemyName(Element element) {
		Elements elements = element.select("td[colspan=5]");
		return elements.get(0).text();
	}

	public static String getAttack(Element element) {
		Elements elements = element.select("td:contains(攻撃力) + td > font");
		return elements.get(0).text();
	}

	public static String getKB(Element element) {
		Elements elements = element.select("td:contains(KB) + td");
		return elements.get(0).text();
	}

	public static String getSpeed(Element element) {
		Elements elements = element.select("td:contains(速度) + td");
		return elements.get(0).text();
	}

	public static String getAttackAnimation(Element element) {
		Elements elements = element.select("td:contains(攻撃発生F) + td");
		return elements.get(0).text();
	}

	public static String getAttackDistance(Element element) {
		Elements elements = element.select("td:contains(射程) + td");
		return elements.get(0).text();
	}

	public static String getCooldown(Element element) {
		Elements elements = element.select("td:contains(攻撃間隔F) + td");
		return elements.get(0).text();
	}

	public static String getAttackType(Element element) {
		Elements elements = element.select("td:contains(範囲) + td");
		String text = elements.get(0).text();
		if(text.equals("単体")) {
			text = "单体";
		} else if(text.equals("範囲")) {
			text = "范围";
		}
		return text;
	}

	public static String getImg(Element element) throws Exception {
		Elements elements = element.select("td[class=bgc12][rowspan=2] + td > img");
		String imgUrl = elements.get(0).attr("src");
		String imgName = "http://localhost:8080/image/enemy" + imgUrl.substring(imgUrl.lastIndexOf("/"));
		return imgName;
	}

	public static String getSkill(Element element) {
		Elements elements = element.select("td:contains(特性) + td");
		String text = elements.get(0).text();
		text = dealSkill(text);
		return text;
	}

	private static String dealSkill(String text) {
		if(text.contains("対")) {
			text = text.replace("対", "对");
		}
		if(text.contains("エイリアン")) {
			text = text.replace("エイリアン", "外星敌人");
		}
		if(text.contains("メタル")) {
			text = text.replace("メタル", "钢铁敌人");
		}
		if(text.contains("めっぽう強い")) {
			text = text.replace("めっぽう強い", "很强");
		}
		if(text.contains("の確率")) {
			text = text.replace("の確率", "概率");
		}
		if(text.contains("攻撃")) {
			text = text.replace("攻撃", "攻击");
		}
		if(text.contains("クリティカル")) {
			text = text.replace("クリティカル", "暴击");
		}
		if(text.contains("除く")) {
			text = text.replace("除く", "除外");
		}
		if(text.contains("ふっとばす")) {
			text = text.replace("ふっとばす", "击退");
		}
		if(text.contains("連続")) {
			text = text.replace("連続", "连续");
		}
		if(text.contains("無効")) {
			text = text.replace("無効", "无效");
		}
		if(text.contains("ゾンビ")) {
			text = text.replace("ゾンビ", "僵尸");
		}
		if(text.contains("ワープ")) {
			text = text.replace("ワープ", "传送");
		}
		if(text.contains("動きを遅くする")) {
			text = text.replace("動きを遅くする", "减速");
		}
		if(text.contains("バリアブレイク")) {
			text = text.replace("バリアブレイク", "破盾");
		}
		if(text.contains("動きを止める")) {
			text = text.replace("動きを止める", "暂停");
		}
		if(text.contains("古代の呪い")) {
			text = text.replace("古代の呪い", "古代诅咒");
		}
		if(text.contains("波動")) {
			text = text.replace("波動", "波动");
		}
		if(text.contains("遠方")) {
			text = text.replace("遠方", "远方");
		}
		return text;
	}

	public static String getCategory(String categoryDescribe) {
		StringBuilder sb = new StringBuilder();
		if(categoryDescribe.contains("白")) {
			sb.append("white,");
		}
		if(categoryDescribe.contains("红")) {
			sb.append("red,");
		}
		if(categoryDescribe.contains("黑")) {
			sb.append("black,");
		}
		if(categoryDescribe.contains("浮空")) {
			sb.append("float,");
		}
		if(categoryDescribe.contains("钢铁")) {
			sb.append("metal,");
		}
		if(categoryDescribe.contains("天使")) {
			sb.append("angel,");
		} 
		if(categoryDescribe.contains("外星")) {
			sb.append("alien,");
		} 
		if(categoryDescribe.contains("僵尸")) {
			sb.append("zombie,");
		} 
		if(categoryDescribe.contains("古代")) {
			sb.append("ancient,");
		} 
		if(categoryDescribe.contains("魔女")) {
			sb.append("witch,");
		} 
		if(categoryDescribe.contains("使徒")) {
			sb.append("shitu,");
		} 
		if(categoryDescribe.contains("外星(有星星)")) {
			sb.append("alienWithStar,");
		} 
		if(categoryDescribe.contains("无属性")) {
			sb.append("none,");
		}
		return sb.toString();
	}
}
