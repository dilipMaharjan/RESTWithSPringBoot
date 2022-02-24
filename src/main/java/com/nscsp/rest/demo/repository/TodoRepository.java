package com.nscsp.rest.demo.repository;

import com.nscsp.rest.demo.domain.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    //There can be many data sources
    public List<Todo> todos() {
        List<Todo> todos = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Todo todo = Todo.builder().id(i).title("Learn" + i).description("Learning is fun" + i).build();
            todos.add(todo);
        }
        return todos;
    }

    public Todo todo(Integer id) {
        return todos().stream().filter(todo -> todo.getId() == id).findFirst().get();
    }
}
