package com.ldz.service.base.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldz.database.base.BaseDao;
import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.testdao.TestAnswerDao;
import com.ldz.database.testdao.impl.TestAnswerDaoImpl;
import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;
import com.ldz.service.base.BaseService;

@Service
public abstract class BaseServiceImpl implements BaseService{
	protected BaseDao dao;

	@Override
	public void save(Entity bean) throws Exception {
		dao.save(bean);
	}

	@Override
	public void delete(Entity bean) throws Exception {
		dao.delete(bean);
	}

	@Override
	public void update(Entity bean) throws Exception {
		dao.update(bean);
	}

	@Override
	public Entity getBean(Long id) throws Exception {
		return dao.getBean(id);
	}

	@Override
	public List getBeanListByQuery(QueryBuilder query) throws Exception {
		if(query == null){
			return null;
		}
		return dao.getBeanListByQuery(query);
	}

	@Override
	public List getBeanListForPageByQuery(QueryBuilder query) throws Exception {
		if(query == null){
			return null;
		}
		return dao.getBeanListForPageByQuery(query);
	}

}
