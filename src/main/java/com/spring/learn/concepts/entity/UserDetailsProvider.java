package com.spring.learn.concepts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serialCode;
    private String name;
    private int age;
    private String dateofBirth;
    private String phoneNumber;
    private String email;
    private String address;

}
