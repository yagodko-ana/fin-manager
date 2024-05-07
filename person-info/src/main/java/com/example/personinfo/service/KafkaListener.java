package com.example.personinfo.service;

import com.example.personinfo.message.kafka.TransactionMsg;

public interface KafkaListener {
     void transactionListener(TransactionMsg msg);
}
