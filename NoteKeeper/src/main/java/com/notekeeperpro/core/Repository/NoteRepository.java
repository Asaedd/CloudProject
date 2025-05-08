package com.notekeeperpro.core.Repository;

import com.notekeeperpro.core.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoteRepository{
    List<Note> findByOwnerId(Long ownerId);
    Note save(Note note);
}
