package com.challenge.meisters.controller;

import com.challenge.meisters.task.Task;
import com.challenge.meisters.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }
    @PostMapping
    public void createTask(@RequestBody Task task) {
        taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public void updateTask(@PathVariable Long id, @RequestBody Task task) {
        if (taskRepository.existsById(id)) {
            task.setId(id);
            taskRepository.save(task);
        }
    }


}
