package controller;

import data.GebruikerDbUtil;
import model.Gebruiker;


import java.io.IOException;
/*
 * import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
 */


import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class GebruikerServlet
 */
@WebServlet("/gebruiker")
public class GebruikerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//define dataSource/connection pool for resource injection
	@Resource(name="jdbc/credito")
	private DataSource dataSource;
	
	private GebruikerDbUtil gebrDB;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		//create our user db util and pass in the Connection-pool / dataSource
		try{
			gebrDB = new GebruikerDbUtil(dataSource);
		}catch(Exception exc){
			throw new ServletException(exc);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		try{
			//get and print List
			lijst(request, response);
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		 
	
	}

	
	private void lijst(HttpServletRequest request, HttpServletResponse response) throws Exception  {
		// get and print List
		List<Gebruiker>  gebrLijst = gebrDB.getGebruikers();
		
		// voeg gebruiker Lijst toe aan de request
		request.setAttribute("gebrLijst", gebrLijst);
		
		//send to JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("/lijst-gebruikers.jsp");
		dispatcher.forward(request, response);		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



























