package com.example.operationmanager.mapper;

import com.example.operationmanager.dto.TransactionDto;
import com.example.operationmanager.message.kafka.TransactionMsg;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface KafkaMsgMapper {
    TransactionMsg toMsg(TransactionDto dto);
}
