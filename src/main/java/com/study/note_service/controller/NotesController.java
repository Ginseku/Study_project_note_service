package com.study.note_service.controller;

import com.study.note_service.DTO.request.CreateNotesRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NotesController {

    @PostMapping("/create")
    public String createNotes(@RequestBody CreateNotesRequest request){
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
