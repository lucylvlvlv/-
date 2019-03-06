package com.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo1.po.User;
import com.demo1.service.LoginService;
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public String login(String username,String password,Model model){
		
		User user = loginService.login(username, password);
		
		if(user == null){
			return "login";
		}else{
			
			model.addAttribute("user", user);


			return "index";
		}
	}
}
