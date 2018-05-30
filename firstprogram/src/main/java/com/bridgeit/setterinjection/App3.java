package com.bridgeit.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee) context.getBean("employee12");
		emp.displayInfo();
		context.close();

	}

}
