package com.example.todo_api.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.todo_api.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
