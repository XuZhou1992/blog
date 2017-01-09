package com.xuzhou.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xuzhou.blog.bo.UsersInfo;
import com.xuzhou.blog.dao.UsersInfoDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		BasicDataSource dataSource = (BasicDataSource) act.getBean("dataSource");
//		System.out.println(dataSource.getDriverClassName());
		UsersInfoDAO dao = (UsersInfoDAO) atx.getBean("usersInfoDAO");
		
//		UsersInfo usersInfo = new UsersInfo();
//		
//		usersInfo.setId("2");
//		usersInfo.setUserName("test");
//		usersInfo.setPassword("123456");
//		
//		int result = dao.saveUser(usersInfo);
//		System.out.println(result);
		
		UsersInfo user = dao.getUserById("2");
		
		System.out.println(user.getId());
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		
//		user.setUserName("xuzhou");
//		user.setPassword("789123");
//		
//		int result = dao.updateUser(user);
//		System.out.println(result);
	}
}
