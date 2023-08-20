package com.example.restjwtsecurityapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.example.restjwtsecurityapp.entities.Role;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String email;
}

