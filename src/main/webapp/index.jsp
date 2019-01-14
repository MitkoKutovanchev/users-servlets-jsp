<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layoutTemplate>
<jsp:attribute name="header">
	<h2 align = "center"> Welcome, please choose: </h2>
</jsp:attribute>
<jsp:attribute name="footer">
	<h4 align = "center">sample footer from index page</h4>
</jsp:attribute>
<jsp:body>
<table width="35%" align="center" border="1px solid black">
	<tr style="height:100px">
		<td><button style="height:100px;width:100%" onclick="location.href='/users-servlets-jsp/users';">List</button></td>
		<td><button style="height:100px;width:100%" onclick="location.href='/users-servlets-jsp/user';">Add</button></td>
	</tr>
</table>
</jsp:body>
</t:layoutTemplate>