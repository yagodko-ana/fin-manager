package com.example.personinfo.dto;

import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class PersonBalancesDto {
    UUID id;
    long phone;
    String password;
    List<PersonAccountsDto.AccountDto> accounts;
}
