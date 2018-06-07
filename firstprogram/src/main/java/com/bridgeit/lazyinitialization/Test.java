package com.bridgeit.lazyinitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("hhhhhhh");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
		System.out.println("objects of ===="+context.toString());
		Employee employee=(Employee) context.getBean("employee");
		employee.InfoMethod();
//		Address address=(Address) context.getBean("add");
//		address.infoAddress();
         context.close();
	}

}
