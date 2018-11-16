package com.ldz.service.cosmeticservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.cosmeticdao.FunctionsDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.cosmeticservice.FunctionsService;

@Service
public class FunctionsServiceImpl extends BaseServiceImpl implements FunctionsService{
	public FunctionsDao getDao(){
		return (FunctionsDao)dao;
	}
	@Autowired
	public void setDao(FunctionsDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
