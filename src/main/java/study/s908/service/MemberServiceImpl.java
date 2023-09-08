package com.care.root.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.dao.MemberDAO;
import com.care.root.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO dao;
	
	@Override
	public int loginChk (String id, String pw, HttpSession se) {
		MemberDTO dto = dao.getOneUser(id);
		
		if (dto == null) return -1;
		else if (!dto.getPw().equals(pw)) return 0;
		else {
			se.setAttribute("user", dto);
			return 1;
		}
	}
	
	@Override
	public MemberDTO getOneUser(String id) {
		return dao.getOneUser(id);
	}
	
	@Override
	public ArrayList<MemberDTO> getUser() {
		return dao.getUser();
	}
	
	@Override
	public void register(MemberDTO dto) {
		dao.register(dto);
	}
	
	@Override
	public void modify(MemberDTO dto) {
		dao.modify(dto);
	}
	
	@Override
	public void exit(String id) {
		dao.exit(id);
	}
}
