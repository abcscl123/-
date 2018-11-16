package com.ldz.service.cosmeticservice.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.cosmeticdao.LikeDao;
import com.ldz.model.cosmetic.Like;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.cosmeticservice.LikeService;

@Service
public class LikeServiceImpl extends BaseServiceImpl implements LikeService{
	public LikeDao getDao(){
		return (LikeDao)dao;
	}
	@Autowired
	public void setDao(LikeDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
	@Override
	public List<Like> getBeanByUserAndCosmetics(Long user_id, Long Cosmetic_id) throws Exception {
		return getDao().getBeanByUserAndCosmetics(user_id, Cosmetic_id);
	}
}
