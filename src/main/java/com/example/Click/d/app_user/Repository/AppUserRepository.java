package com.example.Click.d.app_user.Repository;

import com.example.Click.d.app_user.Model.AppUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends MongoRepository<AppUser, ObjectId> {
  Optional<AppUser> findByEmail(String email);
}
