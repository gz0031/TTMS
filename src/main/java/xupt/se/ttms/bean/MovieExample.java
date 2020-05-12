package xupt.se.ttms.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieImageIsNull() {
            addCriterion("movie_image is null");
            return (Criteria) this;
        }

        public Criteria andMovieImageIsNotNull() {
            addCriterion("movie_image is not null");
            return (Criteria) this;
        }

        public Criteria andMovieImageEqualTo(String value) {
            addCriterion("movie_image =", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageNotEqualTo(String value) {
            addCriterion("movie_image <>", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageGreaterThan(String value) {
            addCriterion("movie_image >", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageGreaterThanOrEqualTo(String value) {
            addCriterion("movie_image >=", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageLessThan(String value) {
            addCriterion("movie_image <", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageLessThanOrEqualTo(String value) {
            addCriterion("movie_image <=", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageLike(String value) {
            addCriterion("movie_image like", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageNotLike(String value) {
            addCriterion("movie_image not like", value, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageIn(List<String> values) {
            addCriterion("movie_image in", values, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageNotIn(List<String> values) {
            addCriterion("movie_image not in", values, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageBetween(String value1, String value2) {
            addCriterion("movie_image between", value1, value2, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieImageNotBetween(String value1, String value2) {
            addCriterion("movie_image not between", value1, value2, "movieImage");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNull() {
            addCriterion("movie_type is null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNotNull() {
            addCriterion("movie_type is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeEqualTo(String value) {
            addCriterion("movie_type =", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotEqualTo(String value) {
            addCriterion("movie_type <>", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThan(String value) {
            addCriterion("movie_type >", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThanOrEqualTo(String value) {
            addCriterion("movie_type >=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThan(String value) {
            addCriterion("movie_type <", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThanOrEqualTo(String value) {
            addCriterion("movie_type <=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLike(String value) {
            addCriterion("movie_type like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotLike(String value) {
            addCriterion("movie_type not like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIn(List<String> values) {
            addCriterion("movie_type in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotIn(List<String> values) {
            addCriterion("movie_type not in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeBetween(String value1, String value2) {
            addCriterion("movie_type between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotBetween(String value1, String value2) {
            addCriterion("movie_type not between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeIsNull() {
            addCriterion("movie_start_time is null");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeIsNotNull() {
            addCriterion("movie_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeEqualTo(Date value) {
            addCriterion("movie_start_time =", value, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeNotEqualTo(Date value) {
            addCriterion("movie_start_time <>", value, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeGreaterThan(Date value) {
            addCriterion("movie_start_time >", value, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_start_time >=", value, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeLessThan(Date value) {
            addCriterion("movie_start_time <", value, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("movie_start_time <=", value, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeIn(List<Date> values) {
            addCriterion("movie_start_time in", values, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeNotIn(List<Date> values) {
            addCriterion("movie_start_time not in", values, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeBetween(Date value1, Date value2) {
            addCriterion("movie_start_time between", value1, value2, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("movie_start_time not between", value1, value2, "movieStartTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeIsNull() {
            addCriterion("movie_end_time is null");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeIsNotNull() {
            addCriterion("movie_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeEqualTo(Date value) {
            addCriterion("movie_end_time =", value, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeNotEqualTo(Date value) {
            addCriterion("movie_end_time <>", value, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeGreaterThan(Date value) {
            addCriterion("movie_end_time >", value, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_end_time >=", value, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeLessThan(Date value) {
            addCriterion("movie_end_time <", value, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("movie_end_time <=", value, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeIn(List<Date> values) {
            addCriterion("movie_end_time in", values, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeNotIn(List<Date> values) {
            addCriterion("movie_end_time not in", values, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeBetween(Date value1, Date value2) {
            addCriterion("movie_end_time between", value1, value2, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("movie_end_time not between", value1, value2, "movieEndTime");
            return (Criteria) this;
        }

        public Criteria andMovieSaleIsNull() {
            addCriterion("movie_sale is null");
            return (Criteria) this;
        }

        public Criteria andMovieSaleIsNotNull() {
            addCriterion("movie_sale is not null");
            return (Criteria) this;
        }

        public Criteria andMovieSaleEqualTo(BigDecimal value) {
            addCriterion("movie_sale =", value, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleNotEqualTo(BigDecimal value) {
            addCriterion("movie_sale <>", value, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleGreaterThan(BigDecimal value) {
            addCriterion("movie_sale >", value, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("movie_sale >=", value, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleLessThan(BigDecimal value) {
            addCriterion("movie_sale <", value, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("movie_sale <=", value, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleIn(List<BigDecimal> values) {
            addCriterion("movie_sale in", values, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleNotIn(List<BigDecimal> values) {
            addCriterion("movie_sale not in", values, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("movie_sale between", value1, value2, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMovieSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("movie_sale not between", value1, value2, "movieSale");
            return (Criteria) this;
        }

        public Criteria andMoviePriceIsNull() {
            addCriterion("movie_price is null");
            return (Criteria) this;
        }

        public Criteria andMoviePriceIsNotNull() {
            addCriterion("movie_price is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePriceEqualTo(BigDecimal value) {
            addCriterion("movie_price =", value, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceNotEqualTo(BigDecimal value) {
            addCriterion("movie_price <>", value, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceGreaterThan(BigDecimal value) {
            addCriterion("movie_price >", value, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("movie_price >=", value, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceLessThan(BigDecimal value) {
            addCriterion("movie_price <", value, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("movie_price <=", value, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceIn(List<BigDecimal> values) {
            addCriterion("movie_price in", values, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceNotIn(List<BigDecimal> values) {
            addCriterion("movie_price not in", values, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("movie_price between", value1, value2, "moviePrice");
            return (Criteria) this;
        }

        public Criteria andMoviePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("movie_price not between", value1, value2, "moviePrice");
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