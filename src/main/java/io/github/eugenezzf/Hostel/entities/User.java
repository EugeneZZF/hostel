package io.github.eugenezzf.Hostel.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor 
@ToString 
@Getter 
@Setter  
public class User {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;


    @Column (name="password")
    private String password;
    
    

    @Column(name="created_at", nullable = false)
    private LocalDateTime createdAt;

    // @OneToMany(mappedBy = "user")
    // private Guest guest;
}

