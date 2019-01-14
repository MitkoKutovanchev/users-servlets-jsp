<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<t:layoutTemplate>
	<jsp:attribute name="header">
		<h2 align="center">List of users</h2>
	</jsp:attribute>
	<jsp:attribute name="footer">
		<h3 align="center">Sample footer from the ListUsers page</h3>
	</jsp:attribute>
	<jsp:body>
		<table align="center" border="1">
			<tr>
				<th>User</th>
				<th>Email</th>
				<th>Password(for example)</th>
				<th>Actions</th>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.password}</td>
					<td>
						<a href="/users-servlets-jsp/user/${user.id}"><button>View</button></a>
						<a href="/users-servlets-jsp/edit/${user.id}"><button>Edit</button></a>
						<a href="/users-servlets-jsp/delete/${user.id}"><button>Delete</button></a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</jsp:body>
</t:layoutTemplate>