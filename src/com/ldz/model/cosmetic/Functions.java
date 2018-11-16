package com.ldz.model.cosmetic;

/*
 * ��ױƷ����
 */
import java.util.Set;

import com.ldz.model.Entity;

public class Functions implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ��ױƷ����
	private String functions;

	// һ�Զ� ��ױƷ����
	private Set<Cosmetics> cosmeticsSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFunctions() {
		return functions;
	}

	public void setFunctions(String functions) {
		this.functions = functions;
	}

	public Set<Cosmetics> getCosmeticsSet() {
		return cosmeticsSet;
	}

	public void setCosmeticsSet(Set<Cosmetics> cosmeticsSet) {
		this.cosmeticsSet = cosmeticsSet;
	}

	public Functions(Long id, String functions, Set<Cosmetics> cosmeticsSet) {
		super();
		this.id = id;
		this.functions = functions;
		this.cosmeticsSet = cosmeticsSet;
	}

	public Functions() {
		super();
	}

}
