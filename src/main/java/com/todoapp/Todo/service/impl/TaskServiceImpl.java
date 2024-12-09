package com.todoapp.Todo.service.impl;

import com.todoapp.Todo.Repository.TaskRepository;
import com.todoapp.Todo.dto.CreateTaskDTO;
import com.todoapp.Todo.dto.TaskDTO;
import com.todoapp.Todo.model.Task;
import com.todoapp.Todo.service.ITaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskDTO createTaskDTO) {
        //Extract the createdAt and updated at data when creating task
        Task taskToCreate = new Task(
                createTaskDTO.getUserId(),
                createTaskDTO.getTitle(),
                createTaskDTO.getDescription(),
                createTaskDTO.getDueDate(),
                Boolean.FALSE,
                LocalDateTime.now(),
                LocalDateTime.now(),
                createTaskDTO.getPriority());
        Task createdTask = taskRepository.insert(taskToCreate);
        return createdTask;

    }

    @Override
    public List<TaskDTO> getAllTasks(String userId) {
        return null;
    }

    @Override
    public TaskDTO getTaskById(String taskId) {
        return null;
    }

    @Override
    public TaskDTO updateTask(String taskId) {
        return null;
    }

    @Override
    public void deleteTaskById(String taskId) {

    }

    @Override
    public TaskDTO markTaskAsCompleted(String taskId) {
        return null;
    }

    @Override
    public List<TaskDTO> getAllCompletedTasks() {
        return null;
    }

    @Override
    public List<TaskDTO> getAllPendingTasks() {
        return null;
    }
}
