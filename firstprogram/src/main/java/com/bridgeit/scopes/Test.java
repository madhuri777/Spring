package com.bridgeit.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Message message=(Message) context.getBean("message");
		message.messageInfo();
		System.out.println("first message object "+message);
		Message message1=(Message) context.getBean("message");
		message1.messageInfo();
		System.out.println("first message object "+message1);
		context.close();

	}

}
