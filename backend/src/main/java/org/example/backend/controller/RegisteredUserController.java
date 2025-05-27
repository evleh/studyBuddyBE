package org.example.backend.controller;

import org.example.backend.model.RegisteredUser;
import org.example.backend.services.RegisteredUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registeredUsers")
public class RegisteredUserController {
    private final RegisteredUserService registeredUserService;

    public RegisteredUserController(RegisteredUserService registeredUserService) {
        this.registeredUserService = registeredUserService;
    }

    @GetMapping
    public List<RegisteredUser> readAll(){
        return registeredUserService.readAll();
    }

    @GetMapping("/{id}")
    public RegisteredUser read(@PathVariable String id){
        return registeredUserService.read(id);
    }

    @PostMapping
    public RegisteredUser create(@RequestBody RegisteredUser registeredUser){
        return registeredUserService.create(registeredUser);
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
