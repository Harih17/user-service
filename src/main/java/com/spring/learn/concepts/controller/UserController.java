package com.spring.learn.concepts.controller;

import com.spring.learn.concepts.dto.internal.UserDto;
import com.spring.learn.concepts.dto.request.UserRequest;
import com.spring.learn.concepts.dto.response.ResponseMessage;
import com.spring.learn.concepts.mapper.UserMapper;
import com.spring.learn.concepts.mapper.response.UserResponseMapper;
import com.spring.learn.concepts.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    public final UserService userService;

    @PostMapping
    public ResponseEntity<ResponseMessage> createUser(@RequestBody @Valid UserRequest user) {

        log.info("[UserController] Inside createUser method, Request : {}", user);
        UserDto userDto = UserMapper.INSTANCE.mapUserToUserDto(user);
        log.info("[UserController] User Name: {}", userDto.getName());
        Long userId = userService.processUserInformation(userDto);
        return ResponseEntity.ok(UserResponseMapper.formatResponseMessage(userId));

    }

}
