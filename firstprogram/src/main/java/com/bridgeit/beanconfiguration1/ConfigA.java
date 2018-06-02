package com.bridgeit.beanconfiguration1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

	@Bean
	public A a() {
		System.out.println("In configurartion of A class ");
		return new A();
	}
}
