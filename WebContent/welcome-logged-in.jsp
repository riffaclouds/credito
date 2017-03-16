
<!-- import the header -->
<%@ include file="header.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>JSP opdrachten</title>
<link rel="stylesheet" type="text/css" href="headerStyle.css">
</head>
<body>
	
	<h1>Welcome page</h1>
	
	<p>
	welcome: ${user.firstName} ${user.lastName}<br>
	your password is: ${user.password}<br>
	your id is: ${user.id}
	
	</p>
	
	
		
</body>
</html>