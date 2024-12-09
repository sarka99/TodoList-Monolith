package com.todoapp.Todo.dto;

import com.todoapp.Todo.enums.Priority;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Setter
@Getter
public class CreateTaskDTO {
    //TODO: Once keycloak is implemented remove userId field, instead just extract userId from the jwt token
    private String userId; //This is only needed now before implementing keycloak
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Priority priority; // Enum: HIGH, MEDIUM, LOW

    public CreateTaskDTO(String userId, String title, String description, LocalDateTime dueDate, Priority priority) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public Priority getPriority() {
        return priority;
    }
}
