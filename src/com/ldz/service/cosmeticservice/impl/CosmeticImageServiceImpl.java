package com.ldz.service.cosmeticservice.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.ldz.database.cosmeticdao.CosmeticImageDao;
import com.ldz.model.cosmetic.Image;
import com.ldz.service.base.impl.BaseServiceImpl;
import com.ldz.service.cosmeticservice.CosmeticImageService;

@Service
public class CosmeticImageServiceImpl extends BaseServiceImpl implements CosmeticImageService{
	public CosmeticImageDao getDao(){
		return (CosmeticImageDao)dao;
	}
	@Autowired
	public void setDao(CosmeticImageDao dao){
		this.dao = dao;
	}
	
	public Session getSession(){
		Session session = ((HibernateDaoSupport) this.getDao()).getSessionFactory().openSession();
		return session;
	}
	@Override
	public List<Image> getBeanListByCosmeticId(Image image) throws Exception {
		return getDao().getBeanListByCosmeticId(image);
	}
}
