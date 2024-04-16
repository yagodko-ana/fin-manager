package com.example.personinfo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    String accountNumber;
    BigDecimal balance;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Person person;
}
