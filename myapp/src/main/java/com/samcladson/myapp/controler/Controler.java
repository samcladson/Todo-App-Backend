package com.samcladson.myapp.controler;

import com.samcladson.myapp.model.Person;
import com.samcladson.myapp.model.Todo;
import com.samcladson.myapp.service.PersonService;
import com.samcladson.myapp.service.TodoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controler {

    @Autowired
    private PersonService service;
    @Autowired
    private TodoService todoService;

    // Person Controlers Start
    @GetMapping("/allPerson")
    public List<Person> getAllPerson() {
        return service.findAll();
    }

    @GetMapping("/Person/{id}")
    public Optional<Person> getSinglePerson(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        service.save(person);
    }
    // Person Object Controls ends

    // Todo Controlers Start
    @GetMapping("/allTodo")
    public List<Todo> getAllTodo() {
        return todoService.findAll();
    }

    @GetMapping("/Todo/{id}")
    public Optional<Todo> getAllTodo(@PathVariable String id) {
        return todoService.findById(id);
    }

    @PostMapping("/PostTodo")
    public void postTodo(@RequestBody Todo todo) {
        todoService.save(todo);
    }
}