package com.care.test01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String []args) {
		String path = "classpath:application_test01.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		
		PrintBean pb = ctx.getBean("pb",PrintBean.class);
		//pb.getPs().printString("�������Կ���");
		pb.printString("���� �־��ֱ�");
		pb.printString();
	}
}







