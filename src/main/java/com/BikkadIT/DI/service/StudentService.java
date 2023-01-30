package com.BikkadIT.DI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.DI.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	public void serviceMethod() {
		System.out.println("Service Method");
		studentDao.daoMethod();
	}
	
}
