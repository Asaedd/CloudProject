package com.notekeeperpro.core.Model;

public class Permission {

    private Long id;

    private AccessType accessType; // VIEW or EDIT

    private Note note;

    private User sharedWith;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public User getSharedWith() {
        return sharedWith;
    }

    public void setSharedWith(User sharedWith) {
        this.sharedWith = sharedWith;
    }
}
