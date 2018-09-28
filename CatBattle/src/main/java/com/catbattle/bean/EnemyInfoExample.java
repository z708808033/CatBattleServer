package com.catbattle.bean;

import java.util.ArrayList;
import java.util.List;

public class EnemyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnemyInfoExample() {
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

        public Criteria andEnemyIdIsNull() {
            addCriterion("enemy_id is null");
            return (Criteria) this;
        }

        public Criteria andEnemyIdIsNotNull() {
            addCriterion("enemy_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnemyIdEqualTo(String value) {
            addCriterion("enemy_id =", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdNotEqualTo(String value) {
            addCriterion("enemy_id <>", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdGreaterThan(String value) {
            addCriterion("enemy_id >", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdGreaterThanOrEqualTo(String value) {
            addCriterion("enemy_id >=", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdLessThan(String value) {
            addCriterion("enemy_id <", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdLessThanOrEqualTo(String value) {
            addCriterion("enemy_id <=", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdLike(String value) {
            addCriterion("enemy_id like", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdNotLike(String value) {
            addCriterion("enemy_id not like", value, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdIn(List<String> values) {
            addCriterion("enemy_id in", values, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdNotIn(List<String> values) {
            addCriterion("enemy_id not in", values, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdBetween(String value1, String value2) {
            addCriterion("enemy_id between", value1, value2, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyIdNotBetween(String value1, String value2) {
            addCriterion("enemy_id not between", value1, value2, "enemyId");
            return (Criteria) this;
        }

        public Criteria andEnemyNameIsNull() {
            addCriterion("enemy_name is null");
            return (Criteria) this;
        }

        public Criteria andEnemyNameIsNotNull() {
            addCriterion("enemy_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnemyNameEqualTo(String value) {
            addCriterion("enemy_name =", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameNotEqualTo(String value) {
            addCriterion("enemy_name <>", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameGreaterThan(String value) {
            addCriterion("enemy_name >", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameGreaterThanOrEqualTo(String value) {
            addCriterion("enemy_name >=", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameLessThan(String value) {
            addCriterion("enemy_name <", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameLessThanOrEqualTo(String value) {
            addCriterion("enemy_name <=", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameLike(String value) {
            addCriterion("enemy_name like", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameNotLike(String value) {
            addCriterion("enemy_name not like", value, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameIn(List<String> values) {
            addCriterion("enemy_name in", values, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameNotIn(List<String> values) {
            addCriterion("enemy_name not in", values, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameBetween(String value1, String value2) {
            addCriterion("enemy_name between", value1, value2, "enemyName");
            return (Criteria) this;
        }

        public Criteria andEnemyNameNotBetween(String value1, String value2) {
            addCriterion("enemy_name not between", value1, value2, "enemyName");
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

        public Criteria andPowerUpRateIsNull() {
            addCriterion("power_up_rate is null");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateIsNotNull() {
            addCriterion("power_up_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateEqualTo(String value) {
            addCriterion("power_up_rate =", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateNotEqualTo(String value) {
            addCriterion("power_up_rate <>", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateGreaterThan(String value) {
            addCriterion("power_up_rate >", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateGreaterThanOrEqualTo(String value) {
            addCriterion("power_up_rate >=", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateLessThan(String value) {
            addCriterion("power_up_rate <", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateLessThanOrEqualTo(String value) {
            addCriterion("power_up_rate <=", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateLike(String value) {
            addCriterion("power_up_rate like", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateNotLike(String value) {
            addCriterion("power_up_rate not like", value, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateIn(List<String> values) {
            addCriterion("power_up_rate in", values, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateNotIn(List<String> values) {
            addCriterion("power_up_rate not in", values, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateBetween(String value1, String value2) {
            addCriterion("power_up_rate between", value1, value2, "powerUpRate");
            return (Criteria) this;
        }

        public Criteria andPowerUpRateNotBetween(String value1, String value2) {
            addCriterion("power_up_rate not between", value1, value2, "powerUpRate");
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

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(String value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(String value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(String value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(String value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(String value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(String value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLike(String value) {
            addCriterion("reward like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotLike(String value) {
            addCriterion("reward not like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<String> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<String> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(String value1, String value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(String value1, String value2) {
            addCriterion("reward not between", value1, value2, "reward");
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