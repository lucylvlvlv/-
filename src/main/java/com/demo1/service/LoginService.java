package com.demo1.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.demo1.mapper.LoginMapper;
import com.demo1.po.User;

@Service
public class LoginService {

	@Autowired
	private LoginMapper loginMapper;
	
	public User login(String username,String password){
		
		HashMap<String, String> paramMap = new HashMap<>();
		paramMap.put("username", username);
		paramMap.put("password", password);
		
		return loginMapper.login(paramMap);
	}
}
