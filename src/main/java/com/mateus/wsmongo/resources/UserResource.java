package com.mateus.wsmongo.resources;

import com.mateus.wsmongo.domains.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        list.addAll();
        return ResponseEntity.ok().body(list);
    }

}
