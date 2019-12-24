package com.care.ex03;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationPC.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		SaveClass sc = ctx.getBean("sc",SaveClass.class);
		/*
		ArrayList<String> hobby = new ArrayList<String>();
		HashMap<String, String> weather = 
							new HashMap<String, String>();
		hobby.add("°ÔÀÓ"); hobby.add("À¥Å÷");
		weather.put("¿À´Ã", "¸¼À½");weather.put("³»ÀÏ", "Ãä´Ù");
		sc.setName("È«±æµ¿"); sc.setHobby(hobby);
		sc.setWeather(weather);
		*/
		sc.pcFunc();
		
		SaveClass sc02 = ctx.getBean("sc02",SaveClass.class);
		sc02.pcFunc();
	}
}





