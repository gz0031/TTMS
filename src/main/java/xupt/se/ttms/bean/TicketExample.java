package xupt.se.ttms.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Integer value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Integer value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Integer value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Integer value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Integer> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Integer> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andSeatRowIsNull() {
            addCriterion("seat_row is null");
            return (Criteria) this;
        }

        public Criteria andSeatRowIsNotNull() {
            addCriterion("seat_row is not null");
            return (Criteria) this;
        }

        public Criteria andSeatRowEqualTo(Integer value) {
            addCriterion("seat_row =", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotEqualTo(Integer value) {
            addCriterion("seat_row <>", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThan(Integer value) {
            addCriterion("seat_row >", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_row >=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThan(Integer value) {
            addCriterion("seat_row <", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThanOrEqualTo(Integer value) {
            addCriterion("seat_row <=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowIn(List<Integer> values) {
            addCriterion("seat_row in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotIn(List<Integer> values) {
            addCriterion("seat_row not in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowBetween(Integer value1, Integer value2) {
            addCriterion("seat_row between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_row not between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatColIsNull() {
            addCriterion("seat_col is null");
            return (Criteria) this;
        }

        public Criteria andSeatColIsNotNull() {
            addCriterion("seat_col is not null");
            return (Criteria) this;
        }

        public Criteria andSeatColEqualTo(Integer value) {
            addCriterion("seat_col =", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColNotEqualTo(Integer value) {
            addCriterion("seat_col <>", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColGreaterThan(Integer value) {
            addCriterion("seat_col >", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_col >=", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColLessThan(Integer value) {
            addCriterion("seat_col <", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColLessThanOrEqualTo(Integer value) {
            addCriterion("seat_col <=", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColIn(List<Integer> values) {
            addCriterion("seat_col in", values, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColNotIn(List<Integer> values) {
            addCriterion("seat_col not in", values, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColBetween(Integer value1, Integer value2) {
            addCriterion("seat_col between", value1, value2, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_col not between", value1, value2, "seatCol");
            return (Criteria) this;
        }

        public Criteria andTicketTimeIsNull() {
            addCriterion("ticket_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketTimeIsNotNull() {
            addCriterion("ticket_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTimeEqualTo(Date value) {
            addCriterion("ticket_time =", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeNotEqualTo(Date value) {
            addCriterion("ticket_time <>", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeGreaterThan(Date value) {
            addCriterion("ticket_time >", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_time >=", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeLessThan(Date value) {
            addCriterion("ticket_time <", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_time <=", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeIn(List<Date> values) {
            addCriterion("ticket_time in", values, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeNotIn(List<Date> values) {
            addCriterion("ticket_time not in", values, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeBetween(Date value1, Date value2) {
            addCriterion("ticket_time between", value1, value2, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_time not between", value1, value2, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIsNull() {
            addCriterion("ticket_status is null");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIsNotNull() {
            addCriterion("ticket_status is not null");
            return (Criteria) this;
        }

        public Criteria andTicketStatusEqualTo(Integer value) {
            addCriterion("ticket_status =", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotEqualTo(Integer value) {
            addCriterion("ticket_status <>", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusGreaterThan(Integer value) {
            addCriterion("ticket_status >", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_status >=", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLessThan(Integer value) {
            addCriterion("ticket_status <", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_status <=", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIn(List<Integer> values) {
            addCriterion("ticket_status in", values, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotIn(List<Integer> values) {
            addCriterion("ticket_status not in", values, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusBetween(Integer value1, Integer value2) {
            addCriterion("ticket_status between", value1, value2, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_status not between", value1, value2, "ticketStatus");
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