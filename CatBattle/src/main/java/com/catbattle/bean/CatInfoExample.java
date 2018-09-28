package com.catbattle.bean;

import java.util.ArrayList;
import java.util.List;

public class CatInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(String value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(String value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(String value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(String value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(String value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(String value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLike(String value) {
            addCriterion("cat_id like", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotLike(String value) {
            addCriterion("cat_id not like", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<String> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<String> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(String value1, String value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(String value1, String value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelIsNull() {
            addCriterion("default_level is null");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelIsNotNull() {
            addCriterion("default_level is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelEqualTo(String value) {
            addCriterion("default_level =", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelNotEqualTo(String value) {
            addCriterion("default_level <>", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelGreaterThan(String value) {
            addCriterion("default_level >", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelGreaterThanOrEqualTo(String value) {
            addCriterion("default_level >=", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelLessThan(String value) {
            addCriterion("default_level <", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelLessThanOrEqualTo(String value) {
            addCriterion("default_level <=", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelLike(String value) {
            addCriterion("default_level like", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelNotLike(String value) {
            addCriterion("default_level not like", value, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelIn(List<String> values) {
            addCriterion("default_level in", values, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelNotIn(List<String> values) {
            addCriterion("default_level not in", values, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelBetween(String value1, String value2) {
            addCriterion("default_level between", value1, value2, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andDefaultLevelNotBetween(String value1, String value2) {
            addCriterion("default_level not between", value1, value2, "defaultLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelIsNull() {
            addCriterion("max_level is null");
            return (Criteria) this;
        }

        public Criteria andMaxLevelIsNotNull() {
            addCriterion("max_level is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLevelEqualTo(String value) {
            addCriterion("max_level =", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelNotEqualTo(String value) {
            addCriterion("max_level <>", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelGreaterThan(String value) {
            addCriterion("max_level >", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelGreaterThanOrEqualTo(String value) {
            addCriterion("max_level >=", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelLessThan(String value) {
            addCriterion("max_level <", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelLessThanOrEqualTo(String value) {
            addCriterion("max_level <=", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelLike(String value) {
            addCriterion("max_level like", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelNotLike(String value) {
            addCriterion("max_level not like", value, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelIn(List<String> values) {
            addCriterion("max_level in", values, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelNotIn(List<String> values) {
            addCriterion("max_level not in", values, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelBetween(String value1, String value2) {
            addCriterion("max_level between", value1, value2, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLevelNotBetween(String value1, String value2) {
            addCriterion("max_level not between", value1, value2, "maxLevel");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("HP is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("HP is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(String value) {
            addCriterion("HP =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(String value) {
            addCriterion("HP <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(String value) {
            addCriterion("HP >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(String value) {
            addCriterion("HP >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(String value) {
            addCriterion("HP <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(String value) {
            addCriterion("HP <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLike(String value) {
            addCriterion("HP like", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotLike(String value) {
            addCriterion("HP not like", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<String> values) {
            addCriterion("HP in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<String> values) {
            addCriterion("HP not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(String value1, String value2) {
            addCriterion("HP between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(String value1, String value2) {
            addCriterion("HP not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andKbIsNull() {
            addCriterion("KB is null");
            return (Criteria) this;
        }

        public Criteria andKbIsNotNull() {
            addCriterion("KB is not null");
            return (Criteria) this;
        }

        public Criteria andKbEqualTo(String value) {
            addCriterion("KB =", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbNotEqualTo(String value) {
            addCriterion("KB <>", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbGreaterThan(String value) {
            addCriterion("KB >", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbGreaterThanOrEqualTo(String value) {
            addCriterion("KB >=", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbLessThan(String value) {
            addCriterion("KB <", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbLessThanOrEqualTo(String value) {
            addCriterion("KB <=", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbLike(String value) {
            addCriterion("KB like", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbNotLike(String value) {
            addCriterion("KB not like", value, "kb");
            return (Criteria) this;
        }

        public Criteria andKbIn(List<String> values) {
            addCriterion("KB in", values, "kb");
            return (Criteria) this;
        }

        public Criteria andKbNotIn(List<String> values) {
            addCriterion("KB not in", values, "kb");
            return (Criteria) this;
        }

        public Criteria andKbBetween(String value1, String value2) {
            addCriterion("KB between", value1, value2, "kb");
            return (Criteria) this;
        }

        public Criteria andKbNotBetween(String value1, String value2) {
            addCriterion("KB not between", value1, value2, "kb");
            return (Criteria) this;
        }

        public Criteria andAttackIsNull() {
            addCriterion("attack is null");
            return (Criteria) this;
        }

        public Criteria andAttackIsNotNull() {
            addCriterion("attack is not null");
            return (Criteria) this;
        }

        public Criteria andAttackEqualTo(String value) {
            addCriterion("attack =", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotEqualTo(String value) {
            addCriterion("attack <>", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackGreaterThan(String value) {
            addCriterion("attack >", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackGreaterThanOrEqualTo(String value) {
            addCriterion("attack >=", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLessThan(String value) {
            addCriterion("attack <", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLessThanOrEqualTo(String value) {
            addCriterion("attack <=", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLike(String value) {
            addCriterion("attack like", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotLike(String value) {
            addCriterion("attack not like", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackIn(List<String> values) {
            addCriterion("attack in", values, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotIn(List<String> values) {
            addCriterion("attack not in", values, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackBetween(String value1, String value2) {
            addCriterion("attack between", value1, value2, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotBetween(String value1, String value2) {
            addCriterion("attack not between", value1, value2, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackRateIsNull() {
            addCriterion("attack_rate is null");
            return (Criteria) this;
        }

        public Criteria andAttackRateIsNotNull() {
            addCriterion("attack_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAttackRateEqualTo(String value) {
            addCriterion("attack_rate =", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateNotEqualTo(String value) {
            addCriterion("attack_rate <>", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateGreaterThan(String value) {
            addCriterion("attack_rate >", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateGreaterThanOrEqualTo(String value) {
            addCriterion("attack_rate >=", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateLessThan(String value) {
            addCriterion("attack_rate <", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateLessThanOrEqualTo(String value) {
            addCriterion("attack_rate <=", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateLike(String value) {
            addCriterion("attack_rate like", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateNotLike(String value) {
            addCriterion("attack_rate not like", value, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateIn(List<String> values) {
            addCriterion("attack_rate in", values, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateNotIn(List<String> values) {
            addCriterion("attack_rate not in", values, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateBetween(String value1, String value2) {
            addCriterion("attack_rate between", value1, value2, "attackRate");
            return (Criteria) this;
        }

        public Criteria andAttackRateNotBetween(String value1, String value2) {
            addCriterion("attack_rate not between", value1, value2, "attackRate");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(String value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(String value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(String value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(String value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(String value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLike(String value) {
            addCriterion("speed like", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotLike(String value) {
            addCriterion("speed not like", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<String> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<String> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(String value1, String value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(String value1, String value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationIsNull() {
            addCriterion("attack_animation is null");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationIsNotNull() {
            addCriterion("attack_animation is not null");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationEqualTo(String value) {
            addCriterion("attack_animation =", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationNotEqualTo(String value) {
            addCriterion("attack_animation <>", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationGreaterThan(String value) {
            addCriterion("attack_animation >", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationGreaterThanOrEqualTo(String value) {
            addCriterion("attack_animation >=", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationLessThan(String value) {
            addCriterion("attack_animation <", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationLessThanOrEqualTo(String value) {
            addCriterion("attack_animation <=", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationLike(String value) {
            addCriterion("attack_animation like", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationNotLike(String value) {
            addCriterion("attack_animation not like", value, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationIn(List<String> values) {
            addCriterion("attack_animation in", values, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationNotIn(List<String> values) {
            addCriterion("attack_animation not in", values, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationBetween(String value1, String value2) {
            addCriterion("attack_animation between", value1, value2, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackAnimationNotBetween(String value1, String value2) {
            addCriterion("attack_animation not between", value1, value2, "attackAnimation");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceIsNull() {
            addCriterion("attack_distance is null");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceIsNotNull() {
            addCriterion("attack_distance is not null");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceEqualTo(String value) {
            addCriterion("attack_distance =", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceNotEqualTo(String value) {
            addCriterion("attack_distance <>", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceGreaterThan(String value) {
            addCriterion("attack_distance >", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("attack_distance >=", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceLessThan(String value) {
            addCriterion("attack_distance <", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceLessThanOrEqualTo(String value) {
            addCriterion("attack_distance <=", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceLike(String value) {
            addCriterion("attack_distance like", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceNotLike(String value) {
            addCriterion("attack_distance not like", value, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceIn(List<String> values) {
            addCriterion("attack_distance in", values, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceNotIn(List<String> values) {
            addCriterion("attack_distance not in", values, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceBetween(String value1, String value2) {
            addCriterion("attack_distance between", value1, value2, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andAttackDistanceNotBetween(String value1, String value2) {
            addCriterion("attack_distance not between", value1, value2, "attackDistance");
            return (Criteria) this;
        }

        public Criteria andCooldownIsNull() {
            addCriterion("cooldown is null");
            return (Criteria) this;
        }

        public Criteria andCooldownIsNotNull() {
            addCriterion("cooldown is not null");
            return (Criteria) this;
        }

        public Criteria andCooldownEqualTo(String value) {
            addCriterion("cooldown =", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownNotEqualTo(String value) {
            addCriterion("cooldown <>", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownGreaterThan(String value) {
            addCriterion("cooldown >", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownGreaterThanOrEqualTo(String value) {
            addCriterion("cooldown >=", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownLessThan(String value) {
            addCriterion("cooldown <", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownLessThanOrEqualTo(String value) {
            addCriterion("cooldown <=", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownLike(String value) {
            addCriterion("cooldown like", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownNotLike(String value) {
            addCriterion("cooldown not like", value, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownIn(List<String> values) {
            addCriterion("cooldown in", values, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownNotIn(List<String> values) {
            addCriterion("cooldown not in", values, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownBetween(String value1, String value2) {
            addCriterion("cooldown between", value1, value2, "cooldown");
            return (Criteria) this;
        }

        public Criteria andCooldownNotBetween(String value1, String value2) {
            addCriterion("cooldown not between", value1, value2, "cooldown");
            return (Criteria) this;
        }

        public Criteria andAttackTypeIsNull() {
            addCriterion("attack_type is null");
            return (Criteria) this;
        }

        public Criteria andAttackTypeIsNotNull() {
            addCriterion("attack_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttackTypeEqualTo(String value) {
            addCriterion("attack_type =", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeNotEqualTo(String value) {
            addCriterion("attack_type <>", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeGreaterThan(String value) {
            addCriterion("attack_type >", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("attack_type >=", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeLessThan(String value) {
            addCriterion("attack_type <", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeLessThanOrEqualTo(String value) {
            addCriterion("attack_type <=", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeLike(String value) {
            addCriterion("attack_type like", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeNotLike(String value) {
            addCriterion("attack_type not like", value, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeIn(List<String> values) {
            addCriterion("attack_type in", values, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeNotIn(List<String> values) {
            addCriterion("attack_type not in", values, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeBetween(String value1, String value2) {
            addCriterion("attack_type between", value1, value2, "attackType");
            return (Criteria) this;
        }

        public Criteria andAttackTypeNotBetween(String value1, String value2) {
            addCriterion("attack_type not between", value1, value2, "attackType");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(String value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(String value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(String value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(String value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(String value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(String value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLike(String value) {
            addCriterion("cost like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotLike(String value) {
            addCriterion("cost not like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<String> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<String> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(String value1, String value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(String value1, String value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCdIsNull() {
            addCriterion("CD is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("CD is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(String value) {
            addCriterion("CD =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(String value) {
            addCriterion("CD <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(String value) {
            addCriterion("CD >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(String value) {
            addCriterion("CD >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(String value) {
            addCriterion("CD <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(String value) {
            addCriterion("CD <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLike(String value) {
            addCriterion("CD like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotLike(String value) {
            addCriterion("CD not like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<String> values) {
            addCriterion("CD in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<String> values) {
            addCriterion("CD not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(String value1, String value2) {
            addCriterion("CD between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(String value1, String value2) {
            addCriterion("CD not between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andSkillIsNull() {
            addCriterion("skill is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion("skill is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(String value) {
            addCriterion("skill =", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(String value) {
            addCriterion("skill <>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(String value) {
            addCriterion("skill >", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(String value) {
            addCriterion("skill >=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(String value) {
            addCriterion("skill <", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(String value) {
            addCriterion("skill <=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLike(String value) {
            addCriterion("skill like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotLike(String value) {
            addCriterion("skill not like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<String> values) {
            addCriterion("skill in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<String> values) {
            addCriterion("skill not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(String value1, String value2) {
            addCriterion("skill between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(String value1, String value2) {
            addCriterion("skill not between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andGetConditionIsNull() {
            addCriterion("get_condition is null");
            return (Criteria) this;
        }

        public Criteria andGetConditionIsNotNull() {
            addCriterion("get_condition is not null");
            return (Criteria) this;
        }

        public Criteria andGetConditionEqualTo(String value) {
            addCriterion("get_condition =", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionNotEqualTo(String value) {
            addCriterion("get_condition <>", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionGreaterThan(String value) {
            addCriterion("get_condition >", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionGreaterThanOrEqualTo(String value) {
            addCriterion("get_condition >=", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionLessThan(String value) {
            addCriterion("get_condition <", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionLessThanOrEqualTo(String value) {
            addCriterion("get_condition <=", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionLike(String value) {
            addCriterion("get_condition like", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionNotLike(String value) {
            addCriterion("get_condition not like", value, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionIn(List<String> values) {
            addCriterion("get_condition in", values, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionNotIn(List<String> values) {
            addCriterion("get_condition not in", values, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionBetween(String value1, String value2) {
            addCriterion("get_condition between", value1, value2, "getCondition");
            return (Criteria) this;
        }

        public Criteria andGetConditionNotBetween(String value1, String value2) {
            addCriterion("get_condition not between", value1, value2, "getCondition");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyIsNull() {
            addCriterion("anti_enemy is null");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyIsNotNull() {
            addCriterion("anti_enemy is not null");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyEqualTo(String value) {
            addCriterion("anti_enemy =", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyNotEqualTo(String value) {
            addCriterion("anti_enemy <>", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyGreaterThan(String value) {
            addCriterion("anti_enemy >", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyGreaterThanOrEqualTo(String value) {
            addCriterion("anti_enemy >=", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyLessThan(String value) {
            addCriterion("anti_enemy <", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyLessThanOrEqualTo(String value) {
            addCriterion("anti_enemy <=", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyLike(String value) {
            addCriterion("anti_enemy like", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyNotLike(String value) {
            addCriterion("anti_enemy not like", value, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyIn(List<String> values) {
            addCriterion("anti_enemy in", values, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyNotIn(List<String> values) {
            addCriterion("anti_enemy not in", values, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyBetween(String value1, String value2) {
            addCriterion("anti_enemy between", value1, value2, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyNotBetween(String value1, String value2) {
            addCriterion("anti_enemy not between", value1, value2, "antiEnemy");
            return (Criteria) this;
        }

        public Criteria andSkillTypeIsNull() {
            addCriterion("skill_type is null");
            return (Criteria) this;
        }

        public Criteria andSkillTypeIsNotNull() {
            addCriterion("skill_type is not null");
            return (Criteria) this;
        }

        public Criteria andSkillTypeEqualTo(String value) {
            addCriterion("skill_type =", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotEqualTo(String value) {
            addCriterion("skill_type <>", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeGreaterThan(String value) {
            addCriterion("skill_type >", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("skill_type >=", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeLessThan(String value) {
            addCriterion("skill_type <", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeLessThanOrEqualTo(String value) {
            addCriterion("skill_type <=", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeLike(String value) {
            addCriterion("skill_type like", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotLike(String value) {
            addCriterion("skill_type not like", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeIn(List<String> values) {
            addCriterion("skill_type in", values, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotIn(List<String> values) {
            addCriterion("skill_type not in", values, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeBetween(String value1, String value2) {
            addCriterion("skill_type between", value1, value2, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotBetween(String value1, String value2) {
            addCriterion("skill_type not between", value1, value2, "skillType");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeIsNull() {
            addCriterion("category_describe is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeIsNotNull() {
            addCriterion("category_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeEqualTo(String value) {
            addCriterion("category_describe =", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeNotEqualTo(String value) {
            addCriterion("category_describe <>", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeGreaterThan(String value) {
            addCriterion("category_describe >", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("category_describe >=", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeLessThan(String value) {
            addCriterion("category_describe <", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeLessThanOrEqualTo(String value) {
            addCriterion("category_describe <=", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeLike(String value) {
            addCriterion("category_describe like", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeNotLike(String value) {
            addCriterion("category_describe not like", value, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeIn(List<String> values) {
            addCriterion("category_describe in", values, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeNotIn(List<String> values) {
            addCriterion("category_describe not in", values, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeBetween(String value1, String value2) {
            addCriterion("category_describe between", value1, value2, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andCategoryDescribeNotBetween(String value1, String value2) {
            addCriterion("category_describe not between", value1, value2, "categoryDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeIsNull() {
            addCriterion("anti_enemy_describe is null");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeIsNotNull() {
            addCriterion("anti_enemy_describe is not null");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeEqualTo(String value) {
            addCriterion("anti_enemy_describe =", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeNotEqualTo(String value) {
            addCriterion("anti_enemy_describe <>", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeGreaterThan(String value) {
            addCriterion("anti_enemy_describe >", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("anti_enemy_describe >=", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeLessThan(String value) {
            addCriterion("anti_enemy_describe <", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeLessThanOrEqualTo(String value) {
            addCriterion("anti_enemy_describe <=", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeLike(String value) {
            addCriterion("anti_enemy_describe like", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeNotLike(String value) {
            addCriterion("anti_enemy_describe not like", value, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeIn(List<String> values) {
            addCriterion("anti_enemy_describe in", values, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeNotIn(List<String> values) {
            addCriterion("anti_enemy_describe not in", values, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeBetween(String value1, String value2) {
            addCriterion("anti_enemy_describe between", value1, value2, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andAntiEnemyDescribeNotBetween(String value1, String value2) {
            addCriterion("anti_enemy_describe not between", value1, value2, "antiEnemyDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeIsNull() {
            addCriterion("skill_type_describe is null");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeIsNotNull() {
            addCriterion("skill_type_describe is not null");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeEqualTo(String value) {
            addCriterion("skill_type_describe =", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeNotEqualTo(String value) {
            addCriterion("skill_type_describe <>", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeGreaterThan(String value) {
            addCriterion("skill_type_describe >", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("skill_type_describe >=", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeLessThan(String value) {
            addCriterion("skill_type_describe <", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeLessThanOrEqualTo(String value) {
            addCriterion("skill_type_describe <=", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeLike(String value) {
            addCriterion("skill_type_describe like", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeNotLike(String value) {
            addCriterion("skill_type_describe not like", value, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeIn(List<String> values) {
            addCriterion("skill_type_describe in", values, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeNotIn(List<String> values) {
            addCriterion("skill_type_describe not in", values, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeBetween(String value1, String value2) {
            addCriterion("skill_type_describe between", value1, value2, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andSkillTypeDescribeNotBetween(String value1, String value2) {
            addCriterion("skill_type_describe not between", value1, value2, "skillTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andAttackLevelIsNull() {
            addCriterion("attack_level is null");
            return (Criteria) this;
        }

        public Criteria andAttackLevelIsNotNull() {
            addCriterion("attack_level is not null");
            return (Criteria) this;
        }

        public Criteria andAttackLevelEqualTo(Integer value) {
            addCriterion("attack_level =", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelNotEqualTo(Integer value) {
            addCriterion("attack_level <>", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelGreaterThan(Integer value) {
            addCriterion("attack_level >", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("attack_level >=", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelLessThan(Integer value) {
            addCriterion("attack_level <", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelLessThanOrEqualTo(Integer value) {
            addCriterion("attack_level <=", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelIn(List<Integer> values) {
            addCriterion("attack_level in", values, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelNotIn(List<Integer> values) {
            addCriterion("attack_level not in", values, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelBetween(Integer value1, Integer value2) {
            addCriterion("attack_level between", value1, value2, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("attack_level not between", value1, value2, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeIsNull() {
            addCriterion("attack_before is null");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeIsNotNull() {
            addCriterion("attack_before is not null");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeEqualTo(Float value) {
            addCriterion("attack_before =", value, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeNotEqualTo(Float value) {
            addCriterion("attack_before <>", value, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeGreaterThan(Float value) {
            addCriterion("attack_before >", value, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeGreaterThanOrEqualTo(Float value) {
            addCriterion("attack_before >=", value, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeLessThan(Float value) {
            addCriterion("attack_before <", value, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeLessThanOrEqualTo(Float value) {
            addCriterion("attack_before <=", value, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeIn(List<Float> values) {
            addCriterion("attack_before in", values, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeNotIn(List<Float> values) {
            addCriterion("attack_before not in", values, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeBetween(Float value1, Float value2) {
            addCriterion("attack_before between", value1, value2, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackBeforeNotBetween(Float value1, Float value2) {
            addCriterion("attack_before not between", value1, value2, "attackBefore");
            return (Criteria) this;
        }

        public Criteria andAttackAfterIsNull() {
            addCriterion("attack_after is null");
            return (Criteria) this;
        }

        public Criteria andAttackAfterIsNotNull() {
            addCriterion("attack_after is not null");
            return (Criteria) this;
        }

        public Criteria andAttackAfterEqualTo(Float value) {
            addCriterion("attack_after =", value, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterNotEqualTo(Float value) {
            addCriterion("attack_after <>", value, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterGreaterThan(Float value) {
            addCriterion("attack_after >", value, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterGreaterThanOrEqualTo(Float value) {
            addCriterion("attack_after >=", value, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterLessThan(Float value) {
            addCriterion("attack_after <", value, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterLessThanOrEqualTo(Float value) {
            addCriterion("attack_after <=", value, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterIn(List<Float> values) {
            addCriterion("attack_after in", values, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterNotIn(List<Float> values) {
            addCriterion("attack_after not in", values, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterBetween(Float value1, Float value2) {
            addCriterion("attack_after between", value1, value2, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andAttackAfterNotBetween(Float value1, Float value2) {
            addCriterion("attack_after not between", value1, value2, "attackAfter");
            return (Criteria) this;
        }

        public Criteria andHpLevelIsNull() {
            addCriterion("HP_level is null");
            return (Criteria) this;
        }

        public Criteria andHpLevelIsNotNull() {
            addCriterion("HP_level is not null");
            return (Criteria) this;
        }

        public Criteria andHpLevelEqualTo(Integer value) {
            addCriterion("HP_level =", value, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelNotEqualTo(Integer value) {
            addCriterion("HP_level <>", value, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelGreaterThan(Integer value) {
            addCriterion("HP_level >", value, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("HP_level >=", value, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelLessThan(Integer value) {
            addCriterion("HP_level <", value, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelLessThanOrEqualTo(Integer value) {
            addCriterion("HP_level <=", value, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelIn(List<Integer> values) {
            addCriterion("HP_level in", values, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelNotIn(List<Integer> values) {
            addCriterion("HP_level not in", values, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelBetween(Integer value1, Integer value2) {
            addCriterion("HP_level between", value1, value2, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("HP_level not between", value1, value2, "hpLevel");
            return (Criteria) this;
        }

        public Criteria andHpBeforeIsNull() {
            addCriterion("HP_before is null");
            return (Criteria) this;
        }

        public Criteria andHpBeforeIsNotNull() {
            addCriterion("HP_before is not null");
            return (Criteria) this;
        }

        public Criteria andHpBeforeEqualTo(Float value) {
            addCriterion("HP_before =", value, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeNotEqualTo(Float value) {
            addCriterion("HP_before <>", value, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeGreaterThan(Float value) {
            addCriterion("HP_before >", value, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeGreaterThanOrEqualTo(Float value) {
            addCriterion("HP_before >=", value, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeLessThan(Float value) {
            addCriterion("HP_before <", value, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeLessThanOrEqualTo(Float value) {
            addCriterion("HP_before <=", value, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeIn(List<Float> values) {
            addCriterion("HP_before in", values, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeNotIn(List<Float> values) {
            addCriterion("HP_before not in", values, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeBetween(Float value1, Float value2) {
            addCriterion("HP_before between", value1, value2, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpBeforeNotBetween(Float value1, Float value2) {
            addCriterion("HP_before not between", value1, value2, "hpBefore");
            return (Criteria) this;
        }

        public Criteria andHpAfterIsNull() {
            addCriterion("HP_after is null");
            return (Criteria) this;
        }

        public Criteria andHpAfterIsNotNull() {
            addCriterion("HP_after is not null");
            return (Criteria) this;
        }

        public Criteria andHpAfterEqualTo(Float value) {
            addCriterion("HP_after =", value, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterNotEqualTo(Float value) {
            addCriterion("HP_after <>", value, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterGreaterThan(Float value) {
            addCriterion("HP_after >", value, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterGreaterThanOrEqualTo(Float value) {
            addCriterion("HP_after >=", value, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterLessThan(Float value) {
            addCriterion("HP_after <", value, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterLessThanOrEqualTo(Float value) {
            addCriterion("HP_after <=", value, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterIn(List<Float> values) {
            addCriterion("HP_after in", values, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterNotIn(List<Float> values) {
            addCriterion("HP_after not in", values, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterBetween(Float value1, Float value2) {
            addCriterion("HP_after between", value1, value2, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andHpAfterNotBetween(Float value1, Float value2) {
            addCriterion("HP_after not between", value1, value2, "hpAfter");
            return (Criteria) this;
        }

        public Criteria andBasicAttackIsNull() {
            addCriterion("basic_attack is null");
            return (Criteria) this;
        }

        public Criteria andBasicAttackIsNotNull() {
            addCriterion("basic_attack is not null");
            return (Criteria) this;
        }

        public Criteria andBasicAttackEqualTo(Float value) {
            addCriterion("basic_attack =", value, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackNotEqualTo(Float value) {
            addCriterion("basic_attack <>", value, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackGreaterThan(Float value) {
            addCriterion("basic_attack >", value, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackGreaterThanOrEqualTo(Float value) {
            addCriterion("basic_attack >=", value, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackLessThan(Float value) {
            addCriterion("basic_attack <", value, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackLessThanOrEqualTo(Float value) {
            addCriterion("basic_attack <=", value, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackIn(List<Float> values) {
            addCriterion("basic_attack in", values, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackNotIn(List<Float> values) {
            addCriterion("basic_attack not in", values, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackBetween(Float value1, Float value2) {
            addCriterion("basic_attack between", value1, value2, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicAttackNotBetween(Float value1, Float value2) {
            addCriterion("basic_attack not between", value1, value2, "basicAttack");
            return (Criteria) this;
        }

        public Criteria andBasicHpIsNull() {
            addCriterion("basic_HP is null");
            return (Criteria) this;
        }

        public Criteria andBasicHpIsNotNull() {
            addCriterion("basic_HP is not null");
            return (Criteria) this;
        }

        public Criteria andBasicHpEqualTo(Float value) {
            addCriterion("basic_HP =", value, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpNotEqualTo(Float value) {
            addCriterion("basic_HP <>", value, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpGreaterThan(Float value) {
            addCriterion("basic_HP >", value, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpGreaterThanOrEqualTo(Float value) {
            addCriterion("basic_HP >=", value, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpLessThan(Float value) {
            addCriterion("basic_HP <", value, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpLessThanOrEqualTo(Float value) {
            addCriterion("basic_HP <=", value, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpIn(List<Float> values) {
            addCriterion("basic_HP in", values, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpNotIn(List<Float> values) {
            addCriterion("basic_HP not in", values, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpBetween(Float value1, Float value2) {
            addCriterion("basic_HP between", value1, value2, "basicHp");
            return (Criteria) this;
        }

        public Criteria andBasicHpNotBetween(Float value1, Float value2) {
            addCriterion("basic_HP not between", value1, value2, "basicHp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}