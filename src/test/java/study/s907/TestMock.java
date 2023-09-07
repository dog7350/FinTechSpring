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
@ContextConfiguration(locations = {"classpath:testMember.xml", "file:src/main/webapp/WEB-INF/spring/root-context.xml"}) // Ư�� ������ ���� ��ġ�� �ε�
public class TestMock {
	@Autowired MemberController mc;
	MockMvc mock;
	
	@Before
	public void setUp() {
		System.out.println("TEST ���� �� ����");
		mock = MockMvcBuilders.standaloneSetup(mc).build(); // Controller�� ���� ��ȣ�� ���� ���� ��ü ����
	}
	
	// @Test
	public void testIndex() {
		System.out.println("TEST ����");
		
		try {
			mock.perform(get("/list")) // ��û ��İ� ��û URL
			.andDo(print()) // ���� ��� ���
			.andExpect(status().isOk()) // ���� ����� ��� (isOK = 200)
			.andExpect(forwardedUrl("member/list")); // ������ ���� ����Ʈ�� URL�� ������ ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertNull(null);
	}
	
	@Test
	@Transactional(transactionManager = "txMgr") // Ʈ����� �ѹ� �� ����
	public void testInsert() throws Exception {
		mock.perform(post("/insert").param("id", "333").param("name", "�׽���"))
		.andDo(print())
		.andExpect(status().is3xxRedirection());
	}
}
