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
        //Usually business logics are placed
        return todoRepository.todos();
    }

    public Todo todo(Integer id) {
        return todoRepository.todo(id);
    }
}
