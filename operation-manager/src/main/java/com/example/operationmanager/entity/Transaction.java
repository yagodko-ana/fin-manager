package com.example.operationmanager.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    Instant date;
    BigDecimal amount = BigDecimal.ZERO;
    @Enumerated(EnumType.STRING)
    TransactionType transactionType;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Category category;
}
