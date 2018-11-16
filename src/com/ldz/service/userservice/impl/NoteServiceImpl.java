package com.ldz.service.userservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.userdao.NoteDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.userservice.NoteService;

@Service
public class NoteServiceImpl extends BaseServiceImpl implements NoteService{
	public NoteDao getDao(){
		return (NoteDao)dao;
	}
	@Autowired
	public void setDao(NoteDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
