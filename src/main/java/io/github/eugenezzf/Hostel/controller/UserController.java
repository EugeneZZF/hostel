package io.github.eugenezzf.Hostel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.eugenezzf.Hostel.DTO.CreateUserRequest;
import io.github.eugenezzf.Hostel.entities.User;
import io.github.eugenezzf.Hostel.service.UserService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/users/")
@AllArgsConstructor 
public class UserController {

    UserService userService;

    @GetMapping("/")
    public String getHello(){
        return userService.getHello();
    }

    @PostMapping
    public User createUser(@RequestBody CreateUserRequest user){
        return userService.createUser(user);
    }

    
}
