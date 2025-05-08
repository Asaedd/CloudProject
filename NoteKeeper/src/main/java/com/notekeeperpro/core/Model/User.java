package com.notekeeperpro.core.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Note> notes;

    @OneToMany(mappedBy = "sharedWith", cascade = CascadeType.ALL)
    private List<Permission> sharedNotes;

    // Getters and Setters
}
