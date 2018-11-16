package com.ldz.service.commentservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.commentdao.CommentImageDao;
import com.ldz.database.commentdao.impl.CommentImageDaoImpl;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.commentservice.CommentImageService;
import com.ldz.service.commentservice.CommentService;

@Service
public class CommentImageServiceImpl extends BaseServiceImpl implements CommentImageService{
	public CommentImageDao getDao(){
		return (CommentImageDao)dao;
	}
	@Autowired
	public void setDao(CommentImageDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
