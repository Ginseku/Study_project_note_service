package com.study.note_service;

import com.study.note_service.entity.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepository extends JpaRepository<NotesEntity, Long> {

    List<NotesEntity> findAllByUserId(
            Long userId
    );

}
