package com.demo1.mapper;

import java.util.List;

import com.demo1.po.Info;

public interface InfoMapper {

	public void addInfo(Info info);

	public List<Info> findInfos();

	public Info findById(String id);
}
