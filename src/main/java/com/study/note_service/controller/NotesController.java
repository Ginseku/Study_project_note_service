package com.study.note_service.controller;

import com.study.note_service.DTO.request.CreateNotesRequest;
import com.study.note_service.services.NoteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes") //could use if we have Bearer token
public class NotesController {

    private final NoteService noteService;

    public NotesController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/create")
    public String createNotes(@RequestBody CreateNotesRequest request){
        noteService.createNote(request);
        return "note created";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteNotes(@PathVariable int id){
        return "note deleted";
    }

    @GetMapping
    public String getMyNotes(){
        return "My list of notes";
    }

}
