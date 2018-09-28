package com.catbattle.service;

import java.util.List;

import com.catbattle.bean.CatInfo;

public interface CatService {
	public List<CatInfo> getCatsByCategory(String category);

	public List<CatInfo> getCatsByCatId(String catId);

	public List<CatInfo> getCatsByCatName(String catName);

	public List<CatInfo> getCatsByAntiEnemy(String antiEnemy);

	public List<CatInfo> getCatsBySkillType(String skillType);

	public void test();

	public String updateCats(List<CatInfo> cats);

	public CatInfo previewCat(String catId);

	public String saveCat(CatInfo cat);

}
