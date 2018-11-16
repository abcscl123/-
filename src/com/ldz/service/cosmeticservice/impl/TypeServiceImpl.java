package com.ldz.service.cosmeticservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.cosmeticdao.TypeDao;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.cosmeticservice.TypeService;

@Service
public class TypeServiceImpl extends BaseServiceImpl implements TypeService{
	public TypeDao getDao(){
		return (TypeDao)dao;
	}
	@Autowired
	public void setDao(TypeDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
}
