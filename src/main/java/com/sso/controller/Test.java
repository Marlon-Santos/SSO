package com.sso.controller;

import com.sso.entity.Users;
import com.sso.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public ResponseEntity<List<Users>> test(){
        return ResponseEntity.ok(usersRepository.findAll());
    }
}
