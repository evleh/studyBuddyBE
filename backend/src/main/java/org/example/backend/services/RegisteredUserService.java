package org.example.backend.services;

import org.example.backend.model.RegisteredUser;
import org.example.backend.repository.RegisteredUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisteredUserService {
    private RegisteredUserRepository registeredUserRepository;


    public List<RegisteredUser> readAll(){
        return null;
    }

    public RegisteredUser read(String id){
        return null;
    }

    public RegisteredUser update(String id, RegisteredUser registeredUser){
        return null;
    }

    public RegisteredUser create(RegisteredUser registeredUser){
        return null;
    }

    public RegisteredUser delete(String id){
        return null;
    }
}
