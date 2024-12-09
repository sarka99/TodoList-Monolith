package com.todoapp.Todo.service;

import com.todoapp.Todo.dto.CreateTaskDTO;
import com.todoapp.Todo.dto.TaskDTO;
import com.todoapp.Todo.model.Task;

import java.util.List;

public interface ITaskService {
    Task createTask(CreateTaskDTO createTaskDTO);
    List<TaskDTO> getAllTasks(String userId);
    TaskDTO getTaskById(String taskId);
    TaskDTO updateTask(String taskId);
    void deleteTaskById(String taskId);
    TaskDTO markTaskAsCompleted(String taskId);
    List<TaskDTO> getAllCompletedTasks();
    List<TaskDTO> getAllPendingTasks();

}
