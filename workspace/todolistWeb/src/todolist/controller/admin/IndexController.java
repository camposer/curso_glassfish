package todolist.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminIndexController", urlPatterns = { "/admin/index" })
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin/index.jsp").forward(request, response);
	}

}
