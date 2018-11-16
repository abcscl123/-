package com.ldz.model.test;

import com.ldz.model.Entity;

/*
 * ���������
 */
public class Answer implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ��
	private String answer;
	// ��ֵ
	private int score;
	//ѡ��
	private String options;

	// ����
	private Problem problem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public Answer(Long id, String answer, int score, Problem problem) {
		super();
		this.id = id;
		this.answer = answer;
		this.score = score;
		this.problem = problem;
	}

	public Answer() {
		super();
	}


}
