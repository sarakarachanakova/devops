package com.example.sampletodoapp.repository;

import com.example.sampletodoapp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepo extends JpaRepository<ToDo, Long> {

    List<ToDo> findAll();
}
