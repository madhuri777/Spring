package com.bridgeit.beanconfiguration1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAB {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigB.class);
		A a=context.getBean(A.class);
		a.setAge(23);
		a.setName("madhuri");
		B b=context.getBean(B.class);
		b.setCity("Mumbai");
		b.setState("Maharastra");
		System.out.println("object of A "+a.getAge()+" "+a.getName());
		System.out.println("object of B "+b.getCity()+" "+b.getState());
		context.close();

	}

}
