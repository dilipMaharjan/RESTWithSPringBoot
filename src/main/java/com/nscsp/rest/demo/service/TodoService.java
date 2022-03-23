package com.nscsp.rest.demo.service;

import com.nscsp.rest.demo.domain.TodoDTO;
import com.nscsp.rest.demo.mapper.TodoMapper;
import com.nscsp.rest.demo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    private TodoMapper todoMapper;

    TodoService() {
        todoMapper = Mappers.getMapper(TodoMapper.class);
    }

    public void createTodo(TodoDTO todoDTO) {
        todoRepository.save(todoMapper.toEntity(todoDTO));
    }

    public List<TodoDTO> todos() {
        return todoMapper.toDomainList(todoRepository.findAll());
    }

    public TodoDTO todo(Integer id) {
        return todoMapper.toDomain(todoRepository.findById(id).get());
    }

    public void editTodo(TodoDTO editTodoDTO) {
        todoRepository.save(todoMapper.toEntity(editTodoDTO));
    }

    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }

    public void createMultiple(List<TodoDTO> todoDTOS) {
        todoRepository.saveAll(todoMapper.toEntityList(todoDTOS));
    }
}
