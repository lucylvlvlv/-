package com.demo1.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo1.mapper.InfoMapper;
import com.demo1.po.Info;

@Service
public class InfoService {

	@Autowired
	private InfoMapper infoMapper;
	
	public void addInfo(Info info) {
		info.setCreateDate(new Date());
		infoMapper.addInfo(info);
	}
	public List<Info> findInfos(){
		return infoMapper.findInfos();
	}
	public Info findById(String id) {
		// TODO Auto-generated method stub
		return infoMapper.findById(id);
	}
}
