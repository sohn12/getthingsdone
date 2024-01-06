package com.example.getthingsdone.service;

import com.example.getthingsdone.entity.ToDo;

import java.util.List;

public interface ToDoService {
    ToDo saveTodo(ToDo toDo);

    List<ToDo> getToDosList();
}
