package com.care.root.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.care.root.dto.InfoDTO;

@Controller
public class AjaxController {
	@GetMapping("non_ajax")
	public String nonAjax() {
		System.out.println("non_ajax");
		return "ajax/non_ajax";
	}
	@GetMapping("ajax01")
	public String ajax01() {
		System.out.println("ajax01");
		return "ajax/ajax01";
	}
	@GetMapping("ajax_test")
	public void ajaxTest() {
		System.out.println("ajax_test");
	}
	
	
	
	@GetMapping("ajax02")
	public String ajax02() {
		System.out.println("ajax02");
		return "ajax/ajax02";
	}
	int cnt = 0;
	@GetMapping("result02")
	@ResponseBody // return으로 DATA만 전송
	public String result02() {
		return "" + cnt++;
	}
	

	
	@GetMapping("ajax03")
	public String ajax03() {
		return "ajax/ajax03";
	}
	@PostMapping(value = "result03", produces = "application/json; charset=utf-8") // 클라이언트가 전송한 데이터 타입
	@ResponseBody // return으로 DATA만 전송
	public InfoDTO result03(@RequestBody InfoDTO dto) {
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());
		
		dto.setName("서버 수정 이름 : " + dto.getName());
		dto.setAge(dto.getAge() * 10);
		
		return dto;
	}
	
	
	
	@GetMapping("ajax04")
	public String ajax04() {
		
		return "ajax/ajax04";
	}
	@PostMapping(value = "result04", produces = "application/json; charset=utf-8")
	@ResponseBody // return으로 DATA만 전송
	//public void result04(@RequestBody ArrayList<Object> arr) {
	public Map<String, String> result04(@RequestBody HashMap<String, String> frm) {
		System.out.println(frm);
		System.out.println(frm.get("name"));
		
		frm.put("nick", "점심 먹을 시간이네요~");
		
		return frm;
	}	
	
	

	@GetMapping("rest01")
	public String rest01() { return "ajax/rest01"; }
	
	@GetMapping("member")
	public String member() { return "ajax/member"; }
}
