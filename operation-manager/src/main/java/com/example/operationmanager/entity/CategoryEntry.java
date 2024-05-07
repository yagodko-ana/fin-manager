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
public class CategoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    BigDecimal balance = BigDecimal.ZERO;
    BigDecimal factLimit = BigDecimal.ZERO;
    BigDecimal planLimit = BigDecimal.ZERO;
    Instant dateBegin;
    Instant dateEnd;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Category category;
}
