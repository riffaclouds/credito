package data;

import javax.sql.DataSource;

import model.Gebruiker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GebruikerDbUtil {
	
private DataSource dataSource;
	
	public GebruikerDbUtil(DataSource theDataSource){
		dataSource = theDataSource;
	}
	
	public List<Gebruiker> getGebruikers() throws Exception{
		
		List<Gebruiker> gebruikers = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try{
			//get a connection
			myConn = dataSource.getConnection();
			
			//make statement
			String sql = "select * from user where active='1' order by last_name";
			
			myStmt = myConn.createStatement();
			//execute query
			myRs = myStmt.executeQuery(sql);
			
			//process the resultSet
			
			while(myRs.next()){
				
				//get data from the current row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				String password = myRs.getString("password");
				
				//plaatst de waardes die zojuist zijn opgehaald in gebruiker lg(lijst gebruiker)
				Gebruiker lg = new Gebruiker(id, idAfdeling, idRol,voorNaam, tussenvoegsel, achterNaam,
						email, salaris, actief);
				
				//add the user object to the list
				gebruikers.add(lg);
			}

			return gebruikers;
			
		}
		finally{
			//close JDBC objects
			close(myConn, myStmt, myRs);
		}
		
		
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) throws Exception{
		//if the JDBC objects are not null, 
		//then call their close methods, to return them to the connection pool
		
		if(myConn != null){
			myConn.close();
		}
		
		if(myStmt != null){
			myStmt.close();
		}
		
		if(myRs != null){
			myRs.close();
		}
		
		
	}

}
