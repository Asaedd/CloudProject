package com.notekeeperpro.core.Model;

import java.util.List;

public class User {

    private Long id;

    private String username;
    private String email;
    private String password;

    private List<Note> notes;

    private List<Permission> sharedNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Permission> getSharedNotes() {
        return sharedNotes;
    }

    public void setSharedNotes(List<Permission> sharedNotes) {
        this.sharedNotes = sharedNotes;
    }
}
