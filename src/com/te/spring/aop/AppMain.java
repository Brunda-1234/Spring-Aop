package com.te.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.te.spring.aop.service.ShapeService;

public class AppMain {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//ctx.getBean --this will tell the spring to get the bean which in that class and cast it urself
		//bean name ==shapeService , classname = ShapeService.class
		
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
//		System.out.println(shapeService.getCircle().getName());
		//if we call another method also it will print but aspect not called
		
//		System.out.println(shapeService.getTriangle().getName());
	 
//	     shapeService.getCircle().setName("Dummy Name::::");
		
//		shapeService.getCircle().setNameAndReturn("Dummy one");
		
//	shapeService.getCircle().setName("Dummy..");;
		shapeService.getCircle();
		

	}

}
