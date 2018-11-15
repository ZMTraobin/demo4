package com.example.demo.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 队列配置
 
@Configuration
public class RabbitMQConfiguration {
	
	@Bean
	public Queue Queue() {
		return new Queue("hello");
	}
}
*/