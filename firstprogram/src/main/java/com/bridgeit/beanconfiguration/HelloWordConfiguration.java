package com.bridgeit.beanconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfiguration {

	@Bean
	public HelloWord helloword() {
		return new HelloWord();
	}
}
