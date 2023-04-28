package com.hnu.frentopia.service;
import com.hnu.frentopia.domain.User;
import com.hnu.frentopia.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class UserService implements UserServiceImpl {

    private final UserMapper UserMapper;

    @Autowired // 한개면 생략 가능
    public UserService(UserMapper userMapper) {
        this.UserMapper = userMapper;
    }

    /*
        회원 조회
     */

    @Override
    public Optional<User> findById(String userId) {
        validateExistMember(userId);
        return UserMapper.selectById(userId);

    }
    public void validateExistMember(String userId){
        UserMapper.selectById(userId)
                .ifPresentOrElse(member -> {},
                        () -> {throw new IllegalStateException("아이디가 존재하지 않습니다.");});
    }

    /*
        모든 회원 조회
     */

    @Override
    public List<User> findAll() {
        return new ArrayList<>(UserMapper.selectAll());
    }
}
