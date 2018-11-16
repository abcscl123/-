package com.ldz.model.comment;

import com.ldz.model.Entity;

/*
 * 回复
 */
public class Reply implements Entity{
	// 唯一标识
	private Long id;
	// 回复内容
	private String content;
	// 用户名
	private String name;

	// 评论
	private Comment comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Reply(Long id, String content, String name, Comment comment) {
		super();
		this.id = id;
		this.content = content;
		this.name = name;
		this.comment = comment;
	}

	public Reply() {
		super();
	}

}
