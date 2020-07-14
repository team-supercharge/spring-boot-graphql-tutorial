package com.example.graphql.mutation;

import com.example.graphql.model.Person;
import com.example.graphql.service.PersonService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreatePersonMutationResolver implements GraphQLMutationResolver {

    private final PersonService personService;

    public CreatePersonMutationResolver(final PersonService personService) {
        this.personService = personService;
    }

    public Person createPerson(final String firstName, final String lastName, final LocalDate dateOfBirth) {
        return personService.createPerson(firstName, lastName, dateOfBirth);
    }
}