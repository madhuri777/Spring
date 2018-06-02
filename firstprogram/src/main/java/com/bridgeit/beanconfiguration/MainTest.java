package com.bridgeit.beanconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
		HelloWord hellowd=(HelloWord) context.getBean(HelloWord.class);
		hellowd.setMessage("Welcome for javabased configuration");
		hellowd.getMessage();
		context.close();

	}

}
