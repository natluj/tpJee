<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"
	import="tp.data.*" import="java.util.*" import="tp.login.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TP DATA</title>
</head>
<body>
<form id="logout" action="./logout">
	<input type="submit" value="se déconnecter"> 
</form>