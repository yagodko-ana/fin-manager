package com.example.personinfo.dto;

import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Value
@FieldDefaults(level = AccessLevel.PRIVATE) // Value итак сгенерирует private поля, это можно убрать
public class PersonAccountsDto {
    UUID personId;
    List<AccountDto> accounts;

    @Value
    public static class AccountDto {
        UUID accountId;
        String accountNumber;
        BigDecimal balance;
    }
}
