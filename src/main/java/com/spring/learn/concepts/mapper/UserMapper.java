package com.spring.learn.concepts.mapper;

import com.spring.learn.concepts.dto.internal.UserDto;
import com.spring.learn.concepts.dto.request.UserRequest;
import com.spring.learn.concepts.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

     UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

     UserDto mapUserToUserDto(UserRequest user);

     User mapUserDtoToUser(UserDto userDto);

}
