package com.care.service;

import java.util.Map;

import org.springframework.ui.Model;

import com.care.dao.AccountDAO;
import com.care.dto.AccountDTO;

public class AccountCheckServiceImpl implements AccountService{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		int num = Integer.parseInt((String)map.get("num"));
		AccountDAO dao = new AccountDAO();
		AccountDTO user = dao.checkAccount(num).get("user");
		AccountDTO sys = dao.checkAccount(num).get("sys");
		model.addAttribute("user", user);
		model.addAttribute("sys", sys);
	}
}