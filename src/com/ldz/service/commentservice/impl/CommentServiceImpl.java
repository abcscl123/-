package com.ldz.service.commentservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.commentdao.CommentDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.commentservice.CommentService;

@Service
public class CommentServiceImpl extends BaseServiceImpl implements CommentService{
	public CommentDao getDao(){
		return (CommentDao)dao;
	}
	@Autowired
	public void setDao(CommentDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
