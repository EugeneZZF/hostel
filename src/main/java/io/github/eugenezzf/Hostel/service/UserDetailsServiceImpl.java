package io.github.eugenezzf.Hostel.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.eugenezzf.Hostel.entities.User;
import io.github.eugenezzf.Hostel.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class UserDetailsServiceImpl implements UserDetailsService{
    private final UserRepository userRepository;

    @Override 
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        User user = userRepository.findByEmail(email)
        .orElseThrow(()-> new UsernameNotFoundException("User not found: " + email));

        return org.springframework.security.core.userdetails.User
        .withUsername(user.getEmail()).password(user.getPassword()).roles("USER").build();
    }
}
