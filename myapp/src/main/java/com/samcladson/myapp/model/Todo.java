package com.samcladson.myapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {

    @Id
    private String todoId;
    private String title;
    private String description;
    private String tag;

    public Todo() {

    }

    public Todo(String todoId, String title, String description, String tag) {
        this.todoId = todoId;
        this.title = title;
        this.description = description;
        this.tag = tag;
    }

    public String getTodoId() {
        return todoId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTag() {
        return tag;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}