package com.ldz.model.test;

import java.util.Set;

import com.ldz.model.Entity;
import com.ldz.model.cosmetic.Cosmetics;

/*
 * 测试结果
 */
public class Results implements Entity{
	// 唯一标识
	private Long id;
	// 最高分
	private int highest_score;
	// 最低分
	private int minimum_score;
	// 答案
	private String answer;
	// 美容建议
	private String proposal;

	// 套数
	private Number number;

	// 化妆品
	private Set<Cosmetics> cosmeticsSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHighest_score() {
		return highest_score;
	}

	public void setHighest_score(int highest_score) {
		this.highest_score = highest_score;
	}

	public int getMinimum_score() {
		return minimum_score;
	}

	public void setMinimum_score(int minimum_score) {
		this.minimum_score = minimum_score;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getProposal() {
		return proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Set<Cosmetics> getCosmeticsSet() {
		return cosmeticsSet;
	}

	public void setCosmeticsSet(Set<Cosmetics> cosmeticsSet) {
		this.cosmeticsSet = cosmeticsSet;
	}

	public Results(Long id, int highest_score, int minimum_score, String answer, String proposal, Number number,
			Set<Cosmetics> cosmeticsSet) {
		super();
		this.id = id;
		this.highest_score = highest_score;
		this.minimum_score = minimum_score;
		this.answer = answer;
		this.proposal = proposal;
		this.number = number;
		this.cosmeticsSet = cosmeticsSet;
	}

	public Results() {
		super();
	}

}
