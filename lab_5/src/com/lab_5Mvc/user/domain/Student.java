package com.lab_5Mvc.user.domain;

public class Student {
	private String name;
	private String id;
	private String chinese;
	private String math;
	private String english;
	private Boolean state;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setId(String id){
		this.id=id;
	}
	public void setChinese(String chinese){
		this.chinese=chinese;
	}
	public void setMath(String math){
		this.math=math;
	}
	public void setEnglish(String english){
		this.english=english;
	}
}
