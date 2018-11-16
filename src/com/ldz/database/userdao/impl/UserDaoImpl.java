package com.ldz.database.userdao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.userdao.CollectionDao;
import com.ldz.database.userdao.NoteDao;
import com.ldz.database.userdao.UserDao;
import com.ldz.model.user.Collection;
import com.ldz.model.user.Note;
import com.ldz.model.user.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	@Override
	public Class getEntityClass() throws Exception {
		return User.class;
	}

	@Override
	public User getBeanByNameAndPassword(User user) {
		Session session = getSessionFactory().openSession();
		String sql = "select * from user_user where name='"+ user.getName() +"' and password='"+ user.getPassword() +"'";
		Query sqlQuery = session.createSQLQuery(sql.toString()).addEntity(User.class);
		List<User> result = sqlQuery.list();
		if(result.size() != 0){
			return result.get(0);
		} else {
			return null;
		}
		
	}
	
}
