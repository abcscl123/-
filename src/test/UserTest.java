package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldz.action.useraction.UserAction;
import com.ldz.database.function.DatabaseFactory;
import com.ldz.database.userdao.UserDao;
import com.ldz.model.QueryBuilder;
import com.ldz.model.user.User;
import com.ldz.service.userservice.UserService;

public class UserTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml");
	UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
	
//	@Test
//	public void save() throws Exception{
//		UserDao userDao = DatabaseFactory.getUserDao();
//		User user = (User) userDao.getBean(1L);
//		System.out.println(user);
//	}
	
	@Test
	public void getUser() throws Exception{
		System.out.println(userService.getBean(1L).getId());
	}
	
	@Test 
	public void getList() throws Exception{
		QueryBuilder queryBuilder = new QueryBuilder();
		queryBuilder.setTableName("user_user");
		System.out.println(userService.getBeanListByQuery(queryBuilder));
	}
	
	@Test 
	public void getListForPage() throws Exception{
		QueryBuilder queryBuilder = new QueryBuilder();
		queryBuilder.setTableName("user_user");
		queryBuilder.setCountMode(false);
		queryBuilder.setAlias("id,name,password,type");
		queryBuilder.setOrderMode(true);
		queryBuilder.setOrderColimn("name");
		queryBuilder.setOrderSort(QueryBuilder.ORDER_ASC);
		queryBuilder.setPageMode(true);
		queryBuilder.setFirstResult(1);
		queryBuilder.setLastResult(5);
		System.out.println(userService.getBeanListForPageByQuery(queryBuilder));
	}
	
	@Test 
	public void save() throws Exception{
		User user = new User();
		user.setNickname("nickname");
		user.setName("name");
		user.setPassword("password");
		user.setType(user.USER);
		user.setPhone("13326095630");
		user.setEamil("123@163.com");
		userService.save(user);
	}
	
	@Test
	public void delete() throws Exception{
		User user = new User();
		user.setId(4L);
		userService.delete(user);
	}
}
