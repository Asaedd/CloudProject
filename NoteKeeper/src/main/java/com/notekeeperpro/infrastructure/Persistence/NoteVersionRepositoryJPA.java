package com.notekeeperpro.infrastructure.Persistence;

import com.notekeeperpro.core.Model.NoteVersion;
import com.notekeeperpro.core.Repository.NoteVersionRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteVersionRepositoryJPA extends NoteVersionRepository ,JpaRepository<NoteVersion, Long> {
    List<NoteVersion> findByNoteId(Long noteId);
}
