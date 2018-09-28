package com.catbattle.spider.cat;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CatPropertyTool {
	public static String[] getCategoryDescribe(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td[class=bgc12][rowspan=2]");
		for (int i = 0;i < Elements.size();i++) {
			String text = Elements.get(i).text();
			if(text.contains("レア")) {
				text = text.replace("レア", "稀有");
			}
			list.add(text);
		}
		return list.toArray(new String[0]);
	}

	public static String[] getHP(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(体力) + td > font");
		for (int i = 1;i < Elements.size();i += 2) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getCatName(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td[colspan=5]");
		for (int i = 0;i < Elements.size();i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getDefaultLevel(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements1 = element.select("font[class=c05 finger]");
		Elements Elements2 = element.select("font[class=c06 finger]");
		for (int i = 0; i < Elements1.size(); i++) {
			list.add(Elements1.get(i).text() + "+" + Elements2.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getMaxLevel(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(MaxLv) + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text().substring(3));
		}
		return list.toArray(new String[0]);
	}

	public static String[] getAttack(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(攻撃力) + td > font");
		for (int i = 1;i < Elements.size();i += 2) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getKB(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(KB) + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getAttackRate(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(攻撃頻度F) + td + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getSpeed(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(速度) + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getAttackAnimation(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(攻撃発生F) + td + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getAttackDistance(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(射程) + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getCooldown(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(攻撃間隔F) + td + td");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getAttackType(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(範囲) + td > font");
		for (int i = 0; i < Elements.size(); i++) {
			String text = Elements.get(i).text();
			if(text.equals("単体")) {
				text = "单体";
			} else if(text.equals("範囲")) {
				text = "范围";
			}
			list.add(text);
		}
		return list.toArray(new String[0]);
	}

	public static String[] getCost(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(コスト) + td > font");
		for (int i = 1;i < Elements.size();i += 2) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getCD(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(再生産F) + td + td > font");
		for (int i = 0; i < Elements.size(); i++) {
			list.add(Elements.get(i).text());
		}
		return list.toArray(new String[0]);
	}

	public static String[] getImg(Element element) throws Exception {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td[class=bgc12][rowspan=2] + td > img");
		for (int i = 0; i < Elements.size(); i++) {
			String imgUrl = Elements.get(i).attr("src");
			String imgName = "assets/image/cat" + imgUrl.substring(imgUrl.lastIndexOf("/"));
			list.add(imgName);
		}
		return list.toArray(new String[0]);
	}

	public static String[] getSkill(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(特性) + td");
		for (int i = 0; i < Elements.size(); i++) {
			String text = Elements.get(i).text();
			text = dealSkill(text);
			list.add(text);
		}
		return list.toArray(new String[0]);
	}

	public static String[] getGetCondition(Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(開放条件) + td");
		for (int i = 0; i < Elements.size(); i++) {
			String text = Elements.get(i).text();
			text = dealCondition(text);
			list.add(text);
		}
		return list.toArray(new String[0]);
	}

	private static String dealSkill(String text) {
		if(text.contains("対")) {
			text = text.replace("対", "对");
		}
		if(text.contains("赤い敵")) {
			text = text.replace("赤い敵", "红敌");
		}
		if(text.contains("エイリアン")) {
			text = text.replace("エイリアン", "外星敌人");
		}
		if(text.contains("メタル")) {
			text = text.replace("メタル", "钢铁敌人");
		}
		if(text.contains("全ての敵")) {
			text = text.replace("全ての敵", "所有敌人");
		}
		if(text.contains("めっぽう強い")) {
			text = text.replace("めっぽう強い", "很强");
		}
		if(text.contains("与ダメ")) {
			text = text.replace("与ダメ", "造成伤害");
		}
		if(text.contains("被ダメ")) {
			text = text.replace("被ダメ", "受到伤害");
		}
		if(text.contains("お宝で変動")) {
			text = text.replace("お宝で変動", "随宝物变动");
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
		if(text.contains("キラー")) {
			text = text.replace("キラー", "杀手");
		}
		if(text.contains("ワープ")) {
			text = text.replace("ワープ", "传送");
		}
		if(text.contains("黒い敵")) {
			text = text.replace("黒い敵", "黑敌");
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
		if(text.contains("打たれ強い")) {
			text = text.replace("打たれ強い", "耐揍");
		}
		if(text.contains("浮いてる敵")) {
			text = text.replace("浮いてる敵", "浮空敌人");
		}
		if(text.contains("超ダメージ")) {
			text = text.replace("超ダメージ", "超强");
		}
		if(text.contains("波動")) {
			text = text.replace("波動", "波动");
		}
		if(text.contains("遠方")) {
			text = text.replace("遠方", "远方");
		}
		if(text.contains("古代種")) {
			text = text.replace("古代種", "古代敌人");
		}
		return text;
	}

	private static String dealCondition(String text) {
		if(text.contains("キャラクター")) {
			text = text.replace("キャラクター", "角色");
		}
		if(text.contains("にゃんこガチャ")) {
			text = text.replace("にゃんこガチャ", "银扭蛋");
		}
		if(text.contains("各種ガチャ")) {
			text = text.replace("各種ガチャ", "各种金扭蛋");
		}
		if(text.contains("合計")) {
			text = text.replace("合計", "合计");
		}
		if(text.contains("ステージ")) {
			text = text.replace("ステージ", "关卡");
		}
		if(text.contains("ネコカン")) {
			text = text.replace("ネコカン", "猫罐头");
		}
		if(text.contains("個")) {
			text = text.replace("個", "个");
		}
		if(text.contains("ガチャ（イベント）")) {
			text = text.replace("ガチャ（イベント）", "福扭蛋");
		}
		return text;
	}

	public static int getCatIndex(String catId,Element element) {
		List<String> list = new ArrayList<String>();
		Elements Elements = element.select("td:contains(No.)");
		for (int i = 0;i < Elements.size();i++) {
			if(Elements.get(i).text().trim().endsWith(catId)) {
				return i;
			}
		}
		return 0;
	}

	public static String getCategory(String categoryDescribe) {
		if("基本".equals(categoryDescribe)) {
			return "normal";
		} else if("EX".equals(categoryDescribe)) {
			return "EX";
		} else if("稀有".equals(categoryDescribe)) {
			return "rare";
		} else if("激稀有".equals(categoryDescribe)) {
			return "very_rare";
		} else if("超激稀有".equals(categoryDescribe)) {
			return "super_rare";
		}
		return "";
	}
}
