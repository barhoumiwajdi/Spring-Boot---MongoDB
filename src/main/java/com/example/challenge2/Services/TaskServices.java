package com.example.challenge2.Services;

import com.example.challenge2.Entites.Task;
import com.example.challenge2.Entites.Users;
import com.example.challenge2.Repositories.TasksRepositories;
import com.example.challenge2.Responses.messageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    @Autowired
    private TasksRepositories repository;
    public messageResponse posting (Task task){
        repository.save(task);
        return new messageResponse("Task posted successfully !" );
    }
    public List<Task> getAll (){
        return  repository.findAll();
    }
    public Task getting (String idTask){
        return repository.findById(idTask).orElse(null);
    }
    public messageResponse DaleteTask(String idTask){
        repository.deleteById(idTask);
        return new  messageResponse( "Task deleted successfully ! ");
    }

    public messageResponse updateTask (String  idTask , Task task){
        Task.setId(idTask);
        repository.save(task);
        return new messageResponse("Task updated successfully");
    }
}
