package com.ldz.database.function;
/*
 * 从spring池中获取dao实现类
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldz.database.base.BaseDao;
import com.ldz.database.commentdao.CommentDao;
import com.ldz.database.commentdao.CommentImageDao;
import com.ldz.database.commentdao.ReplyDao;
import com.ldz.database.cosmeticdao.CosmeticDao;
import com.ldz.database.cosmeticdao.CosmeticImageDao;
import com.ldz.database.cosmeticdao.FunctionsDao;
import com.ldz.database.cosmeticdao.TypeDao;
import com.ldz.database.testdao.NumberDao;
import com.ldz.database.testdao.ProblemDao;
import com.ldz.database.testdao.ResultDao;
import com.ldz.database.testdao.TestAnswerDao;
import com.ldz.database.userdao.CollectionDao;
import com.ldz.database.userdao.NoteDao;
import com.ldz.database.userdao.UserDao;

public class DatabaseFactory {
	static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml");
	
	public static BaseDao getBaseDao(){
		return (BaseDao) applicationContext.getBean("baseDaoImpl");
	}
	
	public static CommentDao getCommentDao(){
		return (CommentDao) applicationContext.getBean("commentDaoImpl");
	}
	
	public static CommentImageDao getCommentImageDao(){
		return (CommentImageDao) applicationContext.getBean("commentImageDaoImpl");
	}
	
	public static ReplyDao getReplyDao(){
		return (ReplyDao) applicationContext.getBean("replyDaoImpl");
	}
	
	public static CosmeticDao getCosmeticDao(){
		return (CosmeticDao) applicationContext.getBean("cosmeticDaoImpl");
	}
	
	public static CosmeticImageDao getCosmeticImageDao(){
		return (CosmeticImageDao) applicationContext.getBean("cosmeticImageDaoImpl");
	}
	
	public static FunctionsDao getFunctionsDao(){
		return (FunctionsDao) applicationContext.getBean("functionsDaoImpl");
	}
	
	public static TypeDao getTypeDao(){
		return (TypeDao) applicationContext.getBean("typeDaoImpl");
	}
	
	public static NumberDao getNumberDao(){
		return (NumberDao) applicationContext.getBean("numberDaoImpl");
	}
	
	public static ProblemDao getProblemDao(){
		return (ProblemDao) applicationContext.getBean("problemDaoImpl");
	}
	
	public static ResultDao getResultDao(){
		return (ResultDao) applicationContext.getBean("resultDaoImpl");
	}
	
	public static TestAnswerDao getAnswerDao(){
		return (TestAnswerDao) applicationContext.getBean("testAnswerDaoImpl");
	}
	
	public static CollectionDao geCollectionDao(){
		return (CollectionDao) applicationContext.getBean("collectionDaoImpl");
	}
	
	public static NoteDao getNoteDao(){
		return (NoteDao) applicationContext.getBean("noteDaoImpl");
	}
	
	public static UserDao getUserDao(){
		return (UserDao) applicationContext.getBean("userDaoImpl");
	}
}
