package com.testing.Application.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;


@Entity
@Table(name = "form_data")
public class FormData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Department is required")
    private String department;

    // Constructors
    public FormData() {}

    public FormData(String name, String email, LocalDate dateOfBirth, String department) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
