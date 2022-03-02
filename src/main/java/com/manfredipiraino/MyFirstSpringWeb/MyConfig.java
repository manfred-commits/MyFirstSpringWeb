package com.manfredipiraino.MyFirstSpringWeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public MyClass myClass() {
		return new MyClass();
	}
}
