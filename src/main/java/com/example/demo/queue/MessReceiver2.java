package com.example.demo.queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserInfo;

/*@Component
@RabbitListener(queues = "hello")
public class MessReceiver2 {
	
	@RabbitHandler
	public void process(UserInfo user) {
		System.out.println("Receiver2  : "+user);
	}

}*/
