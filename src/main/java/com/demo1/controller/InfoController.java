package com.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo1.po.Info;
import com.demo1.service.InfoService;

@Controller
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	
	@RequestMapping("/add")
	public String addInfo(Info info) {
		
		infoService.addInfo(info);
		
		return "pages/info_manager/article-list.jsp";
	}
	
	
	@RequestMapping("/list")
	public String findInfos(Model model) {
		
		List<Info> infos=infoService.findInfos();
		
		model.addAttribute("infos",infos);
		return "pages/info_manager/article-list";
	}
	
	@RequestMapping("/findById")
	public String findById(String id,Model model) {
		Info info=infoService.findById(id);
		model.addAttribute("info",info);
		return "pages/info_manager/article-add";
	}
}
