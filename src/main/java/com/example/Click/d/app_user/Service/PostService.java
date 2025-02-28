package com.example.Click.d.app_user.Service;

import com.example.Click.d.app_user.Model.AppUser;
import com.example.Click.d.app_user.Model.Posts;
import com.example.Click.d.app_user.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Posts> AllPosts(){
        return postRepository.findAll();
    }

    public Posts makePost(String postBody, String postCaption, String firstName, String lastName, String hostId ) {

        return postRepository.insert(new Posts(postBody, postCaption, firstName, lastName, hostId));

    }

    public List<Posts> getPostByUser(String userId){
      List<Posts> allPosts  =  AllPosts();

        return allPosts.stream()
                .filter(post -> post.getHostId().equals(userId))
                .collect(Collectors.toList());
    }


}
