package com.notekeeperpro.usecases;

import com.notekeeperpro.core.Model.Note;
import com.notekeeperpro.core.Model.User;
import com.notekeeperpro.core.Repository.NoteRepository;
import com.notekeeperpro.core.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CreateNoteUseCase {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;

    public CreateNoteUseCase(NoteRepository noteRepository, UserRepository userRepository) {
        this.noteRepository = noteRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public Note execute(String title, String htmlContent, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Note note = new Note();
        note.setTitle(title);
        note.setContent(htmlContent);
        note.setOwner(user);
        note.setCreatedAt(LocalDateTime.now());
        note.setUpdatedAt(LocalDateTime.now());

        return noteRepository.save(note);
    }
}
