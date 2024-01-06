package com.example.getthingsdone.controllers;

import com.example.getthingsdone.entity.ToDo;
import com.example.getthingsdone.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/todos")
    public List<ToDo> getToDos() {
        return toDoService.getToDosList();
    }

    @PostMapping("/todos")
    public ToDo saveToDo(@RequestBody ToDo toDo) {
        return toDoService.saveTodo(toDo);
    }
}
