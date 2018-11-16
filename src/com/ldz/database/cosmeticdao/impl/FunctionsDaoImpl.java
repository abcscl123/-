package com.ldz.database.cosmeticdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.cosmeticdao.FunctionsDao;
import com.ldz.model.cosmetic.Functions;

@Repository
public class FunctionsDaoImpl extends BaseDaoImpl implements FunctionsDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Functions.class;
	}
	
}
