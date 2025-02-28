package com.example.Click.d.app_user.Service;

import com.example.Click.d.app_user.Model.AppUser;
import com.example.Click.d.app_user.Model.GroupProfile;
import com.example.Click.d.app_user.Model.Requests;
import com.example.Click.d.app_user.Repository.GroupProfileRepository;
import com.example.Click.d.app_user.Repository.RequestRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private GroupProfileRepository groupProfileRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Requests makeRequest(String userId, String groupProfileId ) {

     return requestRepository.insert(new Requests(userId, groupProfileId ));

    }

    public Requests acceptRequest(String requestId){
        Requests request = requestRepository.findById(new ObjectId(requestId)).orElseThrow(
                () -> new RuntimeException("Request not found"));

        // Update the request's isAccepted field to true
        request.setIsAccepted(true);

        // Save the updated request back to the repository
        Requests updatedRequest = requestRepository.save(request);

        System.out.println("Updated Request: " + updatedRequest);

        return updatedRequest;
    }

}
