package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonResolver implements GraphQLResolver<Person> {

    public String fullName(final Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }
}