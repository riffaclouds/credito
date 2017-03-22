<!-- import the header -->
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<title>Lijst van alle Organisaties in de Credito DataBase</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
	
		<h1>Organisaties overzicht</h1>
		<!-- print the list -->
		<div id="userTable">
		<table id="table">
			<tr>
				<th>id</th>
				<th>Naam</th>
				<th>domein</th>
				<th>actief</th>	
				<th>actie(id)</th>	
			</tr>
			
			<c:forEach var="organisatie" items="${orgLijst}">
			
			
			<c:url var="updateURL" value="UserControllerServlet">
				<!-- create update link for each student -->	
				<c:param name="command" value="LOAD" />
				<c:param name="userId" value="${organisatie.id}" />
			</c:url>
			
			<c:url var="deleteURL" value="UserControllerServlet">
				<!-- create delete link for each student -->
				<c:param name="command" value="DELETE" />
				<c:param name="userId" value="${organisatie.id}" />
			</c:url>
			
			<tr>
				<td>${organisatie.id}</td>
				<td>${organisatie.naam}</td>
				<td>${organisatie.domein}</td>
				<td>${organisatie.actief}</td>

				<td><a href="${updateURL}">Update</a> | 
				<a href="${deleteURL}" onclick="if (!(confirm('Weet u zeker dat u deze organisatie wilt verwijderen?'))) return false">Delete</a> </td>
			</tr>
			</c:forEach>
			
		</table>
		
		<br>
		<div id="userTableButtons">
			<input id="addUserButton" type="button" name="addUserButton" value="organisatie toevoegen" onclick="window.location.href='add-organisatie.jsp'">
		</div>
		
		</div>
	
	
	
	
	
	
	

</body>
</html>