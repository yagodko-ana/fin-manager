package com.example.personinfo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
    public static final String TRANSACTION = "transaction";

    @Bean
    public NewTopic transaction() {
        return TopicBuilder.name(TRANSACTION).build();
    }
}
