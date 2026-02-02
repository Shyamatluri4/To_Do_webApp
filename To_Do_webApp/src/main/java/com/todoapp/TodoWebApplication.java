package com.todoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.todoapp.domain.TodoItem;
import com.todoapp.repository.TodoRepository;

@SpringBootApplication
public class TodoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoWebApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(TodoRepository todoRepo) {
		return args -> {
			if (todoRepo.count() == 0) {
				TodoItem item = new TodoItem();
				item.setTask("Click to edit task name");
				item.setIsDone(false);
				todoRepo.save(item);
			}
		};
	}

}
