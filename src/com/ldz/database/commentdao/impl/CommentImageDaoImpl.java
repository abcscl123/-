package com.ldz.database.commentdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.commentdao.CommentImageDao;
import com.ldz.model.Entity;
import com.ldz.model.comment.Image;

@Repository
public class CommentImageDaoImpl extends BaseDaoImpl implements CommentImageDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Image.class;
	}
	
}
