package com.todoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.domain.TodoItem;
import com.todoapp.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepo;

	public List<TodoItem> fetchAllTodos(){
		return todoRepo.findAll();
	}

	public TodoItem updateTodoItem(Integer id, TodoItem todoItem) {
		Optional<TodoItem> existingItem = todoRepo.findById(id);
		if (existingItem.isPresent()) {
			TodoItem item = existingItem.get();
			item.setIsDone(todoItem.getIsDone());
			item.setTask(todoItem.getTask());
			return todoRepo.save(item);
		}
		return null;
	}

	public TodoItem createNewTodoItem() {
		TodoItem todoItem = new TodoItem();
		todoItem.setIsDone(false);
		todoItem.setTask("Click to edit task name");
		return todoRepo.save(todoItem);
	}

	public void deleteTodoItem(Integer id) {
		todoRepo.deleteById(id);
	}
}

