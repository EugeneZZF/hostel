package io.github.eugenezzf.Hostel.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.eugenezzf.Hostel.DTO.LoginRequest;
import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/auth")
@AllArgsConstructor 
public class AuthController {

    private final AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.email(), request.password()));
        return "Успешная аунтификация";
    }

}
