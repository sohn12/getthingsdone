package com.example.getthingsdone.service;

import com.example.getthingsdone.entity.ToDo;
import com.example.getthingsdone.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{
    @Autowired
    private ToDoRepository toDoRepository;
    @Override
    public ToDo saveTodo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    @Override
    public List<ToDo> getToDosList() {
        return toDoRepository.findAll();
    }
}
