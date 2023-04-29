package com.hnu.frentopia.mapper;

import com.hnu.frentopia.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    void createUser(User user);
}
