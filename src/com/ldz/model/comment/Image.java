package com.ldz.model.comment;

import com.ldz.model.Entity;

/*
 * ����ͼƬ
 */
public class Image implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ·��
	private String path;

	// ����ͼƬ
	private Comment comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Image(Long id, String path, Comment comment) {
		super();
		this.id = id;
		this.path = path;
		this.comment = comment;
	}

	public Image() {
		super();
	}

}
