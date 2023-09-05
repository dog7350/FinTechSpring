package com.care.root;

import org.springframework.stereotype.Repository;

@Repository("d123")
public class MemberDAO {
	public MemberDAO() {
		System.out.println("Direct Access Oject");
	}
	
	public void test() {
		System.out.println("DAO Test");
	}
	
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		
		dto.setId("abc");
		dto.setName("ȫ�浿");
		
		return dto;
	}
}
