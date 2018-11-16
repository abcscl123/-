package com.ldz.model.user;

import java.util.Date;
import java.util.Set;

import com.ldz.model.Entity;
import com.ldz.model.comment.Comment;
import com.ldz.model.cosmetic.Like;
import com.ldz.model.test.Results;

/*
 * 用户 仅用于登录
 */
public class User implements Entity {
	// 唯一标识
	private Long id;
	// 用户名
	private String name;
	// 密码
	private String password;
	// 权限
	private String type;
	public static final String ADMIN = "admin";
	public static final String USER = "user";
	// 昵称
	private String nickname;
	// 手机号码
	private String phone;
	// 邮箱
	private String eamil;
	// 生日
	private Date birthday;
	// 性别 （1 表示男，0 表示女）
	private boolean sex;
	// 头像
	private String path;

	// 一对多 评论
	private Set<Comment> commentSet;
	// 一对多 收藏笔记
	private Set<Collection> collectionSet;
	// 一对多 笔记
	private Set<Note> noteSet;
	// 一对多 点赞
	private Set<Like> likeSet;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean getSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<Comment> getCommentSet() {
		return commentSet;
	}

	public void setCommentSet(Set<Comment> commentSet) {
		this.commentSet = commentSet;
	}

	public Set<Collection> getCollectionSet() {
		return collectionSet;
	}

	public void setCollectionSet(Set<Collection> collectionSet) {
		this.collectionSet = collectionSet;
	}

	public Set<Note> getNoteSet() {
		return noteSet;
	}

	public void setNoteSet(Set<Note> noteSet) {
		this.noteSet = noteSet;
	}

	public Set<Like> getLikeSet() {
		return likeSet;
	}

	public void setLikeSet(Set<Like> likeSet) {
		this.likeSet = likeSet;
	}

	public User(Long id, String name, String password, String type, String nickname, String phone, String eamil,
			Date birthday, boolean sex, Set<Comment> commentSet, Set<Collection> collectionSet, Set<Note> noteSet) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = type;
		this.nickname = nickname;
		this.phone = phone;
		this.eamil = eamil;
		this.birthday = birthday;
		this.sex = sex;
		this.commentSet = commentSet;
		this.collectionSet = collectionSet;
		this.noteSet = noteSet;
	}

	public User() {
		super();
	}
}
