/*
package com.sbi.benefits.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbi.benefits.models.ApplyTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "Rp_Topic", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        ObjectMapper objectMapper = new ObjectMapper();
        ApplyTable applyTable = objectMapper.readValue(message, ApplyTable.class);
        System.out.println(applyTable.getApplicationId());
    }

}
*/
