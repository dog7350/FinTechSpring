package com.care.root.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.care.root.dto.MemberDTO;
import com.care.root.service.MemberServiceImpl;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class MemberController {
	@Autowired
	MemberServiceImpl ser;
	
	@GetMapping("/")
	public String index() { return "index"; }
	
	@GetMapping("/login")
	public String login() { return "member/login"; }
	@PostMapping("/loginChk")
	public ModelAndView loginChk(@RequestParam String id, @RequestParam String pw, HttpSession se) {
		ModelAndView mav = new ModelAndView();
		
		int result = ser.loginChk(id, pw, se);
		
		if (result == 1) {
			mav.addObject("msg", "로그인 되었습니다.");
			mav.addObject("url", "/successLogin");
		}
		else if (result == 0) {
			mav.addObject("msg", "비밀번호 틀림");
			mav.addObject("url", "/login");
		}
		else if (result == -1) {
			mav.addObject("msg", "유저 없음");
			mav.addObject("url", "/login");
		}
		
		mav.setViewName("default/alert");
		
		return mav;
	}
	
	@GetMapping("/successLogin")
	public String successLogin() { return "member/successLogin"; }
	
	@GetMapping("/memberInfo")
	public ModelAndView memberInfo () {
		ModelAndView mav = new ModelAndView();

		mav.addObject("list", ser.getUser());
		mav.setViewName("member/memberInfo");
		
		return mav;
	}
	
	@GetMapping("/info")
	public ModelAndView info(@RequestParam String id) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("info", ser.getOneUser(id));
		mav.setViewName("member/info");
		
		return mav;
	}
	
	@GetMapping("/join")
	public String join() { return "member/register"; }
	@PostMapping("/join")
	public ModelAndView register(MemberDTO dto) {
		ModelAndView mav = new ModelAndView();
		
		ser.register(dto);
		
		mav.addObject("msg", "회원 가입 완료");
		mav.addObject("url", "/");
		
		mav.setViewName("default/alert");
		
		return mav;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession se) {
		se.invalidate();
		return "index";
	}
	
	@GetMapping("/modify")
	public ModelAndView modify(@RequestParam String id) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("info", ser.getOneUser(id));
		mav.setViewName("member/modify");
		
		return mav;
	}
	@PostMapping("/modify")
	public ModelAndView modifyOk(MemberDTO dto) {
		ModelAndView mav = new ModelAndView();
		
		ser.modify(dto);
		
		mav.addObject("msg", "회원 수정 완료");
		mav.addObject("url", "/memberInfo");
		
		mav.setViewName("default/alert");
		
		return mav;
	}
	
	@GetMapping("/exit")
	public ModelAndView exit(@RequestParam String id) {
		ModelAndView mav = new ModelAndView();
		
		ser.exit(id);
		
		mav.addObject("msg", "탈퇴 완료");
		mav.addObject("url", "/");
		
		mav.setViewName("default/alert");
		
		return mav;
	}
}
