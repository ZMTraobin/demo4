package com.example.demo.queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * 接收topic.message(queue)指令的信息
 * @author Administrator
 *
 
@Component
@RabbitListener(queues = "topic.message")
public class MessExchangeReceiver {
	
	@RabbitHandler
	public void receiver(String s) {
		System.out.println("Receiver: "+s);
	}
	
	

}*/
