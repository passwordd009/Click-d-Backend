package com.example.Click.d.app_user.Repository;

import com.example.Click.d.app_user.Model.Following;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowingRepository extends MongoRepository<Following, ObjectId> {
}
