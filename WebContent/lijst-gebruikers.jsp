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
			
				<!-- 
				private int id;
				private int idAfdeling;
				private int idRol;
				private String voorNaam;
				private String tussenvoegsel;
				private String achterNaam;
				private String email;
				private double salaris;
				private int actief;
			 -->
				<th>id</th>
				<th>afdeling id</th>
				<th>id rol</th>
				<th>voor naam</th>
				
				<th>tussenvoegsel</th>
				<th>achter naam</th>
				<th>email</th>
				<th>salaris</th>
				<th>actief</th>
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
				<td>${gebruiker.idAfdeling}</td>
				<td>${gebruiker.idRol}</td>
				<td>${gebruiker.voorNaam}</td>
				
				<td>${gebruiker.tussenvoegsel}</td>
				<td>${gebruiker.achterNaam}</td>
				<td>${gebruiker.email}</td>
				<td>${gebruiker.salaris}</td>
				<td>${gebruiker.actief}</td>
				
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