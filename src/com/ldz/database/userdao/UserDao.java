package com.ldz.database.userdao;

import com.ldz.database.base.BaseDao;
import com.ldz.model.user.User;

public interface UserDao extends BaseDao{
	/*
	 * ���û��������ѯ
	 */
	User getBeanByNameAndPassword(User user);
}
