package com.example.taskmanager.controller;

import com.example.taskmanager.exception.TaskNotFoundException;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.service.TaskService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.data.domain.Sort.by;


// Controller → gestione HTTP

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    private final TaskRepository taskRepository;

    public TaskController(TaskService taskService, TaskRepository taskRepository) {
        this.taskService = taskService;
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/active")
    public List<Task> getActiveTasks() {
        return taskRepository.findByCompleted(false);
    }

    @GetMapping("/due")
    public List<Task> getTasksDue() {
        return taskRepository.findByDueDateBefore(LocalDate.now());
    }

    @GetMapping("/sorted")
    public List<Task> getTasksSorted() {
        return taskService.getAllTasksSorted(Sort.by("dueDate"));
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}/complete")
    public Task completeTask(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        task.setCompleted(true);
        return taskService.createTask(task);
    }


}