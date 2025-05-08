package com.notekeeperpro.web.Controller;

import com.notekeeperpro.core.Model.Note;
import com.notekeeperpro.usecases.CreateNoteUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final CreateNoteUseCase createNoteUseCase;

    public NoteController(CreateNoteUseCase createNoteUseCase) {
        this.createNoteUseCase = createNoteUseCase;
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody NoteRequest request) {
        Note saved = createNoteUseCase.execute(request.title, request.content, request.userId);
        return ResponseEntity.ok(saved);
    }

    public static class NoteRequest {
        public String title;
        public String content;
        public Long userId;
    }
}
