package io.github.eugenezzf.Hostel.DTO;

// import io.github.eugenezzf.Hostel.enums.ROLE;

public record CreateUserRequest(
    String first_name,
    String last_name,
    String email, 
    String password
    // ROLE role
) {

}
