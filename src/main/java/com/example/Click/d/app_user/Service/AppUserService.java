package com.example.Click.d.app_user.Service;

import com.example.Click.d.app_user.Model.AppUser;
import com.example.Click.d.app_user.Repository.AppUserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<AppUser> AllUsers(){
        return appUserRepository.findAll();
    }

    public Optional<AppUser> getUser(String id){
        return appUserRepository.findById(new ObjectId(id));
    }
}
