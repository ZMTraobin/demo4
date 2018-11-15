package com.example.demo.entity;

public class UserInfo {

	private long id;
	private String uname;
	private String pwd;
	private String age;
	private String addr;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public UserInfo(long id, String uname, String pwd, String age, String addr) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.age = age;
		this.addr = addr;
	}

	
}
