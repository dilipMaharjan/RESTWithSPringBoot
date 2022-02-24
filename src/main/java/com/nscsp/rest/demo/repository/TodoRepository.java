package com.nscsp.rest.demo.repository;

import com.nscsp.rest.demo.domain.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    public List<Todo> findAll() {
        return todos();
    }

    public Todo findById(Integer id) {
        return todos().stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    private Todo createTodo(Todo todo) {
        todo = Todo.builder()
                .id(1)
                .title("Get up early in the morning.")
                .description("Early to bed, early to rise makes a person healthy and wise")
                .build();
        return todo;

    }

    private List<Todo> todos() {
        List<Todo> todos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            todos.add(createTodo(Todo.builder().id(i).title("Learn" + i).description("To be smart" + i).build()));
        }
        return todos;
    }

    public Todo save(Todo todo) {
        return todo;
    }
}
