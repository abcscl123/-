package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ldz.database.base.BaseDao;
import com.ldz.database.base.impl.BaseDaoImpl;
import com.ldz.database.function.DatabaseFactory;
import com.ldz.database.testdao.TestAnswerDao;

public class BaseServiceTest {

	//@Autowired
	//BaseDao baseDaoImpl = DatabaseFactory.getBaseDao();
	@Autowired
	TestAnswerDao testAnswerDaoImpl = DatabaseFactory.getAnswerDao();
	@Test
	public void getBaseDao(){
		System.out.println(testAnswerDaoImpl);
	}
}
