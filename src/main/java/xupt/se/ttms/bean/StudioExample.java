package xupt.se.ttms.bean;

import java.util.ArrayList;
import java.util.List;

public class StudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudioExample() {
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

        public Criteria andStudioIdIsNull() {
            addCriterion("studio_id is null");
            return (Criteria) this;
        }

        public Criteria andStudioIdIsNotNull() {
            addCriterion("studio_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudioIdEqualTo(Integer value) {
            addCriterion("studio_id =", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdNotEqualTo(Integer value) {
            addCriterion("studio_id <>", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdGreaterThan(Integer value) {
            addCriterion("studio_id >", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_id >=", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdLessThan(Integer value) {
            addCriterion("studio_id <", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdLessThanOrEqualTo(Integer value) {
            addCriterion("studio_id <=", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdIn(List<Integer> values) {
            addCriterion("studio_id in", values, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdNotIn(List<Integer> values) {
            addCriterion("studio_id not in", values, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdBetween(Integer value1, Integer value2) {
            addCriterion("studio_id between", value1, value2, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_id not between", value1, value2, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioNameIsNull() {
            addCriterion("studio_name is null");
            return (Criteria) this;
        }

        public Criteria andStudioNameIsNotNull() {
            addCriterion("studio_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudioNameEqualTo(String value) {
            addCriterion("studio_name =", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotEqualTo(String value) {
            addCriterion("studio_name <>", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameGreaterThan(String value) {
            addCriterion("studio_name >", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameGreaterThanOrEqualTo(String value) {
            addCriterion("studio_name >=", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLessThan(String value) {
            addCriterion("studio_name <", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLessThanOrEqualTo(String value) {
            addCriterion("studio_name <=", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLike(String value) {
            addCriterion("studio_name like", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotLike(String value) {
            addCriterion("studio_name not like", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameIn(List<String> values) {
            addCriterion("studio_name in", values, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotIn(List<String> values) {
            addCriterion("studio_name not in", values, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameBetween(String value1, String value2) {
            addCriterion("studio_name between", value1, value2, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotBetween(String value1, String value2) {
            addCriterion("studio_name not between", value1, value2, "studioName");
            return (Criteria) this;
        }

        public Criteria andRowcountIsNull() {
            addCriterion("rowCount is null");
            return (Criteria) this;
        }

        public Criteria andRowcountIsNotNull() {
            addCriterion("rowCount is not null");
            return (Criteria) this;
        }

        public Criteria andRowcountEqualTo(Integer value) {
            addCriterion("rowCount =", value, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountNotEqualTo(Integer value) {
            addCriterion("rowCount <>", value, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountGreaterThan(Integer value) {
            addCriterion("rowCount >", value, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rowCount >=", value, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountLessThan(Integer value) {
            addCriterion("rowCount <", value, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountLessThanOrEqualTo(Integer value) {
            addCriterion("rowCount <=", value, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountIn(List<Integer> values) {
            addCriterion("rowCount in", values, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountNotIn(List<Integer> values) {
            addCriterion("rowCount not in", values, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountBetween(Integer value1, Integer value2) {
            addCriterion("rowCount between", value1, value2, "rowcount");
            return (Criteria) this;
        }

        public Criteria andRowcountNotBetween(Integer value1, Integer value2) {
            addCriterion("rowCount not between", value1, value2, "rowcount");
            return (Criteria) this;
        }

        public Criteria andColcountIsNull() {
            addCriterion("colCount is null");
            return (Criteria) this;
        }

        public Criteria andColcountIsNotNull() {
            addCriterion("colCount is not null");
            return (Criteria) this;
        }

        public Criteria andColcountEqualTo(Integer value) {
            addCriterion("colCount =", value, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountNotEqualTo(Integer value) {
            addCriterion("colCount <>", value, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountGreaterThan(Integer value) {
            addCriterion("colCount >", value, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("colCount >=", value, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountLessThan(Integer value) {
            addCriterion("colCount <", value, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountLessThanOrEqualTo(Integer value) {
            addCriterion("colCount <=", value, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountIn(List<Integer> values) {
            addCriterion("colCount in", values, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountNotIn(List<Integer> values) {
            addCriterion("colCount not in", values, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountBetween(Integer value1, Integer value2) {
            addCriterion("colCount between", value1, value2, "colcount");
            return (Criteria) this;
        }

        public Criteria andColcountNotBetween(Integer value1, Integer value2) {
            addCriterion("colCount not between", value1, value2, "colcount");
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