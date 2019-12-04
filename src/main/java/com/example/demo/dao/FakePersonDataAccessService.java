package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

  private static List<Person> DB = new ArrayList<>();

  @Override
  public Person insertPerson(UUID id, Person person) {
    Person newPerson = new Person(id, person.getName());
    DB.add(newPerson);
    return newPerson;
  }

  @Override
  public List<Person> listPeople() {
    return DB;
  }
}
