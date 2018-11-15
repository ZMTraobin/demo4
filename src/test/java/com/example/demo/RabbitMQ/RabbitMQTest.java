package com.example.demo.RabbitMQ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.UserInfo;
import com.example.demo.queue.MessExchangeSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {
	/*@Autowired 
	private MessSender messSender;
	
	@Autowired 
	private MessSender2 messSender2;*/
	
	@Autowired
	private MessExchangeSender messExchangeSender;
	
	/*@Test
	public void send() {
		UserInfo user = new UserInfo(0, "刘华强", "99999", "48", "山西");
		for (int i = 0; i < 100; i++) {
			messSender.sendMess(user);
			messSender2.sendMess(i+"");
		}
	}*/
	@Test
	public void send2() {
		UserInfo user = new UserInfo(0, "刘华强", "99999", "48", "山西");
		for (int i = 0; i < 100; i++) {
			messExchangeSender.send1(i+"");
			//messExchangeSender.send2(i+"");
		}
	}

}
