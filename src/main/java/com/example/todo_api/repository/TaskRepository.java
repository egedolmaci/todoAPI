package com.example.todo_api.repository;

import com.example.todo_api.model.Task;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
