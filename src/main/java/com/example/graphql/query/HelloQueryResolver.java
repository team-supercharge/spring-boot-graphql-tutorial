package com.example.graphql.query;

import java.util.Optional;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

@Service
public class HelloQueryResolver implements GraphQLQueryResolver {

    public String hello(final String who) {
        return String.format("Hello, %s!", Optional.ofNullable(who).orElse("GraphQL"));
    }
}