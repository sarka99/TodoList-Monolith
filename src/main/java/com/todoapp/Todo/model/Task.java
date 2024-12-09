package com.todoapp.Todo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Builder
@Document("Task")
public class Task {

}
