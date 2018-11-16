package test;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ldz.database.function.DatabaseFactory;
import com.ldz.database.testdao.TestAnswerDao;
import com.ldz.database.testdao.impl.TestAnswerDaoImpl;
import com.ldz.model.test.Answer;

public class CommontTest {
	//@Test
	public void test1(){
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml"); 
			SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
			Session session = sessionFactory.openSession();
			SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM test_answer ORDER BY id DESC LIMIT 0,10").addEntity(Answer.class);
		    List<Answer> list = sqlQuery.list();
			System.out.println(list.get(0));
			
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() throws Exception{
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml"); 
//		AnswerDao answerDaoImpl = (AnswerDao) ac.getBean("answerDaoImpl");
		TestAnswerDao answerDaoImpl = DatabaseFactory.getAnswerDao();
		
		Answer answer = new Answer();
		answer.setId(25L);
		answer.setScore(5);
		answer.setAnswer("ss");
		
		answerDaoImpl.save(answer);
		System.out.println(answerDaoImpl);
	}
	
	//测试连接池有多少对象
	@Test
	public void test3(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml"); 
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for(String s : beanDefinitionNames){
			System.out.println(s);
		}
	}
}
