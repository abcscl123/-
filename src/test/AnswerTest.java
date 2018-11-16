package test;

import java.util.List;

import org.junit.Test;

import com.ldz.database.function.DatabaseFactory;
import com.ldz.database.testdao.TestAnswerDao;
import com.ldz.database.testdao.impl.TestAnswerDaoImpl;
import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;
import com.ldz.model.test.Answer;

public class AnswerTest {
	TestAnswerDao answerDaoImpl = DatabaseFactory.getAnswerDao();
	
	@Test
	public void saveTest() throws Exception{
		Answer answer = new Answer();
		answer.setId(25L);
		answer.setScore(5);
		answer.setAnswer("ss");
		
		answerDaoImpl.save(answer);
	}
	
	@Test
	public void getByIdTest() throws Exception{
		Answer answer = (Answer) answerDaoImpl.getBean(5L);
		System.out.println(answer.getAnswer());
	}
	
	@Test
	public void updateTest() throws Exception{
		Answer answer = new Answer();
		answer.setId(28L);
		answer.setScore(3);
		answer.setAnswer("sss");
		System.out.println(answer.getId());
		answerDaoImpl.update(answer);
	}
	
	@Test
	public void deleteTest() throws Exception{
		Answer answer = new Answer();
		answer.setId(28L);
		
		answerDaoImpl.delete(answer);
	}
	
	@Test
	public void getList() throws Exception{
		QueryBuilder query = new QueryBuilder();
		query.setTableName("test_answer");
		List<Answer> list = answerDaoImpl.getBeanListByQuery(query);
		System.out.println(list);
	}
	
	@Test
	public void getListForPage() throws Exception{
		QueryBuilder query = new QueryBuilder();
		query.setTableName("test_answer");
		query.setOrderMode(true);
		query.setOrderColimn("id");
		query.setOrderSort("DESC");
		query.setPageMode(true);
		query.setFirstResult(5);
		query.setLastResult(15);

		List<Answer> list = answerDaoImpl.getBeanListForPageByQuery(query);
		System.out.println(list.get(0).getId());
	}
}
