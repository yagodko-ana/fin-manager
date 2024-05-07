package com.example.operationmanager.dto;

import com.example.operationmanager.entity.TransactionType;
import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Value
public class TransactionDto {
    UUID id;
    Instant date;
    BigDecimal amount;
    TransactionType transactionType;
    UUID categoryId;
}
