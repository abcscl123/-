package com.ldz.service.userservice.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.userdao.UserDao;
import com.ldz.model.user.User;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.userservice.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService{
	public UserDao getDao(){
		return (UserDao)dao;
	}
	@Autowired
	public void setDao(UserDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
	@Override
	public User getBeanByNameAndPassword(User user) {
		return getDao().getBeanByNameAndPassword(user);
	}
}
