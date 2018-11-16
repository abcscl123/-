package com.ldz.service.base;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;

public interface BaseService {
	/*
	 * 保存
	 */
	void save(Entity bean) throws Exception;
	
	/*
	 * 删除
	 */
	void delete(Entity bean) throws Exception;

	/*
	 * 更新
	 */
	void update(Entity bean) throws Exception;
	
	/*
	 * 按id查询
	 */
	Entity getBean(Long id) throws Exception;
	
	/*
	 * 查询全部
	 */
	List getBeanListByQuery(QueryBuilder query) throws Exception;
	
	/*
	 * 分页查询
	 */
	List getBeanListForPageByQuery(QueryBuilder query) throws Exception;
}
