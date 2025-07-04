package com.notekeeperpro.core.Repository;

import com.notekeeperpro.core.Model.NoteVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteVersionRepository{
    List<NoteVersion> findByNoteId(Long noteId);
}
