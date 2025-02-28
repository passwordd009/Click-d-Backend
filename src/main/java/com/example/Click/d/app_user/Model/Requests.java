package com.example.Click.d.app_user.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "requests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Requests {
    @Id
    private ObjectId id;
    private String userId;
    private String groupProfileId;
    private Boolean isAccepted;

    public Requests(String userId, String groupProfileId) {
       this.userId = userId;
       this.groupProfileId = groupProfileId;
       this.isAccepted = false;
    }
}
