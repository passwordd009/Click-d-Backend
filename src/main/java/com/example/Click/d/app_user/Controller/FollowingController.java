package com.example.Click.d.app_user.Controller;

import com.example.Click.d.app_user.Service.FollowingService;
import com.example.Click.d.app_user.Model.Following;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/user/follow")
public class FollowingController {

    @Autowired
    private FollowingService followingService;

    @PostMapping
    public ResponseEntity<Following> addFollower(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Following>(followingService.addFollower(payload.get("followId"), payload.get("userId")), HttpStatus.CREATED);
    }

}
