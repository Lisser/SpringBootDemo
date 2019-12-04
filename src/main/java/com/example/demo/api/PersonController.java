package com.example.demo.api;

import com.example.demo.model.Person;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.PersonService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
  private final PersonService personService;

  @Autowired
  public PersonController(PersonService service) {
    this.personService = service;
  }

  @PostMapping
  public Person addPerson(@RequestBody Person person) {
    return personService.addPerson(person);
  }

  @GetMapping
  public List<Person> listPeople() {
    return personService.listPeople();
  }
}
