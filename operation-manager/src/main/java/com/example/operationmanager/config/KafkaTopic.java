package com.example.operationmanager.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
    public static final String TRANSACTION = "transaction";

    @Bean
    public NewTopic transactionTopic() {
        return TopicBuilder.name(TRANSACTION)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
