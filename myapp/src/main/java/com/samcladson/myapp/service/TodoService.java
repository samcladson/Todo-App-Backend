package com.samcladson.myapp.service;

import com.samcladson.myapp.model.Todo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoService extends MongoRepository<Todo, String> {

}