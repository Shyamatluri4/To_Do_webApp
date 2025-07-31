package com.todoapp.todolist.controller;

import com.todoapp.todolist.model.Task;
import com.todoapp.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*") // Allow requests from any frontend
public class TaskController {

    @Autowired
    private TaskRepository taskRepo;

    // Create a new task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepo.save(task);
    }

    // Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
}
