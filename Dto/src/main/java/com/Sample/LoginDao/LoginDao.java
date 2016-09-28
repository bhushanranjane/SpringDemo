/*
  file name:LoginDao.java
  Created by:Bhushan Ranjane
  Create Date:-28-09-2016
  Purpose:To have controll over the Login 
*/
package com.Sample.LoginDao;

import java.util.List;

import com.Sample.SimpleLogin.Login;

public interface LoginDao
{	
	//Function to check the userName and password 
	public boolean isValid(String UserName,String passWord);
	//Function to display the list
	public List<Login> showList();
	//Function to delete User
	public List<Login> delete(int Id);
	
}
