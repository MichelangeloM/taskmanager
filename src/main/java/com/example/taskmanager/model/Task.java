package com.example.taskmanager.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String title;
    private String description;
    @Setter
    private boolean completed;
    @Setter
    private LocalDate dueDate;

    public Task() {}

}