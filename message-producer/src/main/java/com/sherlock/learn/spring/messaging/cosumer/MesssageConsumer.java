package com.sherlock.learn.spring.messaging.cosumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MesssageConsumer {

    @JmsListener(destination = "jms/P2PQueue", containerFactory = "jms/__defaultConnectionFactory")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
