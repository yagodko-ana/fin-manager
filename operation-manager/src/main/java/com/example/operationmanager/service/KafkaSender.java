package com.example.operationmanager.service;

import com.example.operationmanager.dto.TransactionDto;

public interface KafkaSender {
    void sendTransaction(TransactionDto transaction);
}
