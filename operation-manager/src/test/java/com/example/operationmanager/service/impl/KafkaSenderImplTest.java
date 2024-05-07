package com.example.operationmanager.service.impl;

import com.example.operationmanager.dto.TransactionDto;
import com.example.operationmanager.entity.TransactionType;
import com.example.operationmanager.service.KafkaSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@SpringBootTest
class KafkaSenderImplTest {
    @Autowired
    KafkaSender kafkaSender;


    @Test
    void sendTransaction() {
        TransactionDto dto = new TransactionDto(UUID.randomUUID(), Instant.now(), BigDecimal.TEN, TransactionType.INCOMING, UUID.randomUUID());
        kafkaSender.sendTransaction(dto);
    }
}