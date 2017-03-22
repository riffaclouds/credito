<!-- import the header -->
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<title>Lijst van alle gebruikers in de Credito DataBase</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
	
		<h1>Gebruikers overzicht</h1>
		<!-- print the list -->
		<div id="userTable">
		<table id="table">
			<tr>
			
				<th>id</th>
				<th>Org</th>
				<th>Naam</th>
				<th>E-mail</th>
				<th>Rol</th>
				
				<th>actie(id)</th>
				
			</tr>
			
			<c:forEach var="gebruiker" items="${gebrLijst}">
			
			
			<c:url var="updateURL" value="UserControllerServlet">
				<!-- create update link for each student -->	
				<c:param name="command" value="LOAD" />
				<c:param name="userId" value="${gebruiker.id}" />
			</c:url>
			
			<c:url var="deleteURL" value="UserControllerServlet">
				<!-- create delete link for each student -->
				<c:param name="command" value="DELETE" />
				<c:param name="userId" value="${gebruiker.id}" />
			</c:url>
			
			<tr>
				<td>${gebruiker.id}</td>
				<td>${gebruiker.organisatie}</td>
				
				<td>${gebruiker.voorNaam} 				
				${gebruiker.tussenvoegsel} 
				${gebruiker.achterNaam}</td>
				<td>${gebruiker.email}</td>
				<td>${gebruiker.rol}</td>
				
				<td><a href="${updateURL}">Update</a> | 
				<a href="${deleteURL}" onclick="if (!(confirm('Weet u zeker dat u deze medewerker wilt verwijderen?'))) return false">Delete</a> </td>
			</tr>
			</c:forEach>
			
		</table>
		
		<br>
		<div id="userTableButtons">
			<input id="addUserButton" type="button" name="addUserButton" value="Werknemer toevoegen" onclick="window.location.href='add-gebruiker.jsp'">
		</div>
		
		</div>
	
	
	
	
	
	
	

</body>
</html>