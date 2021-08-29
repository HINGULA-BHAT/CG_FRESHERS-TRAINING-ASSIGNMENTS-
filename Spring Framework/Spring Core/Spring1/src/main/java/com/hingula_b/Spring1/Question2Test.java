package com.hingula_b.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question2Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1_Q2.xml");
		Question2 question= (Question2) context.getBean("Question2");
		
		System.out.println("----------List-----------");
		question.answerList();
		
		System.out.println();
		System.out.println("----------Set-----------");
		question.answerSet();
		
		System.out.println();
		System.out.println("-----------Map-----------");
		question.answerMap();
	

	}

}
