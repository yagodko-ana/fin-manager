package com.example.personinfo.service;

import com.example.personinfo.dto.PersonAccountsDto;

import java.util.UUID;

public interface AccountService {
    PersonAccountsDto createOrUpdateAccounts(PersonAccountsDto dto);
    void deleteAccount(UUID id);
}
