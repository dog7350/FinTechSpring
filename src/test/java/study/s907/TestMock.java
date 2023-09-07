package com.care.root;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import com.care.root.member.controller.MemberController;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:testMember.xml", "file:src/main/webapp/WEB-INF/spring/root-context.xml"}) // 특정 파일을 현재 위치로 로드
public class TestMock {
	@Autowired MemberController mc;
	MockMvc mock;
	
	@Before
	public void setUp() {
		System.out.println("TEST 실행 전 실행");
		mock = MockMvcBuilders.standaloneSetup(mc).build(); // Controller에 직접 신호를 보낼 접근 객체 생성
	}
	
	// @Test
	public void testIndex() {
		System.out.println("TEST 실행");
		
		try {
			mock.perform(get("/list")) // 요청 방식과 요청 URL
			.andDo(print()) // 전송 결과 출력
			.andExpect(status().isOk()) // 최종 결과값 출력 (isOK = 200)
			.andExpect(forwardedUrl("member/list")); // 마지막 엔드 포인트와 URL이 같은지 출력
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertNull(null);
	}
	
	@Test
	@Transactional(transactionManager = "txMgr") // 트랜잭션 롤백 빈 적용
	public void testInsert() throws Exception {
		mock.perform(post("/insert").param("id", "333").param("name", "테스터"))
		.andDo(print())
		.andExpect(status().is3xxRedirection());
	}
}
