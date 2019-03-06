package com.demo1.po;

import java.util.Date;

/**
 * 该 类 主要用于 保存 查询用户信息的 查询条件
 * 
 * @author gangwang
 *
 */
public class UserParam {

	private String username_like;// 根据用户名进行模糊查询

	private String sex_equal;// 根据性别进行 等值查询

	private Date birthday_begin;//生日的起始区间

	private Date birthday_end;//生日的结束区间

	private String address_like;

	public String getUsername_like() {//在mybatis的xml文件中，执行Sql语句时，获取查询条件的值是调用的查询条件对象的get方法
		return "%"+username_like+"%";
	}

	public void setUsername_like(String username_like) {
		this.username_like = username_like;
	}

	public String getSex_equal() {
		return sex_equal;
	}

	public void setSex_equal(String sex_equal) {
		this.sex_equal = sex_equal;
	}

	public Date getBirthday_begin() {
		return birthday_begin;
	}

	public void setBirthday_begin(Date birthday_begin) {
		this.birthday_begin = birthday_begin;
	}

	public Date getBirthday_end() {
		return birthday_end;
	}

	public void setBirthday_end(Date birthday_end) {
		this.birthday_end = birthday_end;
	}

	public String getAddress_like() {
		return address_like;
	}

	public void setAddress_like(String address_like) {
		this.address_like = address_like;
	}

}
