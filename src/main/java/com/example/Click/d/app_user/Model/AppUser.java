package com.example.Click.d.app_user.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppUser{

    @Id
    private String id;

    @Indexed
    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private String password;

    public AppUser(String email, String firstName, String lastName, String jobTitle, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.password = password;
    }

    private String location;
    private String pictureUrl;
    private String bio;
}
