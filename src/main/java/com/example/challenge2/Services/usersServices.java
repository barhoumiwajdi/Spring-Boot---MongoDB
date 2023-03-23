package com.example.challenge2.Services;

import com.example.challenge2.Entites.Users;
import com.example.challenge2.Repositories.usersRepositories;
import com.example.challenge2.Responses.messageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class usersServices  {

    @Autowired
    private usersRepositories usersRepositories;



    public messageResponse posting (Users users){
        usersRepositories.save(users);
        return new messageResponse("User posted successfully !" );
    }

    public List<Users> gettingAll (){
        return  usersRepositories.findAll();
    }

    public Users getting (String idUser){
         return usersRepositories.findById(idUser).orElse(null);
    }
    public List<Users> getByFirstName (String FirstName){
        return usersRepositories.findByFirstName(FirstName);
    }

    public List<Users> getByEmail (String Mail){
        return  usersRepositories.findByEmail(Mail);
    }

    public messageResponse supprimer(String idUser){
          usersRepositories.deleteById(idUser);
          return new  messageResponse( "User deleted successfully ! ");
    }

    public messageResponse update (String  idUser , Users users){
        users.setId(idUser);
        usersRepositories.save(users);
        return new messageResponse("User updated successfully");
    }























}
