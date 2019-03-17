package com.sherlock.learn.spring.messaging.cosumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MesssageConsumer{

    @JmsListener(destination = "jms/P2PQueue"  ,containerFactory = "myFactory")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

   /* @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            try {
                String msg = ((TextMessage) message).getText();
                System.out.println("Message has been consumed : " + msg);
            } catch (JMSException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            throw new IllegalArgumentException("Message Error");
        }
    }*/
}
