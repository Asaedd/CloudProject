package com.notekeeperpro.infrastructure.Persistence;

import com.notekeeperpro.core.Model.Note;
import com.notekeeperpro.core.Repository.NoteRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepositoryJPA extends NoteRepository , JpaRepository<Note, Long>{
    @Override
    List<Note> findByOwnerId(Long ownerId);
}
