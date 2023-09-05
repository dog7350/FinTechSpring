package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/index")
	public ModelAndView memberIndex() {
		ModelAndView model = new ModelAndView();
		
		model.addObject("msg", "기본 페이지 입니다.");
		model.setViewName("member/index");
		
		return model; // views 폴더의 경로
	}
	
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView model = new ModelAndView();
		
		model.addObject("msg", "로그인 페이지 입니다.");
		model.setViewName("member/login");
		
		return model;
	}
	
	@RequestMapping("/logout")
	public String memberLogout(Model model) {
		model.addAttribute("test", "값 입니다.");
		return "member/logout";
	}
}
