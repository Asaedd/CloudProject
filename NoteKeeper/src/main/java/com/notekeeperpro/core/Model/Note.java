package com.notekeeperpro.core.Model;

import java.time.LocalDateTime;
import java.util.List;

public class Note {

    private Long id;

    private String title;

    private String content;
    

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private User owner;

    private List<Tag> tags;

    private List<NoteVersion> versions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<NoteVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<NoteVersion> versions) {
        this.versions = versions;
    }
}
