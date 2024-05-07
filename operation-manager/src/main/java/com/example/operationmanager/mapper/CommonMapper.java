package com.example.operationmanager.mapper;

import com.example.operationmanager.dto.AddTransactionDto;
import com.example.operationmanager.dto.TransactionDto;
import com.example.operationmanager.entity.Category;
import com.example.operationmanager.entity.Transaction;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface CommonMapper {
    Transaction map(AddTransactionDto dto);

    @Mapping(target = "categoryId", source = "category.id")
    TransactionDto map(Transaction entity);
}
