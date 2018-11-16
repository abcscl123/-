package com.ldz.database.cosmeticdao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.cosmeticdao.CosmeticDao;
import com.ldz.model.cosmetic.Cosmetics;

@Repository
public class CosmeticDaoImpl extends BaseDaoImpl implements CosmeticDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Cosmetics.class;
	}

	@Override
	public List<Cosmetics> getBeanListByRecommend(boolean is_recommend) throws Exception{
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from cosmetic_cosmetics where is_recommend='"+ is_recommend +"' order by time desc limit 0,4";
		return session.createSQLQuery(sql).addEntity(getEntityClass()).list();
	}

	@Override
	public List<Cosmetics> getBeanListLikeName(String name) throws Exception {
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from cosmetic_cosmetics where name like'%"+ name +"%' order by time desc";
		return session.createSQLQuery(sql).addEntity(getEntityClass()).list();
	}

	@Override
	public List<Cosmetics> getBeanListByPage(int lastPage) throws Exception {
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from cosmetic_cosmetics limit 0,"+ lastPage +"";
		return session.createSQLQuery(sql).addEntity(getEntityClass()).list();
	}
	
}
