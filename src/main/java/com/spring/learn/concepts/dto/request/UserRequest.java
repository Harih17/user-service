package com.spring.learn.concepts.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {

    @NotBlank(message = "Username is required")
    @JsonProperty("name")
    private String name;

    @Min(value = 10, message = "Minimum age to create an account is 10")
    @JsonProperty("age")
    private int age;

    @NotBlank(message = "Date of birth is required")
    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Provide birth date in DD-MM-YYYY")
    @JsonProperty("birthDate")
    private String birthDate;

    @JsonProperty("address")
    private String address;

    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 10, message = "Provide valid phone number")
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @NotBlank(message = "Email id is required")
    @Email(message = "Provide valid email id")
    @JsonProperty("emailAddress")
    private String emailAddress;

}
