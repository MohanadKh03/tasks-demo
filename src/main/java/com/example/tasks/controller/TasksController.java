package com.example.tasks.controller;

import com.example.tasks.model.Task;
import com.example.tasks.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@AllArgsConstructor
public class TasksController {

    private final TaskService taskService;

    @GetMapping(value = {"","/"})
    public ResponseEntity<Object> listTasks(){
        return new ResponseEntity<>(taskService.getTasks(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveTask(@RequestBody Task task){
        return new ResponseEntity<>(taskService.saveTask(task),HttpStatus.OK);
    }

}
