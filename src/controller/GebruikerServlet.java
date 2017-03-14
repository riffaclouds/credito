package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class GebruikerServlet
 */
@WebServlet("/GebruikerServlet")
public class GebruikerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//define dataSource/connection pool for resource injection
	@Resource(name="jdbc/credito")
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// test dataBase
		
		// setup writer
		PrintWriter out = response.getWriter();
		
		// setup JDBC objects
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
				
		try{
			// setup connection
			myConn = dataSource.getConnection();
			
			// statement
			String sql = "select * from gebruiker";
			myStmt = myConn.createStatement();
			
			// execute statement
			myRs = myStmt.executeQuery(sql);
			
			//process resultSet
			while(myRs.next()){
				String voorNaam = myRs.getString("voor_naam");
				String achterNaam = myRs.getString("achter_naam");
				String email = myRs.getString("email");
				
				out.println(voorNaam + " " + achterNaam + " " + email);
			}
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



























