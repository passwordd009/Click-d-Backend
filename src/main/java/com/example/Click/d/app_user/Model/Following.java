package com.example.Click.d.app_user.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "following")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Following {
    @Id
    private ObjectId id;
    private String followerId;
    private String usersId;

    public Following(String followerId, String usersId) {
        this.followerId = followerId;
        this.usersId = usersId;
    }
}
