package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.care.service.AccountCheckServiceImpl;
import com.care.service.AccountService;
import com.care.template.Constant;

@Controller
public class HomeController {
	
	AccountService as;
	
	public HomeController() {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(config);
		Constant.template = ctx.getBean("template", JdbcTemplate.class);
	} 
	
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
	@RequestMapping("check")
	public String check(Model model, HttpSession session)
	{
		as = new AccountCheckServiceImpl();
		model.addAttribute("num", session.getAttribute("num"));
		as.execute(model);
		return "check";
	}
	@RequestMapping("deposit")
	public String deposit()
	{
		return "deposit";
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
