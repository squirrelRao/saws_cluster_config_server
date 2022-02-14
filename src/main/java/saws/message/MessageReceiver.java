package saws.message;

import com.rabbitmq.client.AMQP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Map;

@Component
@Slf4j
public class MessageReceiver {

    @RabbitListener(queues = RabbitConfig.queue)
    public void handleMessage(Map<String,String> msg)  {

        log.info("test");
        log.info("Got msg:");
        log.info("===>createTime:"+msg.get("createTime"));
        log.info("===>messageId:"+msg.get("messageId"));
        log.info("===>messageData:"+msg.get("messageData"));

    }

}
