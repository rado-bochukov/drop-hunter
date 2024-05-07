package com.example.dropfarmer.repository;

import com.example.dropfarmer.model.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity,Long> {
}
