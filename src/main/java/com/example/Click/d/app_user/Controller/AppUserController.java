package com.example.Click.d.app_user.Controller;

import com.example.Click.d.app_user.Repository.AppUserRepository;
import com.example.Click.d.app_user.Service.AppUserService;
import com.example.Click.d.app_user.Model.AppUser;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    private final AppUserRepository appUserRepository;

//    private final PasswordEncoder passwordEncoder;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public ResponseEntity<List<AppUser>> getAllUsers(){
        return new ResponseEntity<List<AppUser>>(appUserService.AllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AppUser>> getUser(@PathVariable String id){
        return new ResponseEntity<Optional<AppUser>>(appUserService.getUser(id), HttpStatus.OK);
    }

//    @PostMapping("api/user/register")
//    public ResponseEntity registerUser (@RequestBody AppUser user){
//        try {
//            if (appUserRepository.findByEmail(user.getEmail()).isPresent())
//                return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already in use");
//            user.setPassword(passwordEncoder.encode(user.getPassword()));
//            AppUser save = appUserRepository. save(user);
//            return ResponseEntity.ok(HttpStatus.CREATED);
//        } catch (Exception e){
//            return ResponseEntity. internalServerError().body(e.getMessage());
//        }
//    }

//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody AppUser appUser) {
//        try {
//            // Find the user by email
//            AppUser user = appUserRepository.findByEmail(appUser.getEmail())
//                    .orElseThrow(() -> new RuntimeException("User not found"));
//
//            // Check if the provided password matches the stored password
//            if (passwordEncoder.matches(appUser.getPassword(), user.getPassword())) {
//                // Authentication successful, return user information or token
//                return ResponseEntity.ok(user);
//            } else {
//                // Authentication failed
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
//            }
//        } catch (Exception e) {
//            // Handle any other exceptions
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
//        }
//    }
}
