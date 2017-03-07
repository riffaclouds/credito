
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div style="text-align: center;">
		<c:if test="${signed == false}">
			<h2>${message}</h2>
			<h1>you are not logged in!</h1>
		</c:if>
		
		<c:if test="${signed == true}">
			<h1 >welcome ${user.firstName} ${user.lastName} you are logged in!</h1>
			
			<form action="UserControllerServlet" method="GET">
				<input type="hidden" name="command" value="LOGOUT">
				<input type="submit" name="logoutButton" value="Logout">
			</form>
		</c:if>
		
		<br>

		<h1><a href="index.jsp">go back</a></h1>
	</div>
	

</body>
</html>