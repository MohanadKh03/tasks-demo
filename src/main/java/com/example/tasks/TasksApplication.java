package com.example.tasks;

import com.example.tasks.model.Task;
import com.example.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(TaskService taskService){
        return args -> {
            for(int i=0;i<10;i++){
                taskService.saveTask(new Task((long)(i+100),
                                        "Task #" + i,
                                        LocalDate.now().plusDays(i),
                                        false)
                );
            }
        };
    }

}
