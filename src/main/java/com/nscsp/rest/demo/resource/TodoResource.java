package com.nscsp.rest.demo.resource;

import com.nscsp.rest.demo.domain.Todo;
import com.nscsp.rest.demo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class TodoResource {
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> todos() {
        return todoService.todos();
    }

    @GetMapping("/todos/{id}")
    public Todo todo(@PathVariable Integer id) {
        return todoService.todo(id);
    }
}

