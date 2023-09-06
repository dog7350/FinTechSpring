package com.care.root.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.care.root.quiz.dto.quizDTO;
import com.care.root.quiz.service.quizService;

@Controller
@RequestMapping("/quiz")
public class quizController {
	@Autowired
	quizService service;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", service.list());
		mav.setViewName("quiz/list");
		
		return mav;
	}
	
	@GetMapping("/insert")
	public String insertForm() {
		return "quiz/insert";
	}
	@PostMapping("/insert")
	public String insert(quizDTO dto) {
		service.insert(dto);
		
		return "redirect: /root/quiz/list";
	}
	
	@GetMapping("/content")
	public ModelAndView content(@RequestParam String id) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user", service.content(id));
		mav.setViewName("quiz/content");
		
		return mav;
	}
}
