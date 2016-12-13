package com.xuzhou.blog;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		BasicDataSource dataSource = (BasicDataSource) act.getBean("dataSource");
		System.out.println(dataSource.getDriverClassName());
	}
}
