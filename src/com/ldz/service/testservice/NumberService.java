package com.ldz.service.testservice;

import java.util.List;

import com.ldz.service.base.BaseService;

public interface NumberService extends BaseService{
	/*
	 * �Ƿ���ʾ
	 */
	List<com.ldz.model.test.Number> getBeanByShow() throws Exception;
}
