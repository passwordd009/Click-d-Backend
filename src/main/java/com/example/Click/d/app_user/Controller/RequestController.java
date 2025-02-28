package com.example.Click.d.app_user.Controller;
import com.example.Click.d.app_user.Model.Requests;
import com.example.Click.d.app_user.Service.RequestService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("api/user/request")
public class RequestController {
    @Autowired
    private RequestService requestService;

    @PostMapping
    public ResponseEntity<Requests> makeRequest(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Requests>(requestService.makeRequest(payload.get("userId"), payload.get("groupProfileId")), HttpStatus.CREATED);
    }
    @PostMapping("/accept")
    public ResponseEntity<Requests> acceptRequest(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Requests>(requestService.acceptRequest(payload.get("requestId")), HttpStatus.CREATED);
    }

}
