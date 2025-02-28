package com.example.Click.d.app_user.Repository;

import com.example.Click.d.app_user.Model.Requests;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends MongoRepository<Requests, ObjectId> {

}
