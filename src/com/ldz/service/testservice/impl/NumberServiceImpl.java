package com.ldz.service.testservice.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.testdao.NumberDao;
import com.ldz.model.QueryBuilder;
import com.ldz.model.test.Number;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.testservice.NumberService;

@Service
public class NumberServiceImpl extends BaseServiceImpl implements NumberService{
	public NumberDao getDao(){
		return (NumberDao)dao;
	}
	@Autowired
	public void setDao(NumberDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
	@Override
	public List<Number> getBeanByShow() throws Exception {
		return getDao().getBeanByShow();
	}
	
}
