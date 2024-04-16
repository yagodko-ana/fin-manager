package com.example.personinfo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    long phone;
    String password;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "person")
    List<Account> accounts;
}
