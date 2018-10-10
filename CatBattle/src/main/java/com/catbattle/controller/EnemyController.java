package com.catbattle.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.catbattle.bean.CatInfo;
import com.catbattle.bean.EnemyInfo;
import com.catbattle.service.EnemyService;

@RestController
@RequestMapping("/java/enemy")
public class EnemyController {
	@Autowired
	private EnemyService enemySV;
	
	@RequestMapping(value="/getEnemiesByCategory/{category}",method=RequestMethod.GET)
	public List<EnemyInfo> getEnemiesByCategory(@PathVariable String category) {
		if(category == null || category.isEmpty()) {
			return null;
		}
		return enemySV.getEnemiesByCategory(category);
	}
	
	@RequestMapping(value="/getEnemyByEnemyId/{enemyId}",method=RequestMethod.GET)
	public EnemyInfo getEnemyByEnemyId(@PathVariable String enemyId) {
		if(enemyId == null || enemyId.isEmpty()) {
			return null;
		}
		return enemySV.getEnemyByEnemyId(enemyId);
	}
	
	@RequestMapping(value="/getEnemiesBySkillType/{skillType}",method=RequestMethod.GET)
	public List<EnemyInfo> getEnemiesBySkillType(@PathVariable String skillType) {
		if(skillType == null || skillType.isEmpty()) {
			return null;
		}
		return enemySV.getEnemiesBySkillType(skillType);
	}
	
	@RequestMapping(value="/getEnemiesByEnemyName/{enemyName}",method=RequestMethod.GET)
	public List<EnemyInfo> getEnemiesByEnemyName(@PathVariable String enemyName) {
		if(enemyName == null || enemyName.isEmpty()) {
			return null;
		}
		return enemySV.getEnemiesByEnemyName(enemyName);
	}
	
	@RequestMapping(value="/updateEnemy",method=RequestMethod.POST)
	public String updateEnemy(@RequestBody EnemyInfo enemy) {
		if(enemy == null) {
			return "SUCCESS";
		}
		return enemySV.updateEnemy(enemy);
	}
	
	@RequestMapping(value="/previewEnemy/{enemyId}",method=RequestMethod.GET)
	public EnemyInfo previewCat(@PathVariable String enemyId) {
		if(enemyId == null || enemyId.isEmpty()) {
			return null;
		}
		return enemySV.previewEnemy(enemyId);
	}
	
	@RequestMapping(value="/saveEnemy",method=RequestMethod.POST)
	public String saveEnemy(@RequestBody EnemyInfo enemy) {
		if(enemy == null) {
			return "SUCCESS";
		}
		return enemySV.saveEnemy(enemy);
	}
	
	@RequestMapping(value="/uploadEnemyImg",method=RequestMethod.POST)
	public String uploadEnemyImg(MultipartFile file) {
		try {
			byte[] bytes = file.getBytes();
			Path path = Paths.get("src/main/webapp/image/enemy/", file.getOriginalFilename());
			Files.write(path, bytes);
			return "SUCCESS";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
