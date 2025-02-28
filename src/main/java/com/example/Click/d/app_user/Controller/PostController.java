package com.example.Click.d.app_user.Controller;

import com.example.Click.d.app_user.Model.Posts;
import com.example.Click.d.app_user.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/user/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Posts> makePost(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Posts>(postService.makePost(payload.get("postBody"), payload.get("postCaption"), payload.get("firstName"), payload.get("lastName"), payload.get("hostId")), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Posts>> getPostByUser(@RequestParam("id") String userId) {
        List<Posts> userPosts = postService.getPostByUser(userId);
        return new ResponseEntity<>(userPosts, HttpStatus.OK);
    }

}
