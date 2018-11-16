package com.ldz.database.testdao;

import java.util.List;

import com.ldz.database.base.BaseDao;

public interface NumberDao extends BaseDao{
	/*
	 *  «∑Òœ‘ æ
	 */
	List<com.ldz.model.test.Number> getBeanByShow() throws Exception;
}
