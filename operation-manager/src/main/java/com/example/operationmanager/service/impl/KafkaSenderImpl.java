package com.example.operationmanager.service.impl;

import com.example.operationmanager.config.KafkaTopic;
import com.example.operationmanager.dto.TransactionDto;
import com.example.operationmanager.mapper.KafkaMsgMapper;
import com.example.operationmanager.message.kafka.TransactionMsg;
import com.example.operationmanager.service.KafkaSender;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaSenderImpl implements KafkaSender {
    private final KafkaMsgMapper msgMapper;
    private final KafkaTemplate<String, TransactionMsg> kafkaTemplate;

    @Override
    public void sendTransaction(TransactionDto transaction) {
        kafkaTemplate.send(KafkaTopic.TRANSACTION, msgMapper.toMsg(transaction));
    }
}
