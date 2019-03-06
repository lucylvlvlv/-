package com.demo1.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo1.mapper.InfoMapper;
import com.demo1.mapper.UserMapper;
import com.demo1.po.Info;
import com.demo1.po.User;
import com.demo1.po.UserParam;
import com.demo1.po.teachers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext*.xml")
public class TestSpring {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private InfoMapper infoMapper;

	
	@Test
	public void testFindAll(){
		List<User> users = userMapper.findAllUsers();
		for(User user : users){// 列表查询
			System.out.println(user);
		}
	}
	@Test
	public void testfindAllteacher(){
		List<teachers> teachers = userMapper.findAllteacher();
		
		for(teachers teacher : teachers){// 列表查询
			System.out.println(teacher);
		}
	}
	
	@Test
	public void testfindAlltb_info(){
		List<Info> infos=infoMapper.findInfos();
		
		for(Info info : infos){// 列表查询
			System.out.println(info);
		}
	}
	
	
	
	//根据用户的用户名来查询用户的信息
	@Test
	public void testFindByUsername(){
		List<User> users = userMapper.findByName("通用mapper真牛");
		for(User user : users){// 列表查询
			System.out.println(user);
		}
	}
	
	@Test
	public void testFindByParams(){
		User userParam = new User();
		userParam.setUsername("陈小明");
		userParam.setSex("1");
		List<User> users = userMapper.findByParams(userParam);
		for(User user : users){// 列表查询
			System.out.println(user);
		}
	}
	
	
	@Test
	public void testFindListByParams() throws Exception{
		UserParam userParam = new UserParam();
		userParam.setUsername_like("张");
		userParam.setSex_equal("1");
		
		//日期转换的工具类 SimpleDateFormat
		/*
		 * SimpleDateFormat 日期的date格式 与字符串之间的转换工具类
		 * 		两个核心方法：
		 * 			日期转换字符串： format(date)
		 * 			字符串转换日期：parse(String)
		 * 日期的格式： 
		 * 		年  y (四位的年 yyyy）
		 * 		月  M  
		 * 		日  d  
		 * 		时  H(24小时制) h(12小时制)
		 * 		分  m
		 * 		秒  s
		 * 		毫秒 S 
		 * 拼接日期 拼接符，可以任意定义 
		 */
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		userParam.setBirthday_begin(sdf.parse("2015-06-01"));
		//查询总结果集
		List<User> users = userMapper.findListByParam(userParam);
		for(User user : users){// 列表查询
			System.out.println(user);
		}
		
		//查询总数据量
		int result = userMapper.findListByParamCount(userParam);
		System.out.println("result="+result);
	}
}
