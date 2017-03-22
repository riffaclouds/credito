package data;

import model.Organisatie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class OrganisatieDbUtil {
	
	private DataSource dataSource;

	public OrganisatieDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Organisatie> getOrganisaties() throws Exception{
		
		List<Organisatie> orgList = new ArrayList<>();
		
		Connection myCon = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try{
			//get a connection
			myCon = dataSource.getConnection();
			
			//make statement
			String sql = "SELECT "
					+ "id_organisatie, organisatie_naam, organisatie_domein, actief "
					+ "FROM organisatie "
					+ "WHERE actief = 1";
			
			myStmt = myCon.createStatement();
			//execute query
			myRs = myStmt.executeQuery(sql);
			
			//process the resultSet
			
			while(myRs.next()){
				
				//get data from the current row
				int id = myRs.getInt("id_organisatie");
				String naam = myRs.getString("organisatie_naam");
				String domein = myRs.getString("organisatie_domein");
				int actief = myRs.getInt("actief");
				
				//plaatst de waardes die zojuist zijn opgehaald in gebruiker lg(lijst gebruiker)
				Organisatie org = new Organisatie(id, naam, domein, actief);
				
				
				//add the user object to the list
				orgList.add(org);
			}

			return orgList;
			
		}
		finally{
			//close JDBC objects
			close(myCon, myStmt, myRs);
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
