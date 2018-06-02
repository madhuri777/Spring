package com.bridgeit.constructoorbaseddependacy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(" "+employee);
		context.close();

	}

}
