package com.spring.learn.concepts.controller;

import com.spring.learn.concepts.dto.internal.UserDto;
import com.spring.learn.concepts.dto.request.User;
import com.spring.learn.concepts.dto.response.ResponseMessage;
import com.spring.learn.concepts.mapper.UserMapper;
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

    @PostMapping
    public ResponseEntity<ResponseMessage> createUser(@RequestBody @Valid User user) {

      log.info("[UserController] Inside createUser method, Request : {}", user);
      UserDto userDto = UserMapper.INSTANCE.mapUserToUserDto(user);
      log.info("[UserController] User Name: {}", userDto.getName());
      return null;

    }

}
