package com.care.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		String path = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		Car car = ctx.getBean("car",Car.class);
		//Car car = new Controller02();
		System.out.println("서브 클래스가 속력을 냅니다!!!");
		
		car.speed();
	}
}
