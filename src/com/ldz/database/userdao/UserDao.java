package com.ldz.database.userdao;

import com.ldz.database.base.BaseDao;
import com.ldz.model.user.User;

public interface UserDao extends BaseDao{
	/*
	 * 按用户名密码查询
	 */
	User getBeanByNameAndPassword(User user);
}
