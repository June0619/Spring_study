package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.care.service.AccountCheckServiceImpl;
import com.care.service.AccountDepositServiceImpl;
import com.care.service.AccountSendServiceImpl;
import com.care.service.AccountService;
import com.care.service.AccountServiceImpl;
import com.care.template.Constant;

@Controller
public class HomeController {
	
	AccountService as;
	ApplicationContext app = ApplicationContextProvider.applicationContext;
	@RequestMapping("form")
	public String form()
	{	
		return "form";
	}
	@RequestMapping("login")
	public String login(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		session.setAttribute("num", request.getParameter("num"));
		return "redirect:form";
	}
	@RequestMapping("send")
	public String send()
	{
		return "send";
	}
	@RequestMapping("send_save")
	public String send_save(HttpServletRequest request, Model model)
	{
		model.addAttribute("request", request);
		as = (AccountSendServiceImpl)app.getBean("accountSendServiceImpl");
		as.execute(model);
		return "redirect:form";
	}
	@RequestMapping("check")
	public String check(Model model, HttpSession session)
	{
		as = (AccountCheckServiceImpl)app.getBean("accountCheckServiceImpl");
		model.addAttribute("num", session.getAttribute("num"));
		as.execute(model);
		return "check";
	}
	@RequestMapping("deposit")
	public String deposit()
	{
		return "deposit";
	}
	@RequestMapping("save_deposit")
	public String save_deposit(HttpServletRequest request, Model model)
	{
		model.addAttribute("request", request);
		as = (AccountDepositServiceImpl)app.getBean("accountDepositServiceImpl");
		as.execute(model);
		return "redirect:form";
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
