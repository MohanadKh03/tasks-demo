package com.example.tasks.service;

import com.example.tasks.model.Task;
import com.example.tasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    public Collection<Task> getTasks(){
        return taskRepository.findAll();
    }
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
}
