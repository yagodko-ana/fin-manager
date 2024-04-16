package com.example.personinfo.controller;

import com.example.personinfo.dto.PersonAccountsDto;
import com.example.personinfo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/new")
    public ResponseEntity<PersonAccountsDto> createOrUpdateAccounts(@RequestBody PersonAccountsDto dto) {
        return  ResponseEntity.ok(accountService.createOrUpdateAccounts(dto));
    }
}
