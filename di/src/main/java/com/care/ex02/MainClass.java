package com.care.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		
		STBean stBean = ctx.getBean("stb",STBean.class);
		/*
		String name = "ȫ�浿";
		int age = 222;
		stBean.setName(name);
		stBean.setAge(age);
		*/
		stBean.getSt().namePrint(stBean.getName());
		stBean.getSt().agePrint(stBean.getAge());
	}
}



