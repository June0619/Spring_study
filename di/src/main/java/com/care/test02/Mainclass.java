package com.care.test02;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Mainclass {
	public static void main(String []args) {
		String path = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		SaveClass sc = ctx.getBean("sc",SaveClass.class);
		sc.setNum1(10);
		sc.setNum2(20);
		sc.setOp("+");
		sc.operationClass();
		sc.printClass();
	}
}





