package com.care.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		String path = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		Car car = ctx.getBean("car",Car.class);
		//Car car = new Controller02();
		System.out.println("���� Ŭ������ �ӷ��� ���ϴ�!!!");
		
		car.speed();
	}
}
