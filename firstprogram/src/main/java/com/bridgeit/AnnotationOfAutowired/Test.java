package com.bridgeit.AnnotationOfAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Student student=(Student) context.getBean("student");
		System.out.println("student information is "+student);
		context.close();
	}

}
