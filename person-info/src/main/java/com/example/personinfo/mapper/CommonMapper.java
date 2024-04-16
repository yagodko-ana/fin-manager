package com.example.personinfo.mapper;

import com.example.personinfo.dto.PersonAccountsDto;
import com.example.personinfo.dto.PersonBalancesDto;
import com.example.personinfo.dto.PersonDto;
import com.example.personinfo.entity.Account;
import com.example.personinfo.entity.Person;
import org.mapstruct.*;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface CommonMapper {

    @Mapping(target = "id", source = "accountId")
    Account map(PersonAccountsDto.AccountDto dto);

    @Mapping(target = "accounts", source = "entities")
    PersonAccountsDto map(List<Account> entities, UUID personId);

    @Mapping(target = "accountId", source = "id")
    PersonAccountsDto.AccountDto map(Account entity);

    Person map(PersonDto dto);

    PersonDto mapToPersonDto(Person entity);

    PersonBalancesDto mapToPersonBalancesDto(Person entity);
}
