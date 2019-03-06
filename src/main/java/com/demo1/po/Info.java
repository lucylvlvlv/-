package com.demo1.po;

import java.util.Date;

public class Info {
	private int id;//主键（自增长）
	private String title;//信息的标题
	private String type;//信息的分类 
	private int userId;//发布的用户ID
	private Date createDate;//信息发布的时间
	private int status;// 发布状态（1：已发布；2：已下架）
	private String info1;//文章内容

	
	public String getInfo1() {
		return info1;
	}
	public void setInfo1(String info1) {
		this.info1 = info1;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", title=" + title + ", type=" + type + ", userId=" +userId + ", createDate="
				+ createDate + ",status=" + status +",info1=" + info1+"]";
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
