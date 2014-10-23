package todolist.service;

import java.util.List;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import todolist.dao.TodoDaoRemote;
import todolist.model.Todo;

/**
 * Session Bean implementation class TodoService
 */
@Stateless
@LocalBean
@DeclareRoles({"ADMIN", "USER"})
public class TodoService implements TodoServiceRemote {
	@EJB
	private TodoDaoRemote todoDaoRemote;

	@Override
	@RolesAllowed("ADMIN")
	public void addTodo(Todo todo) {
		todoDaoRemote.add(todo);
	}

	@Override
	@RolesAllowed("ADMIN")
	public void updateTodo(Todo todo) {
		todoDaoRemote.update(todo);
	}

	@Override
	@RolesAllowed("ADMIN")
	public void removeTodo(Integer id) {
		todoDaoRemote.remove(id);
	}

	@Override
	public Todo findTodoById(Integer id) {
		return todoDaoRemote.findById(id);
	}

	@Override
	public List<Todo> findTodoAll() {
		return todoDaoRemote.findAll();
	}


}
