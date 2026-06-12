package com.study.note_service.controller;

import com.study.note_service.DTO.request.CreateNotesRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notes/")
public class NotesController {

    @PostMapping("/create")
    public String createNotes(@RequestBody CreateNotesRequest request){
        return "note created";
    }


}
