package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldz.service.commentservice.impl.CommentImageServiceImpl;

public class CommentImageServiceImplTest {

	@Test
	public void getDao() throws Exception{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml");
		CommentImageServiceImpl commentImageServiceImpl = (CommentImageServiceImpl) applicationContext.getBean("commentImageServiceImpl");
		System.out.println(commentImageServiceImpl.getBean(1L));
	}
}
