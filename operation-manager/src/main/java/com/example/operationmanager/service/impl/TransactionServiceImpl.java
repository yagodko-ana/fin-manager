package com.example.operationmanager.service.impl;

import com.example.operationmanager.dto.AddTransactionDto;
import com.example.operationmanager.dto.TransactionDto;
import com.example.operationmanager.entity.Category;
import com.example.operationmanager.entity.Transaction;
import com.example.operationmanager.mapper.CommonMapper;
import com.example.operationmanager.repository.CategoryRepository;
import com.example.operationmanager.repository.TransactionRepository;
import com.example.operationmanager.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CommonMapper commonMapper;

    @Override
    public TransactionDto addTransaction(AddTransactionDto addTransactionDto) {
        Category category = categoryRepository.findById(addTransactionDto.getCategoryId()).orElseThrow();
        Transaction transaction = commonMapper.map(addTransactionDto);
        transaction.setCategory(category);

        transactionRepository.saveAndFlush(transaction);
        //TODO: пересчитывать балансы, поставить аннотацию @Transaction на весь метод

        return commonMapper.map(transaction);
    }
}
