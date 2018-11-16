package com.ldz.service.userservice;

import com.ldz.model.user.User;
import com.ldz.service.base.BaseService;

public interface UserService extends BaseService{
	/*
	 * 按用户名密码查询
	 */
	User getBeanByNameAndPassword(User user);
}
