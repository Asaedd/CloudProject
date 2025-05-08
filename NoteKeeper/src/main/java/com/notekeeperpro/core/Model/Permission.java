package com.notekeeperpro.core.Model;

import jakarta.persistence.*;

@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AccessType accessType; // VIEW or EDIT

    @ManyToOne
    @JoinColumn(name = "note_id")
    private Note note;

    @ManyToOne
    @JoinColumn(name = "shared_with_user_id")
    private User sharedWith;

    // Getters and Setters
}
