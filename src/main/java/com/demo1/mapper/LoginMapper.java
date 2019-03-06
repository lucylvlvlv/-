package com.demo1.mapper;

import java.util.HashMap;

import com.demo1.po.User;



public interface LoginMapper {

	public User login(HashMap<String, String> paramsMap);
}
