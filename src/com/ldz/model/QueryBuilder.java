package com.ldz.model;

public class QueryBuilder {
	// 是否查询一列 true：查询全部 false：查询alias的值
	public boolean countMode = true;
	// 查询列名
	public String alias = null;

	// 查询表名
	public String tableName = null;

	// 是否排序   true：排序 false：不排序
	public boolean orderMode = false;
	// 排序字段
	public String orderColimn = null;
	// 升序ASC 降序DESC
	public String orderSort = null;
	public static final String ORDER_ASC = "ASC";
	public static final String ORDER_DESC = "DESC";

	// 是否分页    true：分页    false：不分页
	public boolean pageMode = false;
	// 查询条数 第一条 最后一条
	public int firstResult = -1;
	public int lastResult = -1;

	public boolean getCountMode() {
		return countMode;
	}

	public void setCountMode(boolean countMode) {
		this.countMode = countMode;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getOrderColimn() {
		return orderColimn;
	}

	public void setOrderColimn(String orderColimn) {
		this.orderColimn = orderColimn;
	}

	public boolean isPageMode() {
		return pageMode;
	}

	public void setPageMode(boolean pageMode) {
		this.pageMode = pageMode;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public int getLastResult() {
		return lastResult;
	}

	public void setLastResult(int lastResult) {
		this.lastResult = lastResult;
	}

	public boolean isOrderMode() {
		return orderMode;
	}

	public void setOrderMode(boolean orderMode) {
		this.orderMode = orderMode;
	}

	public String getOrderSort() {
		return orderSort;
	}

	public void setOrderSort(String orderSort) {
		this.orderSort = orderSort;
	}

}
