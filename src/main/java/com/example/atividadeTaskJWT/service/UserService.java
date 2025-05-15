package com.example.atividadeTaskJWT.service;

import com.example.atividadeTaskJWT.domain.User;
import com.example.atividadeTaskJWT.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User create(User user){
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User update(Long id, User user){
        User userFound = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found!"));

        userFound.setUsername(user.getUsername());
        userFound.setPassword(user.getPassword());

        return repository.save(userFound);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
