<%@ include file="../inc/header.jsp"%>

<div>
	<% UserBean user = (UserBean) session.getAttribute("USER");
	
	if (user!=null) {%>
		<%= user.getLogin() %> est connecté(e) depuis le <%= user.getLoginDate() %>.
	<% }%>
</div>

<div>
	<h2>HELLO WOOOOOOOOOORLD</h2>
	<%=new Date()%>
	<h3>
		<a href="data.jsp"> Librairie </a>
	</h3>
</div>

<%@ include file="../inc/footer.jsp"%>