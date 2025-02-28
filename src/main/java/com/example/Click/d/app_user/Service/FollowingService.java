package com.example.Click.d.app_user.Service;

import com.example.Click.d.app_user.Model.Following;
import com.example.Click.d.app_user.Repository.FollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    private FollowingRepository followingRepository;

    public Following addFollower(String followerId, String usersId) {
     return followingRepository.insert(new Following(followerId, usersId));
    }

}
