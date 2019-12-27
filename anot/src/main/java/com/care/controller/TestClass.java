package com.care.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Controller
//@Repository -> 저장공간을 의미 // 보통 DAO객체에 사용
//@Service -> 서비스 객체에 자주 사용
@Component 
public class TestClass {

	public TestClass()
	{
		System.out.println("TestClass 생성자");
	}
	public void print()
	{
		System.out.println("Test Print() Method.");
	}
	
}
