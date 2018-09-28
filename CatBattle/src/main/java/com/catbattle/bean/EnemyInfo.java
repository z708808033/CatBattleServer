package com.catbattle.bean;

public class EnemyInfo {
    private String enemyId;

    private String enemyName;

    private String alias;

    private String category;

    private String categoryDescribe;

    private String powerUpRate;

    private String hp;

    private String kb;

    private String attack;

    private String speed;

    private String attackAnimation;

    private String attackDistance;

    private String cooldown;

    private String attackType;

    private String reward;

    private String skill;

    private String skillType;

    private String skillTypeDescribe;

    private String img;

    public String getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(String enemyId) {
        this.enemyId = enemyId == null ? null : enemyId.trim();
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName == null ? null : enemyName.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategoryDescribe() {
        return categoryDescribe;
    }

    public void setCategoryDescribe(String categoryDescribe) {
        this.categoryDescribe = categoryDescribe == null ? null : categoryDescribe.trim();
    }

    public String getPowerUpRate() {
        return powerUpRate;
    }

    public void setPowerUpRate(String powerUpRate) {
        this.powerUpRate = powerUpRate == null ? null : powerUpRate.trim();
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp == null ? null : hp.trim();
    }

    public String getKb() {
        return kb;
    }

    public void setKb(String kb) {
        this.kb = kb == null ? null : kb.trim();
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack == null ? null : attack.trim();
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed == null ? null : speed.trim();
    }

    public String getAttackAnimation() {
        return attackAnimation;
    }

    public void setAttackAnimation(String attackAnimation) {
        this.attackAnimation = attackAnimation == null ? null : attackAnimation.trim();
    }

    public String getAttackDistance() {
        return attackDistance;
    }

    public void setAttackDistance(String attackDistance) {
        this.attackDistance = attackDistance == null ? null : attackDistance.trim();
    }

    public String getCooldown() {
        return cooldown;
    }

    public void setCooldown(String cooldown) {
        this.cooldown = cooldown == null ? null : cooldown.trim();
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType == null ? null : attackType.trim();
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward == null ? null : reward.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType == null ? null : skillType.trim();
    }

    public String getSkillTypeDescribe() {
        return skillTypeDescribe;
    }

    public void setSkillTypeDescribe(String skillTypeDescribe) {
        this.skillTypeDescribe = skillTypeDescribe == null ? null : skillTypeDescribe.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}