package com.hnu.frentopia.service;

import com.hnu.frentopia.mapper.UserMapper;
import com.hnu.frentopia.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService {
    SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:sss");
    Date time = new Date();
    String localTime = format.format(time);
    @Autowired
    UserMapper userMapper;

    @Transactional
    public void createUser(User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setUserPW(passwordEncoder.encode(user.getUserPW()));
        user.setUserCreateAt(localTime);
        userMapper.createUser(user);
    }
}