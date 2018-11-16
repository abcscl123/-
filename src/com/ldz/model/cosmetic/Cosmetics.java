package com.ldz.model.cosmetic;

import java.util.Date;
/*
 * ��ױƷ
 */
import java.util.Set;

import com.ldz.model.Entity;
import com.ldz.model.comment.Comment;
import com.ldz.model.test.Results;

public class Cosmetics implements Entity{
	// Ψһ��ʶ
	private Long id;
	// ��ױƷ����
	private String name;
	// ��ױƷ����
	private String describes;
	// �Ƿ��Ƽ�
	private boolean is_recommend;
	//�ϼ�ʱ��
	private Date time;
/*	//��������
	private int like_number;
*/
	// ��ױƷ����
	private Type type;
	// ��ױƷ����
	private Functions function;
	// ���Խ��
	private Results result;

	// һ�Զ� ͼƬ����
	private Set<Image> imageSet;
	// һ�Զ� ���ۼ���
	private Set<Comment> commentSet;
	// һ�Զ� ���޼���
	private Set<Like> likeSet;

	public Set<Comment> getCommentSet() {
		return commentSet;
	}

	public void setCommentSet(Set<Comment> commentSet) {
		this.commentSet = commentSet;
	}

	public Set<Like> getLikeSet() {
		return likeSet;
	}

	public void setLikeSet(Set<Like> likeSet) {
		this.likeSet = likeSet;
	}

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

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public boolean isIs_recommend() {
		return is_recommend;
	}

	public void setIs_recommend(boolean is_recommend) {
		this.is_recommend = is_recommend;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
/*
	public int getLike_number() {
		return like_number;
	}

	public void setLike_number(int like_number) {
		this.like_number = like_number;
	}*/

	public Functions getFunction() {
		return function;
	}

	public void setFunction(Functions function) {
		this.function = function;
	}

	public Results getResult() {
		return result;
	}

	public void setResult(Results result) {
		this.result = result;
	}

	public Set<Image> getImageSet() {
		return imageSet;
	}

	public void setImageSet(Set<Image> imageSet) {
		this.imageSet = imageSet;
	}

	public Cosmetics(Long id, String name, String describes, boolean is_recommend, Type type, Functions function,
			Results result, Set<Image> imageSet, Set<Comment> commentSet) {
		super();
		this.id = id;
		this.name = name;
		this.describes = describes;
		this.is_recommend = is_recommend;
		this.type = type;
		this.function = function;
		this.result = result;
		this.imageSet = imageSet;
		this.commentSet = commentSet;
	}

	public Cosmetics() {
		super();
	}

}
