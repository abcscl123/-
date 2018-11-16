package com.ldz.database.cosmeticdao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.cosmeticdao.LikeDao;
import com.ldz.model.cosmetic.Like;

@Repository
public class LikeDaoImpl extends BaseDaoImpl implements LikeDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Like.class;
	}

	@Override
	public List<Like> getBeanByUserAndCosmetics(Long user_id, Long Cosmetic_id)  throws Exception{
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from cosmetic_like where cosmetics_id='"+ Cosmetic_id +"' and user_id='"+ user_id +"'";
		return session.createSQLQuery(sql).addEntity(getEntityClass()).list();
	}
	
}
