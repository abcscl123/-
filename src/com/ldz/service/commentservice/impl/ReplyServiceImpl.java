package com.ldz.service.commentservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.commentdao.ReplyDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.commentservice.ReplyService;

@Service
public class ReplyServiceImpl extends BaseServiceImpl implements ReplyService{
	public ReplyDao getDao(){
		return (ReplyDao)dao;
	}
	@Autowired
	public void setDao(ReplyDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
