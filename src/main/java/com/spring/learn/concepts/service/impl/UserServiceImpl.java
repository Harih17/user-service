package com.spring.learn.concepts.service.impl;

import com.spring.learn.concepts.dto.internal.UserDto;
import com.spring.learn.concepts.entity.User;
import com.spring.learn.concepts.mapper.UserMapper;
import com.spring.learn.concepts.repository.UserRepository;
import com.spring.learn.concepts.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    @Override
    public Long processUserInformation(UserDto userDto) {

        log.info("[UserServiceImpl] Processing user request : {}", userDto);
        User user = UserMapper.INSTANCE.mapUserDtoToUser(userDto);
        user = userRepository.save(user);
        log.info("[UserServiceImpl] User Saved to DB with Id : {}", user.getId());
        return user.getId();

    }

}
