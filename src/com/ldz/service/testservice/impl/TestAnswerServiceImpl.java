package com.ldz.service.testservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.testdao.TestAnswerDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.testservice.TestAnswerService;

@Service
public class TestAnswerServiceImpl extends BaseServiceImpl implements TestAnswerService{
	public TestAnswerDao getDao(){
		return (TestAnswerDao)dao;
	}
	@Autowired
	public void setDao(TestAnswerDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
