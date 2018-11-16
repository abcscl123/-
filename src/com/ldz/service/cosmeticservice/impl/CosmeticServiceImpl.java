package com.ldz.service.cosmeticservice.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.cosmeticdao.CosmeticDao;
import com.ldz.model.cosmetic.Cosmetics;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.cosmeticservice.CosmeticService;

@Service
public class CosmeticServiceImpl extends BaseServiceImpl implements CosmeticService{
	public CosmeticDao getDao(){
		return (CosmeticDao)dao;
	}
	@Autowired
	public void setDao(CosmeticDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
	@Override
	public List<Cosmetics> getBeanListByRecommend(boolean is_recommend) throws Exception {
		return getDao().getBeanListByRecommend(is_recommend);
	}
	@Override
	public List<Cosmetics> getBeanListLikeName(String name) throws Exception {
		return getDao().getBeanListLikeName(name);
	}
	@Override
	public List<Cosmetics> getBeanListByPage(int lastPage) throws Exception {
		return getDao().getBeanListByPage(lastPage);
	}
}
