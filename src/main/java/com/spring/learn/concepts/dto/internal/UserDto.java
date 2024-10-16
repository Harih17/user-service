package com.spring.learn.concepts.dto.internal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String name;
    private int age;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
}
