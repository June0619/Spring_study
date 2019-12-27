package com.care.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.AccountDAO;

@Service
public class AccountDepositServiceImpl implements AccountService{
	@Autowired
	AccountDAO accountDAO;
//	public AccountDepositServiceImpl() {
//		String path = "classpath:applicationJDBC.xml";
//		GenericXmlApplicationContext ctx 
//				= new GenericXmlApplicationContext(path);
//		dao = ctx.getBean("dao", AccountDAO.class);
//	}
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request =
				(HttpServletRequest)map.get("request");
		int num = Integer.parseInt(request.getParameter("num"));
		int deposit = Integer.parseInt(request.getParameter("deposit"));
		accountDAO.deposit(num, deposit);
	}

	
	
	
}
