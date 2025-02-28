package com.example.Click.d.app_user.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "groupProfiles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupProfile {
    @Id
    private String id;

    public GroupProfile(  String adminId, String name, String description, String imgUrl) {
        this.adminId = adminId;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
    }
    private String adminId;
    private String name;
    private String description;
    private String imgUrl;

}
