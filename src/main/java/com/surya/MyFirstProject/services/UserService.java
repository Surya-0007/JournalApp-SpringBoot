package com.surya.MyFirstProject.services;

import com.surya.MyFirstProject.entity.JournalEntry;
import com.surya.MyFirstProject.entity.User;
import com.surya.MyFirstProject.repository.JournalEntryRepository;
import com.surya.MyFirstProject.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> getById(ObjectId Id){
        return userRepository.findById(Id);
    }

    public void deleteById(ObjectId Id){
        userRepository.deleteById(Id);
    }
}
