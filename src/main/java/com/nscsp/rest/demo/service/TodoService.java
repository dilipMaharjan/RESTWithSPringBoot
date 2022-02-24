package com.nscsp.rest.demo.service;

import com.nscsp.rest.demo.domain.Todo;
import com.nscsp.rest.demo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;

    public List<Todo> todos() {
        return todoRepository.findAll();
    }

    public Todo todo(Integer id) {
        return todoRepository.findById(id);
    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }
}
