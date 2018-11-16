package com.ldz.service.userservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.userdao.CollectionDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.userservice.CollectionService;

@Service
public class CollectionServiceImpl extends BaseServiceImpl implements CollectionService{
	public CollectionDao getDao(){
		return (CollectionDao)dao;
	}
	@Autowired
	public void setDao(CollectionDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
