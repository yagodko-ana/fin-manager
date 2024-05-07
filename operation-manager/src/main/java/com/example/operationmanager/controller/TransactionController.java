package com.example.operationmanager.controller;

import com.example.operationmanager.dto.AddTransactionDto;
import com.example.operationmanager.dto.TransactionDto;
import com.example.operationmanager.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/new")
    public ResponseEntity<TransactionDto> addTransaction(@RequestBody AddTransactionDto dto) {
        return ResponseEntity.ok(transactionService.addTransaction(dto));
    }
}
