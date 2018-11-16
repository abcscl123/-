package com.ldz.database.testdao.impl;

import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.testdao.TestAnswerDao;
import com.ldz.model.Entity;
import com.ldz.model.test.Answer;

@Repository
public class TestAnswerDaoImpl extends BaseDaoImpl implements TestAnswerDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Answer.class;
	}
	
}
