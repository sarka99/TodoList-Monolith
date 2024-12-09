package com.todoapp.Todo.Repository;

import com.todoapp.Todo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task,String> {
}
