package com.care.ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.Member;

@Controller
@RequestMapping("redirectEx")
public class QuizController04 {

	@RequestMapping("ex04")
	public String login()
	{
		return "redirectEx/login";
	}
	@RequestMapping("loginChk")
	public String loginChk(HttpServletRequest request)
	{
		String id = request.getParameter("id"); 
		if(id.equals("abc") && 
				request.getParameter("pwd").equals("123"))
		{
			return "redirect:member";
		}
		return "redirectEx/login?id="+id;
	}
	@RequestMapping("member")
	public String member()
	{
		return "redirectEx/member";
	}
	
	@RequestMapping("info")
	public String member(Model model, Member member)
	{
		model.addAttribute("member", member);
		return "redirectEx/info";
	}
}
