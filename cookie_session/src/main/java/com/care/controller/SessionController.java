package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	@RequestMapping("makeSession")
	public String makeSession(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		session.setAttribute("id", "zs");
		session.setAttribute("age", "20");
		session.setAttribute("addr", "abc");
		return "makeSession";
	}
	@RequestMapping("resultSession")
	public String resultSession()
	{
		return "resultSession";
	}
	@RequestMapping("delSession")
	public String delSession(HttpServletRequest request)
	{
		request.getSession().removeAttribute("id");
		request.getSession().removeAttribute("age");
		request.getSession().removeAttribute("addr");
		return "delSession";
	}
}
