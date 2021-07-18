/*
package com.sbi.benefits.javamessaging;


import com.sbi.benefits.models.BenefitCreateEvent;
import com.sbi.benefits.models.BenefitReward;
import com.sbi.benefits.models.BenefitRewardEvent;
import com.sbi.benefits.models.BenefitTable;
import com.sbi.benefits.repository.BenefitRepository;
import com.sbi.benefits.repository.BenefitRewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BenefitCreateListener {

    @Autowired
    BenefitRepository benefitRepository;

    @Autowired
    BenefitRewardRepository benefitRewardRepository;

    @JmsListener(destination = "apply.queue", containerFactory = "myFactory")
    public void receiveMessage(BenefitCreateEvent benefitCreateEvent) {
        BenefitTable benefitTable = new BenefitTable();
            benefitTable.setApplicationId(benefitCreateEvent.getApplicationId());
            benefitTable.setName(benefitCreateEvent.getName());
            benefitTable.setSsn(benefitCreateEvent.getSsn());
            benefitTable.setEmail(benefitCreateEvent.getEmail());
            benefitTable.setBenefitId(benefitCreateEvent.getBenefitId());
            benefitTable.setRewardValue(benefitCreateEvent.getRewardValue());
            benefitTable.setRewardType(benefitCreateEvent.getRewardType());
            benefitTable.setRewardStatus("Targetted");
        benefitRepository.save(benefitTable);

    }

    @JmsListener(destination = "benefit.topic",containerFactory = "myFactory")
    public void saveBenefit(BenefitRewardEvent benefitRewardEvent){
        BenefitReward  benefitReward = new BenefitReward(benefitRewardEvent.getBenefitId()+1,benefitRewardEvent.getRewardAmount());
           benefitRewardRepository.save(benefitReward);
    }


}
*/
