package io.github.eugenezzf.Hostel.service;

import java.time.LocalDateTime;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.github.eugenezzf.Hostel.DTO.CreateUserRequest;
import io.github.eugenezzf.Hostel.entities.User;
import io.github.eugenezzf.Hostel.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;



    public String getHello(){
        return "hello world!";
    }

    public User createUser(CreateUserRequest requestUser){
        
        User user = new User();
        user.setEmail(requestUser.email());
        user.setFirst_name(requestUser.first_name());
        user.setLast_name(requestUser.last_name());

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }
}
