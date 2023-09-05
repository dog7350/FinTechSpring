package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	// @Autowired => 1. Type, 2. Name
	@Inject
	@Qualifier("ddd")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("Service");
	}
	
	public void test() {
		System.out.println("Svr Test ¿¬µ¿");
		dao.test();
	}
	
	public MemberDTO result() {
		return dao.result();
	}
}
