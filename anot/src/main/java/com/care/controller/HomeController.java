package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.care.test.Test;

@Controller
public class HomeController {
	
	@Autowired
	private TestClass testClass;
//	@Autowired
//	private Test test;
	public HomeController()
	{
		System.out.println("Home Controller ������");
//		String config = "classpath:config/context-config.xml";
//		GenericXmlApplicationContext ctx =
//				new GenericXmlApplicationContext(config);
//		testClass = ctx.getBean("testClass", TestClass.class);
//		testClass.print();
		System.out.println("testClass : " + testClass);
		//xml �󿡼� ��ü�� ����� ������ ���� �������� null ���� ����Ǿ�����.
		//-> autowired ������̼��� �̿��� ����
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		testClass.print();
//		test.print();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
