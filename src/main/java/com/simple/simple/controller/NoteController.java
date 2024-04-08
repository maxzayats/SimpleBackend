package com.simple.simple.controller;

import com.simple.simple.model.Note;
import com.simple.simple.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {
    private final NoteRepository repository;

    @Autowired
    public NoteController(NoteRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/api/notes")
    private List<Note> addNotes(@RequestBody List<Note> notes){
        return repository.saveAll(notes);
    }

    @GetMapping("/hello")
    private Note hello(){
        Note note = new Note();
        note.setId(1L);
        note.setText("Hello");
        note.setTitle("Hello");
        return note;
    }
}
