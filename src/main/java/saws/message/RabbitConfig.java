package saws.message;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

     public static final String exchange = "hiDirectExchange";
     public static final String queue = "hi";
}
