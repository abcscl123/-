package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldz.database.function.DatabaseFactory;
import com.ldz.model.test.Results;
import com.ldz.service.testservice.ProblemService;
import com.ldz.service.testservice.ResultService;

public class ResultTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml");
	
	@Test
	public void getService(){
		ResultService resultServiceImpl = (ResultService) applicationContext.getBean("resultServiceImpl");
		System.out.println(resultServiceImpl);
	}
	
	@Test
	public void getBean() throws Exception{
		Results result = (Results) DatabaseFactory.getResultDao().getBean(1L);
		System.out.println(result.getHighest_score());
	}
}
