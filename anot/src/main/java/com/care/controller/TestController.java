package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.TestService;
import com.care.service.TestServiceImpl;
import com.care.service.TestServiceImplB;

@Controller
public class TestController {
	
//	@Autowired
//	@Qualifier("testServiceImplB")
	//TestService가 상속하는 클래스가 2개이므로 무엇을 객체로 만들지 모르는 상황이므로 Error
	//Qualifier 어노테이션으로 상속받을 클래스를 명시해주어야 함
	//명시는 클래스명의 첫 글자만 소문자로 변경
	private TestService ts;
	ApplicationContext app =
			ApplicationContextprovider.applicationContext;
	
	@RequestMapping("test")
	public void test()
	{
//		ts = new TestServiceImpl();
		// Autowired 없이 원하는 객체를 연결시키기
		ts = (TestServiceImpl)app.getBean("testServiceImpl");
		ts.execute();
	}
	
	@RequestMapping("test02")
	public void test02()
	{
		ts = (TestServiceImplB)app.getBean("testServiceImplB");
		ts.execute();
	}
	
}