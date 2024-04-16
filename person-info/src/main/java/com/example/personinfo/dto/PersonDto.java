package com.example.personinfo.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class PersonDto {
    UUID id;
    long phone;
    String password;
}
