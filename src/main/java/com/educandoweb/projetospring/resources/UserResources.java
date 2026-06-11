package com.educandoweb.projetospring.resources;

import com.educandoweb.projetospring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;


@RestController
@RequestMapping(value = "/user")
public class UserResources {
    @GetMapping
    public ResponseEntity<User>findAll() {
        User u = new User(1L,"Pedro","pedro@gmail.com","18988213514","12345");
        return ResponseEntity.ok().body(u);
    }
}
