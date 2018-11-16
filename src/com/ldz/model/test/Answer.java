package com.ldz.model.test;

import com.ldz.model.Entity;

/*
 * 测试问题答案
 */
public class Answer implements Entity{
	// 唯一标识
	private Long id;
	// 答案
	private String answer;
	// 分值
	private int score;
	//选项
	private String options;

	// 问题
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
