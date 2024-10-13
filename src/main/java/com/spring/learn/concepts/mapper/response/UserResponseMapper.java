package com.spring.learn.concepts.mapper.response;

import com.spring.learn.concepts.constants.UserConstants;
import com.spring.learn.concepts.dto.response.ResponseMessage;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.text.MessageFormat;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseMapper {

    public static ResponseMessage formatResponseMessage(Long userId) {
        String message = MessageFormat.format(UserConstants.SUCCESS_MESSAGE, userId.toString());
        return ResponseMessage.builder().message(message).build();
    }

}
