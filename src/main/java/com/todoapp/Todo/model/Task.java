package com.todoapp.Todo.model;

import com.todoapp.Todo.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("Task")
public class Task {
    @Id
    private String id;
    private String userId;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private boolean completed;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Priority priority;


    public Task(String userId,
                String title,
                String description,
                LocalDateTime dueDate,
                Boolean completed,
                LocalDateTime createdAt,
                LocalDateTime updatedAt,
                Priority priority)
    {

        this.userId = userId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
        this.priority = priority;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
