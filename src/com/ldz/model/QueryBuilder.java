package com.ldz.model;

public class QueryBuilder {
	// �Ƿ��ѯһ�� true����ѯȫ�� false����ѯalias��ֵ
	public boolean countMode = true;
	// ��ѯ����
	public String alias = null;

	// ��ѯ����
	public String tableName = null;

	// �Ƿ�����   true������ false��������
	public boolean orderMode = false;
	// �����ֶ�
	public String orderColimn = null;
	// ����ASC ����DESC
	public String orderSort = null;
	public static final String ORDER_ASC = "ASC";
	public static final String ORDER_DESC = "DESC";

	// �Ƿ��ҳ    true����ҳ    false������ҳ
	public boolean pageMode = false;
	// ��ѯ���� ��һ�� ���һ��
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
