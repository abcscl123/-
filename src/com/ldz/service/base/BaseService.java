package com.ldz.service.base;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;

public interface BaseService {
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
