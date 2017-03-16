<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/headerStyle.css">
</head>
<body>
	<!-- logo in upper left corner -->
	<!-- <img id="logo" src="media/pics/giphy (6).gif" alt="logo" 
	onclick="window.location.href='UserControllerServlet'">
	 -->
	<!-- page header -->
	<div class="headerCenter">
		<h1>Credito Services &trade;</h1>
		<img id="symbol" src="media/pics/c2-480x480.png" alt="symbol">
	</div>
	
	<!-- display if visitor is nog signed in -->
	<c:if test="${signed == false || signed == null}">
			<div id="login">
				<form action="UserControllerServlet" method="POST">
					<input type="hidden" name="command" value="LOGIN">
					<label>gebruikersnaam</label><br>
					<input type="email" name="uName" value="" placeholder="email"><br><br>
					
					<label>wachtwoord</label><br>
					<input type="password" name="pass" value="" placeholder="wachtwoord"><br><br>
					<input type="submit" name="loginButton" value="Login">
				</form>	
			</div>
	</c:if>
		
	<!-- display if visitor is signed in -->
	<c:if test="${signed == true}">
		<div id="login">
			
			name: ${user.firstName} ${user.lastName}<br>
			email: ${user.email}<br>
			password: ${user.password}<br>
			id: ${user.id}<br>
			Logged in: ${signed}<br><br>
			
			<form action="UserControllerServlet" method="GET">
				<input type="hidden" name="command" value="LOGOUT">
				<input type="submit" name="logoutButton" value="Logout">
			</form>
		</div>
	</c:if>

	<br><br><br><br><br><br><br>

	<!-- current login status -->
	<c:if test="${signed}">
		Logged in: ${signed}<br>
	</c:if>
	
	<!-- menu bar -->
	<div id="menuBar">
		<ul>
			<li class="menuItems"><a href="/credito">Home</a></li>
			<li class="menuItems"><a href="/credito">Organisaties</a></li>
			<li class="menuItems"><a href="gebruiker">Gebruikers</a></li>
			<li class="menuItems"><a href="/credito">Veilig betalen</a></li>
			<li class="menuItems"><a href="/credito">Mijn Credito</a></li>
		</ul>
	</div>
	<a href="/databasePlayground/">Mijn Credito</a>
	
	<hr>

	
	

	
</body>
</html>