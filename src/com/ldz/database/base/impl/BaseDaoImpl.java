package com.ldz.database.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ldz.database.base.BaseDao;
import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;
import com.ldz.model.test.Answer;

@Transactional
@Repository
public abstract class BaseDaoImpl extends HibernateDaoSupport implements BaseDao{
	
	public abstract Class getEntityClass() throws Exception;
	
	@Resource(name = "sessionFactory") 
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void save(Entity bean) throws Exception {
		if (bean == null) {
			throw new Exception("save fail, bean is null");
		} else {
			getHibernateTemplate().save(bean);
			return;
		}
		
	}

	@Override
	public void delete(Entity bean) throws Exception {
		if (bean == null){
			throw new Exception("delete fail, bean is null");
		} else if (bean.getId() == null) {
			throw new Exception("delete fail, id is null");
		} else {
			getHibernateTemplate().delete(bean);
			return;
		}
		
	}

	@Override
	public void update(Entity bean) throws Exception {
		if (bean == null){
			throw new Exception("update fail, bean is null");
		} else if (bean.getId() == null){
			throw new Exception("update fail, id is null");
		} else {
			getHibernateTemplate().update(bean);
			return;
		}
		
	}

	@Override
	public Entity getBean(Long id) throws Exception {
		if (id == null)
			throw new Exception("search fail, id is null");
		Entity bean = null;
		Session session = getSessionFactory().getCurrentSession();
		try {
			/*bean = (Entity) session.get(getEntityClass(), id);*/
			bean = (Entity) getHibernateTemplate().get(getEntityClass(), id);
		} catch (Exception ex) {
			try {
			} catch (Exception e) {
				e.printStackTrace();
			}
			throw ex;
		}
		return bean;
	}

	@Override
	public List getBeanListByQuery(QueryBuilder query) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM ").append(query.tableName);
		
		Session session = getSessionFactory().openSession();
		List<Entity> result = null;
		try {
			SQLQuery sqlQuery = session.createSQLQuery(sql.toString()).addEntity(getEntityClass());
			result = sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			session.close();
		}
		
		return result;
	}
	
	@Override
	public List getBeanListForPageByQuery(QueryBuilder query) throws Exception{
		StringBuffer sql = new StringBuffer();
		if(query.countMode){
			sql.append("SELECT *");
		} else {
			sql.append("SELECT ");
			if(query.alias != null){
				sql.append(query.alias);
			}
		}
		
		sql.append(" FROM ");
		if(query.tableName != null){
			sql.append(query.tableName);
		} else {
			new Exception("no table name");
			return null;
		}
		
		if(query.orderMode && query.orderColimn != null){
			if(query.orderColimn != null){
				sql.append(" ORDER BY ").append(query.orderColimn);
			}
			if(query.orderSort != null){
				sql.append(" ").append(query.orderSort);
			}
		}
		
		if(query.isPageMode() && (query.firstResult != -1 || query.lastResult != -1)){
			sql.append(" LIMIT ");
			if(query.firstResult > 0){
				sql.append(query.firstResult).append(",");
			}
			if(query.lastResult > 0){
				sql.append(query.lastResult);
			}
		}
		
		System.out.println(sql);
		
		Session session = getSessionFactory().openSession();
		List<Entity> result = null;
		try {
			Query sqlQuery = session.createSQLQuery(sql.toString());//.addEntity(getEntityClass()); 加了之后按列查询失效
			result = sqlQuery.list();
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			session.close();
		}
		
		return result;
	}
}
