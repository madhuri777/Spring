package com.bridgeit.secondprogram;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee employee=(Employee) context.getBean("Employee");
		System.out.println("Employee detais is: "+employee);
		context.close();

	}

}
