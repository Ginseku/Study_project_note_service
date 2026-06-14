package com.study.note_service.services;

import com.study.note_service.DTO.request.CreateNotesRequest;
import com.study.note_service.repository.NotesRepository;
import com.study.note_service.entity.NotesEntity;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    private final NotesRepository notesRepository;

    public NoteService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public void createNote(CreateNotesRequest request){
        NotesEntity note = new NotesEntity();
        note.setTitle(request.title());
        note.setContent(request.content());
        notesRepository.save(note);
    }

}
