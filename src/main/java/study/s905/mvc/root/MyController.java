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
		
		model.addObject("msg", "�⺻ ������ �Դϴ�.");
		model.setViewName("member/index");
		
		return model; // views ������ ���
	}
	
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView model = new ModelAndView();
		
		model.addObject("msg", "�α��� ������ �Դϴ�.");
		model.setViewName("member/login");
		
		return model;
	}
	
	@RequestMapping("/logout")
	public String memberLogout(Model model) {
		model.addAttribute("test", "�� �Դϴ�.");
		return "member/logout";
	}
}
