package com.ldz.database.commentdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.commentdao.ReplyDao;
import com.ldz.model.comment.Reply;

@Repository
public class ReplyDaoImpl extends BaseDaoImpl implements ReplyDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Reply.class;
	}
	
}
