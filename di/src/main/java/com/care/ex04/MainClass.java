package com.care.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		Car car = ctx.getBean("car",Car.class);
		//Car car = new Controller02();
		System.out.println("���� Ŭ������ �ӷ��� ���ϴ�!!!");
		car.speed();
		
		SubClass sc = new SubClass();
		sc.subFunc();
	}
}
