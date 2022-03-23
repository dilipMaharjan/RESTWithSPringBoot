package com.nscsp.rest.demo.resource;

import com.nscsp.rest.demo.domain.TodoDTO;
import com.nscsp.rest.demo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class TodoResource {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todos")
    public void create(@RequestBody TodoDTO todoDTO) {
        todoService.createTodo(todoDTO);
    }

    @PostMapping("/todos/createMultiple")
    public void createMultiple(@RequestBody List<TodoDTO> todoDTOS) {
        todoService.createMultiple(todoDTOS);
    }

    @GetMapping("/todos")
    public List<TodoDTO> todos() {
        return todoService.todos();
    }

    @GetMapping("/todos/{id}")
    public TodoDTO todo(@PathVariable Integer id) {
        return todoService.todo(id);
    }

    @PutMapping("/todos/{id}")
    public void edit(@RequestBody TodoDTO todoDTO) {
        todoService.editTodo(todoDTO);
    }

    @DeleteMapping("/todos/{id}")
    public void delete(@PathVariable Integer id) {
        todoService.deleteTodo(id);
    }
}

