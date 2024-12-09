package com.todoapp.Todo.controller;

import com.todoapp.Todo.dto.CreateTaskDTO;
import com.todoapp.Todo.dto.TaskDTO;
import com.todoapp.Todo.model.Task;
import com.todoapp.Todo.service.ITaskService;
import com.todoapp.Todo.service.impl.TaskServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    // Create a new task
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody CreateTaskDTO createTaskDTO) {
        return ResponseEntity.ok(taskService.createTask(createTaskDTO));
    }

    // Get all tasks for a user
    @GetMapping
    public ResponseEntity<List<TaskDTO>> getAllTasks(@RequestParam String userId) {
        return null;
    }

    // Get a task by its ID
    @GetMapping("/{task-id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable("task-id") String taskId) {
        return null;
    }

    // Update a task by its ID
    @PutMapping("/{task-id}")
    public ResponseEntity<TaskDTO> updateTask(@PathVariable("task-id") String taskId, @RequestBody CreateTaskDTO updateTaskDTO) {
        return null;
    }

    // Delete a task by its ID
    @DeleteMapping("/{task-id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable("task-id") String taskId) {
        return null;
    }

    // Mark a task as completed
    @PutMapping("/{task-id}/complete")
    public ResponseEntity<TaskDTO> markTaskAsCompleted(@PathVariable("task-id") String taskId) {
        return null;
    }

    // Get all completed tasks
    @GetMapping("/completed")
    public ResponseEntity<List<TaskDTO>> getAllCompletedTasks() {
        return null;
    }

    // Get all pending tasks
    @GetMapping("/pending")
    public ResponseEntity<List<TaskDTO>> getAllPendingTasks() {
        return null;
    }
}
