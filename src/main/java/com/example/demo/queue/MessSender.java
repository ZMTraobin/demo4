package com.example.demo.queue;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserInfo;
/**
 * 消息的发送者(对象)
 * @author Administrator
 *
 
@Component
public class MessSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void sendMess(UserInfo user) {
		amqpTemplate.convertAndSend("hello2", user);
	}

}*/
