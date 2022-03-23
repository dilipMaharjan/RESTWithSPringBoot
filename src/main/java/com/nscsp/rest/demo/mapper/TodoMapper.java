package com.nscsp.rest.demo.mapper;

import com.nscsp.rest.demo.domain.TodoDTO;
import com.nscsp.rest.demo.entity.Todo;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface TodoMapper {
    Todo toEntity(TodoDTO todoDTO);

    TodoDTO toDomain(Todo todo);

    List<TodoDTO> toDomainList(List<Todo> todos);

    List<Todo> toEntityList(List<TodoDTO> todoDTOS);
}
