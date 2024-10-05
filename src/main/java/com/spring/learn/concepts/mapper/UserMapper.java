package com.spring.learn.concepts.mapper;

import com.spring.learn.concepts.dto.internal.UserDto;
import com.spring.learn.concepts.dto.request.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    public UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public UserDto mapUserToUserDto(User user);

}
