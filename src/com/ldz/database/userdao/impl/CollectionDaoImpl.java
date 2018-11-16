package com.ldz.database.userdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.userdao.CollectionDao;
import com.ldz.model.user.Collection;

@Repository
public class CollectionDaoImpl extends BaseDaoImpl implements CollectionDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Collection.class;
	}
	
}
