
package com.zkbr.test;

import static org.junit.Assert.fail;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zkbr.entity.Apple;
import com.zkbr.service.IAppleService;

public class IAppleServiceTest2 {

	private static ApplicationContext ctx = null;
	private static IAppleService service = null;
	
	private Date createTime = java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
	private Timestamp startTime = java.sql.Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ctx = new ClassPathXmlApplicationContext("server.xml");
		service = (IAppleService)ctx.getBean(IAppleService.SERVICE_NAME);
	}

	@Test
	public void testAdd() throws Exception 
	{
		Apple apple = new Apple();
		apple.setName("苹果"+UUID.randomUUID().toString().substring(1,8));
		apple.setPrice(27.3);
		apple.setCreateTime(createTime);
		apple.setStartTime(startTime);
		
		service.add(apple);
	}
}

