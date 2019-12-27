package com.care.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.AccountDAO;
import com.care.dto.AccountDTO;

@Service
public class AccountCheckServiceImpl implements AccountService{

	@Autowired
	AccountDAO accountDAO;
//	public AccountCheckServiceImpl() {
//		String path = "classpath:applicationJDBC.xml";
//		GenericXmlApplicationContext ctx 
//				= new GenericXmlApplicationContext(path);
//		dao = ctx.getBean("dao", AccountDAO.class);
//	}
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		int num = Integer.parseInt((String)map.get("num"));
		AccountDTO user = accountDAO.checkAccount(num).get("user");
		AccountDTO sys = accountDAO.checkAccount(num).get("sys");
		model.addAttribute("user", user);
		model.addAttribute("sys", sys);
	}
}