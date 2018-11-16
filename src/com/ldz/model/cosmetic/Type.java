package com.ldz.model.cosmetic;

/*
 * 化妆品类型
 */
import java.util.Set;

import com.ldz.model.Entity;

public class Type implements Entity{
	// 唯一标识
	private Long id;
	// 化妆品类型名
	private String name;

	// 一对多 化妆品集合
	private Set<Cosmetics> cosmeticsSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Cosmetics> getCosmeticsSet() {
		return cosmeticsSet;
	}

	public void setCosmeticsSet(Set<Cosmetics> cosmeticsSet) {
		this.cosmeticsSet = cosmeticsSet;
	}

	public Type(Long id, String name, Set<Cosmetics> cosmeticsSet) {
		super();
		this.id = id;
		this.name = name;
		this.cosmeticsSet = cosmeticsSet;
	}

	public Type() {
		super();
	}

}
