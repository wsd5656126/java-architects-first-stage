package com.wusd.entity.gen;

import java.util.ArrayList;
import java.util.List;

public class VideoInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlIsNull() {
            addCriterion("video_html is null");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlIsNotNull() {
            addCriterion("video_html is not null");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlEqualTo(String value) {
            addCriterion("video_html =", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlNotEqualTo(String value) {
            addCriterion("video_html <>", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlGreaterThan(String value) {
            addCriterion("video_html >", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("video_html >=", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlLessThan(String value) {
            addCriterion("video_html <", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlLessThanOrEqualTo(String value) {
            addCriterion("video_html <=", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlLike(String value) {
            addCriterion("video_html like", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlNotLike(String value) {
            addCriterion("video_html not like", value, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlIn(List<String> values) {
            addCriterion("video_html in", values, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlNotIn(List<String> values) {
            addCriterion("video_html not in", values, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlBetween(String value1, String value2) {
            addCriterion("video_html between", value1, value2, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoHtmlNotBetween(String value1, String value2) {
            addCriterion("video_html not between", value1, value2, "videoHtml");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdIsNull() {
            addCriterion("video_type_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdIsNotNull() {
            addCriterion("video_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdEqualTo(Integer value) {
            addCriterion("video_type_id =", value, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdNotEqualTo(Integer value) {
            addCriterion("video_type_id <>", value, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdGreaterThan(Integer value) {
            addCriterion("video_type_id >", value, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_type_id >=", value, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdLessThan(Integer value) {
            addCriterion("video_type_id <", value, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("video_type_id <=", value, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdIn(List<Integer> values) {
            addCriterion("video_type_id in", values, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdNotIn(List<Integer> values) {
            addCriterion("video_type_id not in", values, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("video_type_id between", value1, value2, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("video_type_id not between", value1, value2, "videoTypeId");
            return (Criteria) this;
        }

        public Criteria andVideoDelIsNull() {
            addCriterion("video_del is null");
            return (Criteria) this;
        }

        public Criteria andVideoDelIsNotNull() {
            addCriterion("video_del is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDelEqualTo(Integer value) {
            addCriterion("video_del =", value, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelNotEqualTo(Integer value) {
            addCriterion("video_del <>", value, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelGreaterThan(Integer value) {
            addCriterion("video_del >", value, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_del >=", value, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelLessThan(Integer value) {
            addCriterion("video_del <", value, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelLessThanOrEqualTo(Integer value) {
            addCriterion("video_del <=", value, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelIn(List<Integer> values) {
            addCriterion("video_del in", values, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelNotIn(List<Integer> values) {
            addCriterion("video_del not in", values, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelBetween(Integer value1, Integer value2) {
            addCriterion("video_del between", value1, value2, "videoDel");
            return (Criteria) this;
        }

        public Criteria andVideoDelNotBetween(Integer value1, Integer value2) {
            addCriterion("video_del not between", value1, value2, "videoDel");
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