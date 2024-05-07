package com.example.personinfo.message.kafka;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record TransactionMsg(
        UUID id,
        Instant date,
        BigDecimal amount,
        UUID categoryId,
        UUID accountId) {
}
