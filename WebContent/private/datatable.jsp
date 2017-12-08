<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach" import="tp.data.*" import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Il faut inclure les librairies js et css. On utilise du js pour la datatable donc la balise <script> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TP DATA</title>
</head>
<body>
		<% Library library = Library.getInstance();
		List<Book> list = library.getAll();%>
		
	<table>
		<tr>
			<td width=10%>Id</td>
			<td width=30%>Titre</td>
			<td width=20%>Nombre de pages</td>
		</tr>
		
		<% for (Book b : list) { %>
		<tr>
			<td> <%= b.getId()%> </td>
			<td> <%= b.getTitle()%></td>
			<td> <%= b.getNbPages()%> </td>
		</tr>
		<% } %>
		
			

	</table>
</body>
</html>