package todolist.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import todolist.model.Todo;

/**
 * Session Bean implementation class TodoDao
 */
@Stateless
@LocalBean
public class TodoDao implements TodoDaoRemote {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(Todo todo) {
		entityManager.persist(todo);
	}

	@Override
	public void update(Todo todo) {
		entityManager.merge(todo);
	}

	@Override
	public void remove(Integer id) {
		Query q = entityManager.createQuery("DELETE FROM Todo t WHERE t.id = :id"); // JQL
		q.setParameter("id", id);
		q.executeUpdate();
	}

	@Override
	public Todo findById(Integer id) {
		return entityManager.find(Todo.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Todo> findAll() {
		return entityManager.createQuery("SELECT t FROM Todo t").getResultList();
	}

}
