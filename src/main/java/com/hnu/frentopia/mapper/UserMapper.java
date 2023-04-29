package com.hnu.frentopia.mapper;

import com.hnu.frentopia.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void createUser(User user);
}
