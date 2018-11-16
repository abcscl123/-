package com.ldz.database.testdao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.testdao.NumberDao;
import com.ldz.model.test.Number;

@Repository
public class NumberDaoImpl extends BaseDaoImpl implements NumberDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Number.class;
	}

	@Override
	public List<Number> getBeanByShow() throws Exception {
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from test_number where is_show='1'";
		SQLQuery sqlQuery = session.createSQLQuery(sql.toString()).addEntity(getEntityClass());
		List<Number> result = sqlQuery.list();
		return result;
	}
	
}
