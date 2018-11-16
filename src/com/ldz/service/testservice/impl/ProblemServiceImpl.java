package com.ldz.service.testservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.testdao.ProblemDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.testservice.ProblemService;

@Service
public class ProblemServiceImpl extends BaseServiceImpl implements ProblemService{
	public ProblemDao getDao(){
		return (ProblemDao)dao;
	}
	@Autowired
	public void setDao(ProblemDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
