package com.ldz.database.base;

import java.util.List;

import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;

public interface BaseDao {
	/*
	 * ����
	 */
	void save(Entity bean) throws Exception;
	
	/*
	 * ɾ��
	 */
	void delete(Entity bean) throws Exception;

	/*
	 * ����
	 */
	void update(Entity bean) throws Exception;
	
	/*
	 * ��id��ѯ
	 */
	Entity getBean(Long id) throws Exception;
	
	/*
	 * ��ѯȫ��
	 */
	List getBeanListByQuery(QueryBuilder query) throws Exception;
	
	/*
	 * ��ҳ��ѯ
	 */
	List getBeanListForPageByQuery(QueryBuilder query) throws Exception;
	
}
