package com.demo1.mapper;

import java.util.List;


import com.demo1.po.User;
import com.demo1.po.UserParam;
import com.demo1.po.teachers;

public interface UserMapper{
	//新增一个用户信息  接口
	public void addUser(User user);
	
	public List<teachers> findAllteacher();

	//接口中的方法名，一定要与 .xml文件中的  id的标签名相同
	public List<User> findAllUsers();
	
	public List<User> findByName(String userName);
	
	//根据多个条件 查询用户列表
	public List<User> findByParams(User userParam);
	
	//根据多个条件查询用户列表
	public List<User> findListByParam(UserParam userParam);
	//查询条件下总结果数
	public int findListByParamCount(UserParam userParam);
}
