package com.example.personinfo.service.impl;

import com.example.personinfo.config.KafkaTopic;
import com.example.personinfo.message.kafka.TransactionMsg;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerImpl {
    @KafkaListener(topics = KafkaTopic.TRANSACTION, groupId = "transaction-group")
    public void listenTransaction(TransactionMsg msg) {
        System.out.println("Hello from person-info: " + msg);
    }
}

