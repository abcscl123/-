package com.ldz.model.comment;

import java.util.Date;
import java.util.Set;

import com.ldz.model.Entity;
import com.ldz.model.cosmetic.Cosmetics;
import com.ldz.model.user.User;

/*
 * ����
 */
public class Comment implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ����
	private String content;
	// ����ʱ��
	private Date time;
	// ������
	private int like_number;

	// �û�
	private User user;
	// ��ױƷ
	private Cosmetics cosmetics;

	// һ�Զ� �ظ�
	private Set<Reply> replySet;
	// һ�Զ� ͼƬ
	private Set<Image> imageSet;

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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getLike_number() {
		return like_number;
	}

	public void setLike_number(int like_number) {
		this.like_number = like_number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cosmetics getCosmetics() {
		return cosmetics;
	}

	public void setCosmetics(Cosmetics cosmetics) {
		this.cosmetics = cosmetics;
	}

	public Set<Reply> getReplySet() {
		return replySet;
	}

	public void setReplySet(Set<Reply> replySet) {
		this.replySet = replySet;
	}

	public Set<Image> getImageSet() {
		return imageSet;
	}

	public void setImageSet(Set<Image> imageSet) {
		this.imageSet = imageSet;
	}

	public Comment(Long id, String content, Date time, int like_number, User user, Cosmetics cosmetics,
			Set<Reply> replySet, Set<Image> imageSet) {
		super();
		this.id = id;
		this.content = content;
		this.time = time;
		this.like_number = like_number;
		this.user = user;
		this.cosmetics = cosmetics;
		this.replySet = replySet;
		this.imageSet = imageSet;
	}

	public Comment() {
		super();
	}

}
