package com.dao;

public class UserDao 
{
	static UserDao userDao = null;
	
	public void add()
	{
		System.out.println("add");
	}
	public static UserDao getUserDao(){
		if(userDao == null)
			userDao = new UserDao();
		return userDao;
	}
}
