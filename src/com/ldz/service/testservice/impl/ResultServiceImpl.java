package com.ldz.service.testservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.testdao.ResultDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.testservice.ResultService;

@Service
public class ResultServiceImpl extends BaseServiceImpl implements ResultService{
	public ResultDao getDao(){
		return (ResultDao)dao;
	}
	@Autowired
	public void setDao(ResultDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
