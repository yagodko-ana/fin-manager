package com.example.personinfo.service;


import com.example.personinfo.dto.PersonBalancesDto;
import com.example.personinfo.dto.PersonDto;
import com.example.personinfo.entity.Person;

import java.util.List;
import java.util.UUID;

public interface PersonService {
    PersonBalancesDto person(UUID id);
    List<PersonDto> persons();
    Person createOrUpdatePerson(PersonDto person);
    void deletePerson(UUID id);
}
