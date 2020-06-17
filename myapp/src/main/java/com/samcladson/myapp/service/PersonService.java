package com.samcladson.myapp.service;

import com.samcladson.myapp.model.Person;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonService extends MongoRepository<Person, String> {
}
