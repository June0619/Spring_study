package com.care.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCalculator {

	@Autowired
	Calculator caca;
	
	@Test
	public void testIntSum()
	{
		Calculator ca = new Calculator();
		int result = ca.sum(10, 20);
		assertThat(result, equalTo(30));
		assertNotNull(caca);
	}
	
	
}
