package com.ldz.database.cosmeticdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.cosmeticdao.TypeDao;
import com.ldz.model.cosmetic.Type;

@Repository
public class TypeDaoImpl extends BaseDaoImpl implements TypeDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Type.class;
	}
	
}
