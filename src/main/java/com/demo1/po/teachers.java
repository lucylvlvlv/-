package com.demo1.po;

import java.util.Date;

public class teachers {
	private int id;
	private String name;// 用户姓名
	private int teach_num;// 性别
	private int age;
	private Date Date;// 生日
	private String zhichen;// 地址
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", username=" + name + ", teach_num=" + teach_num + ", birthday=" + Date + ", address="
				+ zhichen + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String username) {
		this.name = username;
	}
	public void setTeach_num(int teach_num) {
		this.teach_num=teach_num;
	}

	public Date getDate() {
		return Date;
	}
	public void setDate(Date Date) {
		this.Date = Date;
	}
	public String getZhichen() {
		return zhichen;
	}
	public void setZhichen(String zhichen) {
		this.zhichen = zhichen;
	}
}
