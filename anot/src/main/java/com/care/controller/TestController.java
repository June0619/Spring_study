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
	//TestService�� ����ϴ� Ŭ������ 2���̹Ƿ� ������ ��ü�� ������ �𸣴� ��Ȳ�̹Ƿ� Error
	//Qualifier ������̼����� ��ӹ��� Ŭ������ ������־�� ��
	//��ô� Ŭ�������� ù ���ڸ� �ҹ��ڷ� ����
	private TestService ts;
	ApplicationContext app =
			ApplicationContextprovider.applicationContext;
	
	@RequestMapping("test")
	public void test()
	{
//		ts = new TestServiceImpl();
		// Autowired ���� ���ϴ� ��ü�� �����Ű��
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