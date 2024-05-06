package com.example.operationmanager.service;

import com.example.operationmanager.dto.AddTransactionDto;
import com.example.operationmanager.dto.TransactionDto;

public interface TransactionService {
    TransactionDto addTransaction(AddTransactionDto transaction);
}
