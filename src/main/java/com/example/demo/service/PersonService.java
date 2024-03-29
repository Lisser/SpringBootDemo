package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  private final PersonDao personDao;

  @Autowired
  public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
    this.personDao = personDao;
  }

  public Person addPerson(Person person) {
    return personDao.insertPerson(person);
  }

  public List<Person> listPeople() {
    return personDao.listPeople();
  }
}
