package com.ldz.model.cosmetic;

/*
 * ��ױƷ����
 */
import java.util.Set;

import com.ldz.model.Entity;

public class Type implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ��ױƷ������
	private String name;

	// һ�Զ� ��ױƷ����
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
