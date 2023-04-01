package com.user.application.Dto;

public class UserDto {
	private int id ;
	
	public UserDto(int id, String mailId, String pass) {
		this.id = id;
		this.mailId = mailId;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String mailId;
	
	private String pass;

	public String getMailId() {
		return mailId;
	}


	public UserDto() {
	}

	@Override
	public String toString() {
		return "UserDto [mailId=" + mailId + ", pass=" + pass + "]";
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
