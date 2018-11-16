package com.ldz.service.function;
/*
 * ��spring���л�ȡserviceʵ����
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldz.service.cosmeticservice.CosmeticImageService;
import com.ldz.service.cosmeticservice.CosmeticService;

public class ServiceFactory {
	static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ldz/conf/spring/applicationContext.xml");
	
	public static CosmeticService getCosmeticService(){
		return (CosmeticService) applicationContext.getBean("cosmeticServiceImpl");
	}
	
	public static CosmeticImageService getCosmeticImageService(){
		return (CosmeticImageService) applicationContext.getBean("cosmeticImageServiceImpl");
	}
}
