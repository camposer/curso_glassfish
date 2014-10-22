<%@page import="todolist.model.Todo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Todo list</title>
	<style>
		#todolist {
			width: 80%;
			margin-left: auto;
			margin-right: auto;
		}
	</style>
</head>
<body>
	<h1>Todo list</h1>
	<div id="todolist">
		<% 
			List<Todo> todos = (List<Todo>)request.getAttribute("todos");
			if (todos != null) for (Todo t : todos) {
		%>
			<div class="todo">
				<div class="titulo"><%= t.getTitulo() %></div>
				<div class="texto"><%= t.getTexto() %></div>
			</div>
		<%
			}
		 %>
	</div>
	<a href="admin/index">Admin</a>
</body>
</html>