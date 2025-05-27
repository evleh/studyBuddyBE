package org.example.backend.controller;

import org.example.backend.model.RegisteredUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registeredUsers")
public class RegisteredUserController {

    @GetMapping
    public List<RegisteredUser> readAll(){
        return null;
    }

    @GetMapping("/{id}")
    public RegisteredUser read(@PathVariable String id){
        return null;
    }

    @PostMapping
    public RegisteredUser create(@RequestBody RegisteredUser registeredUser){
        return null;
    }

    @PutMapping("/{id}")
    public RegisteredUser update(@PathVariable String id, @RequestBody RegisteredUser registeredUser) {
        return null;
    }

    //update delete
    @DeleteMapping("/{id}")
    public RegisteredUser delete(@PathVariable String id){
        return null;
    }

    }
