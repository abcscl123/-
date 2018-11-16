package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldz.action.testaction.ProblemAction;
import com.ldz.service.testservice.ProblemService;
import com.ldz.service.testservice.impl.ProblemServiceImpl;

public class ProblemTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml");
	
	@Test
	public void getService(){																	
		ProblemService problemServiceImpl = (ProblemService) applicationContext.getBean("problemServiceImpl");
		System.out.println(problemServiceImpl);
	}
	
	@Test
	public void getAction(){																	
		ProblemAction problemAction = (ProblemAction) applicationContext.getBean("problemAction");
		System.out.println(problemAction.getService());
	}
}
