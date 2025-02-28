package com.example.Click.d.app_user.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts{

    @Id
    private ObjectId id;

    public Posts(String body, String caption, String firstName, String lastName, String hostId) {
        this.body = body;
        this.caption = caption;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hostId = hostId;
    }
    private String body;
    private String caption;
    private String firstName;
    private String lastName;
    private String hostId;
}