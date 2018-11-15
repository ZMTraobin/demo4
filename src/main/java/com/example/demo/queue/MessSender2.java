package com.example.demo.queue;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
@Component
public class MessSender2 {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void sendMess(String s) {
		String mess = "hello:"+new Date();
		amqpTemplate.convertAndSend("hello", s+":"+mess);
	}
}*/
