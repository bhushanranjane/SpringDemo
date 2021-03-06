/*
  file name:Login.java
  Created by:Bhushan Ranjane
  Create Date:-28-09-2016
  Purpose:POJO class for Login operations
*/
package com.Sample.SimpleLogin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table
public class Login {
	@Id
	@GeneratedValue
	private int id;

	@NotEmpty(message = "Enter User Name")
	@Column
	private String UserName;

	@NotEmpty(message = "Please enter the Password")
	@Column
	private String passWord;

	//Use Getter Setter to Get And Set the Value
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
