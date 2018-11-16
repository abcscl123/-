package com.ldz.database.testdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.testdao.ResultDao;
import com.ldz.model.test.Results;

@Repository
public class ResultDaoImpl extends BaseDaoImpl implements ResultDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Results.class;
	}
	
}
