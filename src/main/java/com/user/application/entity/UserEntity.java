package com.user.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = " user_application")
public class UserEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@Column(name = "user_email")
	private String mailId;
	
	@Column(name = "user_pass")
	private String pass;

	public UserEntity() {
	
	}

	public UserEntity(int id, String mailId, String pass) {
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

	public String getMailId() {
		return mailId;
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

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", mailId=" + mailId + ", pass=" + pass + "]";
	}

	
	
	
}
