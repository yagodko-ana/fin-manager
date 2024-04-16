package com.example.personinfo.controller;

import com.example.personinfo.dto.PersonBalancesDto;
import com.example.personinfo.dto.PersonDto;
import com.example.personinfo.dto.UUIDDto;
import com.example.personinfo.entity.Person;
import com.example.personinfo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<PersonBalancesDto> person(@PathVariable UUID id) {
        try { //TODO делать проверку в сервисе, нужен Dto для ответа с джинериком и отправлять 400 ошибку и месседж
            return ResponseEntity.ok(personService.person(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<PersonDto>> persons() {
        return ResponseEntity.ok(personService.persons());
    }

    @PostMapping("/new")
    public ResponseEntity<Person> createOrUpdatePerson(@RequestBody PersonDto person) {
        return  ResponseEntity.ok(personService.createOrUpdatePerson(person));
    }

    @DeleteMapping
    public void deletePerson(@RequestBody UUIDDto uuid) {
        personService.deletePerson(uuid.getId());
    }
}
