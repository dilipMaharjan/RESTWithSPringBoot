package com.nscsp.rest.demo.resource;

import com.nscsp.rest.demo.domain.Todo;
import com.nscsp.rest.demo.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Operation(
            description = "Fetches all todos"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully fetched all data",
                            content = @Content(mediaType = "application/json")
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Resource not found",
                            content = @Content
                    )}
    )
    @GetMapping("/todos")
    public List<Todo> todos() {
        return todoService.todos();
    }

    @GetMapping("/todos/{id}")
    public Todo todo(@PathVariable Integer id) {
        return todoService.todo(id);
    }
}

