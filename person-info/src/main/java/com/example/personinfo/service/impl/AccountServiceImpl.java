package com.example.personinfo.service.impl;

import com.example.personinfo.dto.PersonAccountsDto;
import com.example.personinfo.entity.Account;
import com.example.personinfo.entity.Person;
import com.example.personinfo.mapper.CommonMapper;
import com.example.personinfo.repository.AccountRepository;
import com.example.personinfo.repository.PersonRepository;
import com.example.personinfo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CommonMapper commonMapper;
    @Autowired
    PersonRepository personRepository;

    @Override
    public PersonAccountsDto createOrUpdateAccounts(PersonAccountsDto dto) {
        Person person = personRepository.findById(dto.getPersonId()).orElseThrow();

        List<Account> accounts = dto.getAccounts().stream().map(s -> {
            Account account = commonMapper.map(s);
            account.setPerson(person);
            return account;
        }).toList();

        accountRepository.saveAllAndFlush(accounts);
        return commonMapper.map(accounts, person.getId());
    }

    @Override
    public void deleteAccount(UUID id) {

    }
}
