<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div id="pageheader">
      <jsp:invoke fragment="header"/>
    </div>
    <div style="height:25px;width:100%"></div>
    <div id="body">
      <jsp:doBody/>
    </div>
    <div style="height:35px;width:100%"></div>
    <div id="pagefooter">
      <jsp:invoke fragment="footer"/>
    </div>
</body>
</html>