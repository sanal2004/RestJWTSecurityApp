package com.example.restjwtsecurityapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.restjwtsecurityapp.entities.User;
import com.example.restjwtsecurityapp.entities.Role;
import com.example.restjwtsecurityapp.repositories.RoleRepository;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}