<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix ="u" tagdir="/WEB-INF/tags" %>

<t:layoutTemplate>
<jsp:attribute name="header">
	<h2 align = "center"> Information for ${user.name} </h2>
</jsp:attribute>
<jsp:attribute name="footer">
	<h4 align = "center">sample footer from viewUser page</h4>
</jsp:attribute>
<jsp:body>
	<u:userFormTemplate>
	</u:userFormTemplate>
</jsp:body>
</t:layoutTemplate>