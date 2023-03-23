package com.example.challenge2.Controllers;
import com.example.challenge2.Entites.Task;

import com.example.challenge2.Entites.Users;
import com.example.challenge2.Responses.messageResponse;
import com.example.challenge2.Services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/api/task")

public class TaskController {
        @Autowired
        private  TaskServices TaskServices ;

        @PostMapping(value = "/post")
        public messageResponse PostTasks(@RequestBody Task task)
        {
            return TaskServices.posting(task);
        }
    @GetMapping(value = "/get")
    public List<Task> getAllTasks(){
        return TaskServices.getAll();
    }

    @GetMapping(value = "/getbyid/{id}")
    public Task getoneTask(@PathVariable("id") String idTask){
        return TaskServices.getting(idTask);
    }

    @PutMapping("/update/{id}")
    public  messageResponse  update(@PathVariable( "id") String idTask , @RequestBody Task task){
            return TaskServices.updateTask(idTask , task);

    }
}
