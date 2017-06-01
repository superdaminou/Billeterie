package billeterie;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaxb.User;

import java.util.*;


public class Inscription extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	public static final String vue="/WEB-INF/index.jsp";
	public static final String vueCrea="/WEB-INF/ajoutEvent.jsp";
	Collection<User> set = new HashSet<User>();
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher( vue ).forward(request, response);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			
		//On regarde si l'utilisateur a cliqué sur le bouton Réservation
		if(request.getParameter("btnResa")!= null)
		{
			
		InscriptionForm form = new InscriptionForm();
		form.inscrire(request);
		set.addAll(form.getListUser());
		System.out.println(set.toString());
		
		request.setAttribute("set", set);
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
		}
		
		
		//Si non, alors il a cliqué sur Création, on le redirige.
		else
		{
			this.getServletContext().getRequestDispatcher(vueCrea).forward(request, response);
		}
	}
}
