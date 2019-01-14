<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>

<t:layoutTemplate>
	<jsp:attribute name="header">
		<h2 align="center">Add a User</h2>
	</jsp:attribute>
	<jsp:attribute name="footer">
		<h4 align="center">A footer from the create user page... probs some copyright things</h4>
	</jsp:attribute>
	<jsp:body>
		<u:userFormTemplate>
		</u:userFormTemplate>
	</jsp:body>
</t:layoutTemplate>