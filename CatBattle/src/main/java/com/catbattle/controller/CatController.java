package com.catbattle.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.catbattle.bean.CatInfo;
import com.catbattle.service.CatService;

//@SpringBootApplication
//@Controller
@RestController
@RequestMapping("/java/cat")
public class CatController {
	@Autowired
	private CatService catSV;
	
	@RequestMapping(value="/getCatsByCategory/{category}",method=RequestMethod.GET)
	public List<CatInfo> getCatsByCategory(@PathVariable String category) {
		if(category == null || category.isEmpty()) {
			return null;
		}
		return catSV.getCatsByCategory(category);
	}
	
	@RequestMapping(value="/getCatsByCatId/{catId}",method=RequestMethod.GET)
	public List<CatInfo> getCatsByCatId(@PathVariable String catId) {
		if(catId == null || catId.isEmpty()) {
			return null;
		}
		return catSV.getCatsByCatId(catId);
	}
	
	@RequestMapping(value="/getCatsByCatName/{catName}",method=RequestMethod.GET)
	public List<CatInfo> getCatsByCatName(@PathVariable String catName) {
		if(catName == null || catName.isEmpty()) {
			return null;
		}
		return catSV.getCatsByCatName(catName);
	}
	
	@RequestMapping(value="/getCatsByAntiEnemy/{antiEnemy}",method=RequestMethod.GET)
	public List<CatInfo> getCatsByAntiEnemy(@PathVariable String antiEnemy) {
		if(antiEnemy == null || antiEnemy.isEmpty()) {
			return null;
		}
		return catSV.getCatsByAntiEnemy(antiEnemy);
	}
	
	@RequestMapping(value="/getCatsBySkillType/{skillType}",method=RequestMethod.GET)
	public List<CatInfo> getCatsBySkillType(@PathVariable String skillType) {
		if(skillType == null || skillType.isEmpty()) {
			return null;
		}
		return catSV.getCatsBySkillType(skillType);
	}
	
	@RequestMapping(value="/saveCat",method=RequestMethod.POST)
	public String saveCat(@RequestBody CatInfo cat) {
		if(cat == null) {
			return "SUCCESS";
		}
		return catSV.saveCat(cat);
	}
	
	@RequestMapping(value="/previewCat/{catId}",method=RequestMethod.GET)
	public CatInfo previewCat(@PathVariable String catId) {
		if(catId == null || catId.isEmpty()) {
			return null;
		}
		return catSV.previewCat(catId);
	}
	
	@RequestMapping(value="/updateCats",method=RequestMethod.POST)
	public String updateCats(@RequestBody List<CatInfo> cats) {
		if(cats == null || cats.isEmpty()) {
			return "SUCCESS";
		}
		return catSV.updateCats(cats);
	}
	
	@RequestMapping("/test")
	public void test() {
//		catSV.test();
		System.out.println("成功");
	}
	
	public String fun(String s){
    	Map<String,Object[]> map = new HashMap<String, Object[]>();
    	map.put("Roma", new Object[]{'b','u','g'});
    	map.put("Maxim", new Object[]{'b','o','o','g'});
    	map.put("Roma", new Object[]{'e','d','i','t','s'});
    	char[] arr = s.toCharArray();
    	for (int i = 0; i < arr.length; i++) {
			for (Entry<String, Object[]> entry : map.entrySet()) {
				String ppl = entry.getKey();
				Object[] oarr = entry.getValue();
				char c = (char)oarr[(int)oarr[0]];
				if(arr[i] == c) {
					oarr[0] = (int)oarr[0] + 1;
					if((int)oarr[0] == oarr.length) {
						return ppl;
					}
				}
			}
		}
    	return "Vlad";
    }
}
