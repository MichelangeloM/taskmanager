package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;




public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed);
    // Quello che succede è che Spring legge la query per quello che è
    // ovvero che crea una connessione, fa la query e la restituisce
    // leggendo immediatamente findBy + Completed
    List<Task> findByDueDateBefore(LocalDate date);
}