package com.ldz.model.user;

import java.util.Date;
import java.util.Set;

import com.ldz.model.Entity;
import com.ldz.model.comment.Comment;
import com.ldz.model.cosmetic.Like;
import com.ldz.model.test.Results;

/*
 * �û� �����ڵ�¼
 */
public class User implements Entity {
	// Ψһ��ʶ
	private Long id;
	// �û���
	private String name;
	// ����
	private String password;
	// Ȩ��
	private String type;
	public static final String ADMIN = "admin";
	public static final String USER = "user";
	// �ǳ�
	private String nickname;
	// �ֻ�����
	private String phone;
	// ����
	private String eamil;
	// ����
	private Date birthday;
	// �Ա� ��1 ��ʾ�У�0 ��ʾŮ��
	private boolean sex;
	// ͷ��
	private String path;

	// һ�Զ� ����
	private Set<Comment> commentSet;
	// һ�Զ� �ղرʼ�
	private Set<Collection> collectionSet;
	// һ�Զ� �ʼ�
	private Set<Note> noteSet;
	// һ�Զ� ����
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
