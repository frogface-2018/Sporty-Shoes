package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class User {

	@Id
	private int user_id;
	private String user_username;
	private String user_password;
	private String user_type;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_username=" + user_username + ", user_password=" + user_password
				+ ", user_type=" + user_type + "]";
	}
	public User(int user_id, String user_username, String user_password, String user_type) {
		super();
		this.user_id = user_id;
		this.user_username = user_username;
		this.user_password = user_password;
		this.user_type = user_type;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
