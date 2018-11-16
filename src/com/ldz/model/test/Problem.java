package com.ldz.model.test;
/*
 * ��������
 */

import java.util.Set;

import com.ldz.model.Entity;

public class Problem implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ����
	private String problem;
	// ����
	private String type;

	// ����
	private Number number;

	// �����
	private Set<Answer> answerSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Set<Answer> getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(Set<Answer> answerSet) {
		this.answerSet = answerSet;
	}

	public Problem(Long id, String problem, String type, Number number, Set<Answer> answerSet) {
		super();
		this.id = id;
		this.problem = problem;
		this.type = type;
		this.number = number;
		this.answerSet = answerSet;
	}

	public Problem() {
		super();
	}

}
