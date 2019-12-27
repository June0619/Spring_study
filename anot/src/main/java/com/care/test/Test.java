package com.care.test;

import org.springframework.stereotype.Component;

@Component
public class Test {
	public Test()
	{
		System.out.println("Test 생성자");
	}
	
	public void print()
	{
		System.out.println("Test print 실행");
	}
}
