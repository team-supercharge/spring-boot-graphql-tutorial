package com.example.graphql.service;

import com.example.graphql.model.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class PersonService {
    private static int INDEX_COUNTER = 0;
    private final Collection<Person> people = new ConcurrentLinkedQueue<>();

    public PersonService() {
    }

    public Person createPerson(final String firstName, final String lastName, final LocalDate dateOfBirth) {
        final Person person = new Person(++INDEX_COUNTER, firstName, lastName, dateOfBirth);
        people.add(person);
        return person;
    }

    public Collection<Person> getPeople() {
        return Collections.unmodifiableCollection(people);
    }
}
