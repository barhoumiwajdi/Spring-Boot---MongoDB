package com.example.challenge2.Repositories;

import com.example.challenge2.Entites.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TasksRepositories extends MongoRepository<Task, String> {
}
