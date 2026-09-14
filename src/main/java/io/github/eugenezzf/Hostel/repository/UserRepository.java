package io.github.eugenezzf.Hostel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.eugenezzf.Hostel.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
     Optional<User> findByEmail(String email);
}
