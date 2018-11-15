package com.example.demo.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessExchangeSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	//消息发送到topic.message（queue）,topic.#表示一类
	public void send1(String s) {
		amqpTemplate.convertAndSend("exchange", "topic.message", s);
	}
	//消息发送到topic.messages（queue）
    public void send2(String s) {
    	amqpTemplate.convertAndSend("exchange", "topic.messages", s);
	}

}
