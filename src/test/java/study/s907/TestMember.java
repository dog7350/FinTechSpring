package com.care.root;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.member.controller.MemberController;
import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

/*
	junit : test 진행하기 위한 프레임워크(기능들의 집합)
	test 주도 개발
		> 단위 테스트, 통합 테스트
*/

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:testMember.xml", "file:src/main/webapp/WEB-INF/spring/root-context.xml"}) // 특정 파일을 현재 위치로 로드
public class TestMember {
	@Autowired MemberController mc;
	@Test
	public void testMc() {
		assertNotNull(mc); // 해당 빈이 Null이 아니면 성공, Null이면 실패
	}
	
	@Autowired MemberService ms;
	@Test
	public void testMs() {
		assertNotNull(ms);
		
		MemberDTO dto = new MemberDTO();
		dto.setId(222);
		dto.setName("고길동");
		
		int result = ms.insertMember(dto);
		System.out.println("result : " + result);
		assertEquals(result, 1);
	}
	
	@Autowired MemberDAO dao;
	@Test
	public void testDao() {
		assertNotNull(dao);
		
		MemberDTO dto = new MemberDTO();
		dto.setId(111);
		dto.setName("홍길동");
		
		int result = dao.insertMember(dto);
		System.out.println("result : " + result);
		assertEquals(result, 1);
	}
}
