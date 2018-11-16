package com.ldz.model.user;

import com.ldz.model.Entity;

/*
 * 用户笔记
 */
public class Note implements Entity{
	// 唯一标识
	private Long id;
	// 标题
	private String title;
	// 权限
	private String type;

	// 用户
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
