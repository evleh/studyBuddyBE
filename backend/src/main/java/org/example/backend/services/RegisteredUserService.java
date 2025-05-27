package org.example.backend.services;

import org.example.backend.exceptions.UserDoesNotExistException;
import org.example.backend.model.RegisteredUser;
import org.example.backend.repository.RegisteredUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisteredUserService {
    private RegisteredUserRepository registeredUserRepository;


    public List<RegisteredUser> readAll(){
        return registeredUserRepository.findAll();
    }

    public RegisteredUser read(String id){
        Optional<RegisteredUser> user = registeredUserRepository.findById(id);
        if(user.isEmpty()) {
            throw new UserDoesNotExistException();
        }

        return user.get();
    }

    public RegisteredUser update(String id, RegisteredUser registeredUser){
        return null;
    }

    public RegisteredUser create(RegisteredUser registeredUser){
        return registeredUserRepository.save(registeredUser);

    }

    public RegisteredUser delete(String id){
        return null;
    }
}
