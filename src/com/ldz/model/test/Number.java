package com.ldz.model.test;

import java.util.Set;

import com.ldz.model.Entity;

/*
 * ��������
 */
public class Number implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ����
	private String describes;
	//�Ƿ���ʾ��ҳ��
	private boolean is_show;

	// һ�Զ� ���Խ��
	private Set<Results> resultSet;
	// һ�Զ� ������Ŀ
	private Set<Problem> problemSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public boolean isIs_show() {
		return is_show;
	}

	public void setIs_show(boolean is_show) {
		this.is_show = is_show;
	}

	public Set<Results> getResultSet() {
		return resultSet;
	}

	public void setResultSet(Set<Results> resultSet) {
		this.resultSet = resultSet;
	}

	public Set<Problem> getProblemSet() {
		return problemSet;
	}

	public void setProblemSet(Set<Problem> problemSet) {
		this.problemSet = problemSet;
	}

	public Number(Long id, String describes, boolean is_show, Set<Results> resultSet, Set<Problem> problemSet) {
		super();
		this.id = id;
		this.describes = describes;
		this.is_show = is_show;
		this.resultSet = resultSet;
		this.problemSet = problemSet;
	}

	public Number() {
		super();
	}

}
