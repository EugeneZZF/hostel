package io.github.eugenezzf.Hostel.entities;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
@Table (name="guests")
public class Guest {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="first_name" , nullable = false)
    private String first_name;
    @Column (name="last_name",nullable = false)
    private String last_name;

    
}
