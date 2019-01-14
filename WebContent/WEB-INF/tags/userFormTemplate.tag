<%@ tag language="java" pageEncoding="ISO-8859-1"%>
		<center><form id="userForm" action = "${action}" method= "${method}">
			<input type="text" name="id" value="${user.id}" hidden="true">
			Name: <br>
			<input type="text" name="name" value = "${user.name}" ${readonly}><br><br>
			Email: <br>
			<input type="text" name="email" value = "${user.email}" ${readonly}><br><br>
			Password (again for example)<br>
			<input type="text" name="password" value = "${user.password}" ${readonly}><br><br>
			 <input type="submit" value="${btnValue}" form="userForm" style="margin:auto;>
  display:block;">
		</form></center>