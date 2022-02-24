package com.nscsp.rest.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
    Integer id;
    String title;
    String description;
}
