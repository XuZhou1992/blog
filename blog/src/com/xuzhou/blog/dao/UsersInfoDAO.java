package com.xuzhou.blog.dao;

import com.xuzhou.blog.bo.UsersInfo;

public interface UsersInfoDAO {
	public int saveUser(UsersInfo usersInfo);
	
	public int updateUser(UsersInfo usersInfo);
	
	public UsersInfo getUserById(String id);
}
