package com.nscsp.rest.demo.resource;

import com.nscsp.rest.demo.domain.Todo;
import com.nscsp.rest.demo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class Resource {

    private TodoService todoService;

    @GetMapping("todos")
    public List<Todo> todos() {
        return todoService.todos();
    }

    @GetMapping("todos/{id}")
    public Todo todo(@PathVariable Integer id) {
        return todoService.todo(id);
    }

    @PostMapping("todos")
    public Todo todo(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

}
