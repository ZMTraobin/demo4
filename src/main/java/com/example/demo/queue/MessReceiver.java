package com.example.demo.queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 使用默认配置，单一的(queues = "hello")
 * @author Administrator
 *
 
@Component
@RabbitListener(queues = "hello")
public class MessReceiver {
	
	@RabbitHandler
	public void process(String hello) {
		System.out.println("Receiver  : "+hello);
	}

}*/
