package todolist.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todolist.model.Todo;
import todolist.service.TodoServiceRemote;

@WebServlet("/index")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private TodoServiceRemote todoServiceRemote;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Todo> todos = todoServiceRemote.findTodoAll();
		request.setAttribute("todos", todos); // Pasando la lista de todos a la JSP
		
		// Redireccionando a la JSP
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}

}
