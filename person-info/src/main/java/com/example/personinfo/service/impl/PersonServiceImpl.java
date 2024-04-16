package com.example.personinfo.service.impl;

import com.example.personinfo.dto.PersonBalancesDto;
import com.example.personinfo.dto.PersonDto;
import com.example.personinfo.entity.Person;
import com.example.personinfo.mapper.CommonMapper;
import com.example.personinfo.repository.PersonRepository;
import com.example.personinfo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    CommonMapper commonMapper;

    @Override
    public PersonBalancesDto person(UUID id) {
        Optional<PersonBalancesDto> personBalances = personRepository.findById(id).stream().map(commonMapper::mapToPersonBalancesDto).findAny();
        return personBalances.orElseThrow();
    }

    @Override
    public List<PersonDto> persons() {
        return personRepository.findAll().stream().map(commonMapper::mapToPersonDto).collect(Collectors.toList());
    }

    @Override
    public Person createOrUpdatePerson(PersonDto person) {
        return personRepository.saveAndFlush(commonMapper.map(person));
    }

    @Override
    public void deletePerson(UUID id) {
        personRepository.deleteById(id);
    }
}
