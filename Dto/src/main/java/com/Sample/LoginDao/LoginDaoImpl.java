/*
  file name:LoginDaoImpl.java
  Created by:Bhushan Ranjane
  Create Date:-28-09-2016
  Purpose:To have controll over the Login operations using hibernate
*/
package com.Sample.LoginDao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Sample.SimpleLogin.Login;

public class LoginDaoImpl implements LoginDao {
	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;
	Session session;

	public boolean isValid(String UserName, String passWord) {
		session = sessionFactory.openSession();

		Query query = session.createQuery("from Login where username=? and password=?");
		query.setString(0,UserName);
		query.setString(1,passWord);

		// getting the hibernate query result
		List list = query.list();

		// checking result
		if (list != null && list.size() > 0)
			return true;
		else
			return false;
	}

	// display list of user
	public List<Login> showList() {
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Login");
		List<Login> list = query.list();
		for (Login login : list) {
			System.out.println("Dao:" + login.getUserName());
		}
		return list;
	}

	@Override
	public List<Login> delete(int id) {
		session = sessionFactory.openSession();
		Query query = session.createQuery("delete from Login where id=?");
		query.setInteger(0, id);
		query.executeUpdate(); // user deleted
		Query q = session.createQuery("from Login"); // getting new list after
														// deletion
		List<Login> list = q.list();
		return list; // returning new list

	}
}
