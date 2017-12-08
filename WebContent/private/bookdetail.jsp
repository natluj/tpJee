<%@ include file="../inc/header.jsp"%>

<p>
	<a href="home.jsp"> Home </a>
</p>

<%
	String id_book = request.getParameter("id");
	Library library = Library.getInstance();
	Book b = library.getById(Integer.parseInt(id_book));
%>

<h1>
	Titre :
	<%=b.getTitle()%></h1>
<p>
	Nombre de pages :
	<%=b.getNbPages()%>
</p>
<p>
	Mots-clef :
	<%=b.getKeywords()%>

	
<p>
	<a href="data.jsp">Back</a> </p>
	
<%@ include file="../inc/footer.jsp"%>