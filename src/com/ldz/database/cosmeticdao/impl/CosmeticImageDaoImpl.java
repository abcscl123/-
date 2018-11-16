package com.ldz.database.cosmeticdao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.cosmeticdao.CosmeticImageDao;
import com.ldz.model.cosmetic.Image;

@Repository
public class CosmeticImageDaoImpl extends BaseDaoImpl implements CosmeticImageDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Image.class;
	}

	@Override
	public List<Image> getBeanListByCosmeticId(Image image) throws Exception {
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from cosmetic_image where cosmetics_id='"+ image.getId() +"'";
		return session.createSQLQuery(sql).addEntity(getEntityClass()).list();
	}
	
}
