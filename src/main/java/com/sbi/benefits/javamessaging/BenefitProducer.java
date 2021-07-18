/*
package com.sbi.benefits.javamessaging;

import com.sbi.benefits.models.ApplyTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class BenefitProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendBenefit(String destination, ApplyTable applyTable){
        jmsTemplate.convertAndSend(destination,applyTable);
    }
}
*/
