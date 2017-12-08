<%@ include file="../inc/header.jsp"%>

<p>
	<a href="home.jsp"> Home </a>
</p>

<%
	Library library = Library.getInstance();
	List<Book> list = library.getAll();
%>

<table>
	<tr>
		<td width=10%>Id</td>
		<td width=30%>Titre</td>
		<td width=20%>Nombre de pages</td>
	</tr>

	<%
		for (Book b : list) {
	%>
	<tr>
		<td id="id_book"><%=b.getId()%></td>
		<td><a href="bookdetail.jsp?id=<%=b.getId()%>"> <%=b.getTitle()%>
		</a></td>
		<td><%=b.getNbPages()%></td>
	</tr>
	<%
		}
	%>
</table>

<%@ include file="../inc/footer.jsp"%>
