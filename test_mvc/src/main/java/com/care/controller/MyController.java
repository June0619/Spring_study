package com.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("index")
	public String memberIndex(Model model) 
	{
		model.addAttribute("index","index request");
		return "member/index";
	}
	
	@RequestMapping(value="/login")
	public ModelAndView memberLogin(Model model)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("login", "로그인 페이지");
		mv.setViewName("member/login");
		return mv;
	}
	
	@RequestMapping(value="/logout")
	public String memberLogout()
	{
		return "member/logout";
	}
}
