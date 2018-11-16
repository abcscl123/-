package com.ldz.model.user;

import com.ldz.model.Entity;

/*
 * �û��ʼ�
 */
public class Note implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ����
	private String title;
	// Ȩ��
	private String type;

	// �û�
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Note(Long id, String title, String type, User user) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.user = user;
	}

	public Note() {
		super();
	}

}
