package com.hnu.frentopia.service;

import com.hnu.frentopia.Repository.UserRepo;

import com.hnu.frentopia.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    UserRepo userrepo;
    @Transactional
    public List<User> SelectAll(){
        return userrepo.findAll();
    }

    public User SelectUser(String id){
        return userrepo.findById(id).get();
    }

    public void CreateUser(User user){
        userrepo.save(user);
    }

    public void DeleteUser(String id){
        userrepo.deleteById(id);
    }
}