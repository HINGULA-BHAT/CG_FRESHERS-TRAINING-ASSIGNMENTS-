package com.hingula.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		context = new ClassPathXmlApplicationContext("SpringC1.xml");
		Customer c = (Customer) context.getBean("customer");
		c.customerDetails();
		

	}

}
