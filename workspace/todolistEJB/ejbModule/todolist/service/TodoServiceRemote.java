package todolist.service;

import java.util.List;

import javax.ejb.Remote;

import todolist.model.Todo;

@Remote
public interface TodoServiceRemote {
	public void addTodo(Todo todo);
	public void updateTodo(Todo todo);
	public void removeTodo(Integer id);
	public Todo findTodoById(Integer id);
	public List<Todo> findTodoAll();
}
