package com.example.demo.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {
	
	final static String message = "topic.message";
    final static String messages = "topic.messages";
   //队列1
    @Bean
    public Queue queueMessage() {
		return new Queue(TopicRabbitConfig.message);
    }
    //队列2
    @Bean
    public Queue queueMessages() {
		return new Queue(TopicRabbitConfig.messages);
    }
    //交换机
    @Bean
    TopicExchange exchange() {
		return new TopicExchange("exchange");
    }
    /**
     * 绑定1
     * .bind(queueMessages).to(exchange).with("topic.messages");
     * 其中的queueMessages代表上方队列的方法名queueMessages()--->发布到对应队列（队列自带routingkey），
     * topic.messages代表发布的binding key--->和对应的消息发布者绑定起来
     * @param queueMessages
     * @param exchange
     * @return
     */
    
    @Bean
    Binding bindingExchangeMessage(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.message");
    }
    /*//绑定2
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }*/


}
