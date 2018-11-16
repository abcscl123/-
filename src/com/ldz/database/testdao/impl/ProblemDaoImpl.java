package com.ldz.database.testdao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.testdao.ProblemDao;
import com.ldz.model.Entity;
import com.ldz.model.test.Problem;

@Repository
public class ProblemDaoImpl extends BaseDaoImpl implements ProblemDao{

	@Override
	public Class getEntityClass() throws Exception {
		return Problem.class;
	}
	
	@Override
	public Entity getBean(Long id) throws Exception {
		Session session = getSessionFactory().getCurrentSession();
		String sql = "select * from test_problem where id='"+ id +"'";
		SQLQuery sqlQuery = session.createSQLQuery(sql.toString()).addEntity(getEntityClass());
		List<Problem> result = sqlQuery.list();
		if(result.size() != 0){
			return result.get(0);
		} else {
			return super.getBean(id);
		}
	}
}
