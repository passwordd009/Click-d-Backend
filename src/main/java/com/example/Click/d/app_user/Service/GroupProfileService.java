package com.example.Click.d.app_user.Service;

import com.example.Click.d.app_user.Model.AppUser;
import com.example.Click.d.app_user.Model.GroupProfile;
import com.example.Click.d.app_user.Model.Posts;
import com.example.Click.d.app_user.Repository.GroupProfileRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GroupProfileService {

    @Autowired
    private GroupProfileRepository groupProfileRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<GroupProfile> AllGroupProfiles(){
        return groupProfileRepository.findAll();
    }

    public GroupProfile makeGroupProfile(String adminId, String name, String description, String imgUrl) {
        return groupProfileRepository.insert(new GroupProfile(adminId, name, description,  imgUrl ));
    }

    public List<GroupProfile> getGroupProfileByUser(String adminId){
        List<GroupProfile> allGroupProfiles  =  AllGroupProfiles();

        return allGroupProfiles.stream()
                .filter(post -> post.getAdminId().equals(adminId))
                .collect(Collectors.toList());
    }

    public Optional<GroupProfile> getGroupProfile(String id){
        return groupProfileRepository.findById(new ObjectId(id));
    }
}
