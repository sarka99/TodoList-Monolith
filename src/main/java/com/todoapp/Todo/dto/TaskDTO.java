package com.todoapp.Todo.dto;

import com.todoapp.Todo.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private String id; // Task ID
    private String userId; // User ID associated with the task
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private boolean completed;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Priority priority; // Enum: HIGH, MEDIUM, LOW
}
