package com.example.challenge2.Controllers;


import com.example.challenge2.Entites.Users;
import com.example.challenge2.Responses.messageResponse;
import com.example.challenge2.Services.usersServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/api")
public class usersController {

    @Autowired
    private usersServices usersServices ;

    @PostMapping(value = "/post")
    public messageResponse  postUsers(@RequestBody Users users){
       return usersServices.posting(users);
    }

    @GetMapping(value = "/get")
    public List<Users> getAllUsers(){
        return usersServices.gettingAll();
    }

    @GetMapping(value = "/getId/{id}")
    public Users getOneUsers(@PathVariable("id") String idUser){
        return usersServices.getting(idUser);
    }

    @GetMapping(value = "/getFirstName/{FirstName}")
    public List<Users> getUsersByFirstName (@PathVariable("FirstName") String FirstName){
        return usersServices.getByFirstName(FirstName);
    }

    @GetMapping(value = "/getEmail/{Email}")
    public List<Users> getUsersByEmail (@PathVariable("Email") String Email){
        return usersServices.getByEmail(Email);
    }


    @DeleteMapping(value = "/delete/{id}")
    public messageResponse deleteOne (@PathVariable("id") String idUser){
        return usersServices.supprimer(idUser);

    }
    @PutMapping(value = "/update/{id}")
    public messageResponse modifier (@PathVariable( "id") String idUser ,@RequestBody Users users){
       return usersServices.update(idUser , users);
    }
}
