package com.care.root.quiz.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.quiz.dao.quizDAO;
import com.care.root.quiz.dto.quizDTO;

@Service
public class quizService {
	@Autowired
	quizDAO dao;
	
	public ArrayList<quizDTO> list() {
		return dao.getDB();
	}
	
	public int insert(quizDTO dto) {
		return dao.addDB(dto);
	}
	
	public quizDTO content(String id) {
		quizDTO user = null;
		
		for (quizDTO d : dao.getDB())
			if (id.equals(d.getId()))
				user = d;
		
		return user;
	}
}
