package com.ldz.service.userservice;

import com.ldz.model.user.User;
import com.ldz.service.base.BaseService;

public interface UserService extends BaseService{
	/*
	 * ���û��������ѯ
	 */
	User getBeanByNameAndPassword(User user);
}
