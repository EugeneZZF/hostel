package io.github.eugenezzf.Hostel.DTO;

public record CreateUserRequest(
    String first_name,
    String last_name,
    String email, 
    String password
) {

}
