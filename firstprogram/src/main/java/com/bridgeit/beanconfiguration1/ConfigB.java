package com.bridgeit.beanconfiguration1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB {

	@Bean
	public B b() {
		System.out.println("configuration inside Configuration B ");
		return new B();
	}
}
