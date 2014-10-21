package todolist.dao;

import java.util.List;

import javax.ejb.Remote;

import todolist.model.Todo;

@Remote
public interface TodoDaoRemote {
	public void add(Todo todo);
	public void update(Todo todo);
	public void remove(Integer id);
	public Todo findById(Integer id);
	public List<Todo> findAll();
}
