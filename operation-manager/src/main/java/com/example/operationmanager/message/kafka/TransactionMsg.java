package com.example.operationmanager.message.kafka;

import com.example.operationmanager.entity.TransactionType;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record TransactionMsg(
        UUID id,
        Instant date,
        BigDecimal amount,
        TransactionType transactionType,
        UUID categoryId,
        UUID accountId) {
}
