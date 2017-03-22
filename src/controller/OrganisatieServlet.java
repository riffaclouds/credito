package controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import data.OrganisatieDbUtil;
import model.Organisatie;

/**
 * Servlet implementation class OrganisatieServlet
 */
@WebServlet("/organisatie")
public class OrganisatieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//define dataSource/connection pool for resource injection
	@Resource(name="jdbc/credito")
	private DataSource dataSource;
		
	private OrganisatieDbUtil orgDB;
    
	@Override
	public void init() throws ServletException {
        super.init();
        
        //create our org db util and pass in the Connection-pool / dataSource
      		try{
      			orgDB = new OrganisatieDbUtil(dataSource);
      		}catch(Exception exc){
      			throw new ServletException(exc);
      		}
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			lijstOrg(request, response);
									
			
		}catch(Exception exc){
			throw new ServletException(exc);
		}
		

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void lijstOrg(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get and print List
		List<Organisatie>  orgLijst = orgDB.getOrganisaties();
		
		// voeg gebruiker Lijst toe aan de request
		request.setAttribute("orgLijst", orgLijst);
		
		//stuur naar JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("/lijst-organisaties.jsp");
		dispatcher.forward(request, response);
		
	}

}
