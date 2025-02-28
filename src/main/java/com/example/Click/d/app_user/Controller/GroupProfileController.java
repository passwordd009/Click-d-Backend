package com.example.Click.d.app_user.Controller;

import com.example.Click.d.app_user.Model.AppUser;
import com.example.Click.d.app_user.Model.Posts;
import com.example.Click.d.app_user.Service.GroupProfileService;
import com.example.Click.d.app_user.Model.GroupProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/user/groupProfile")
public class GroupProfileController {

    @Autowired
    private GroupProfileService groupProfileService;

    @PostMapping
    public ResponseEntity<GroupProfile> makeGroupProfile(@RequestBody Map<String, String> payload){
        return new ResponseEntity<GroupProfile>(groupProfileService.makeGroupProfile(payload.get("adminId"), payload.get("name"), payload.get("description"), payload.get("imgUrl")), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<GroupProfile>> getGroupProfileByUser(@RequestParam("id") String adminId) {
        List<GroupProfile> userGroupProfiles = groupProfileService.getGroupProfileByUser(adminId);
        return new ResponseEntity<>(userGroupProfiles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<GroupProfile>> getGroupProfile(@PathVariable String id){
        return new ResponseEntity<Optional<GroupProfile>>(groupProfileService.getGroupProfile(id), HttpStatus.OK);
    }
}
