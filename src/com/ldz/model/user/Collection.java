package com.ldz.model.user;

/*
 * �ղرʼ�
 */
import java.util.Date;

import com.ldz.model.Entity;

public class Collection implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ����
	private String note_title;
	// ����
	private String note_author;
	// �ղ�ʱ��
	private Date time;

	// �û�
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNote_title() {
		return note_title;
	}

	public void setNote_title(String note_title) {
		this.note_title = note_title;
	}

	public String getNote_author() {
		return note_author;
	}

	public void setNote_author(String note_author) {
		this.note_author = note_author;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection(Long id, String note_title, String note_author, Date time, User user) {
		super();
		this.id = id;
		this.note_title = note_title;
		this.note_author = note_author;
		this.time = time;
		this.user = user;
	}

	public Collection() {
		super();
	}

}
