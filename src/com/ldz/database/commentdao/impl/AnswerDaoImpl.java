package com.ldz.database.commentdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.commentdao.CommentDao;
import com.ldz.model.comment.Comment;

@Repository
public class AnswerDaoImpl extends BaseDaoImpl implements CommentDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Comment.class;
	}
	
}
