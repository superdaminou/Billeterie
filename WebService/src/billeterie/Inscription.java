package billeterie;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;


public class Inscription extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String vue="/WEB-INF/index.jsp";
			
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher( vue ).forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		InscriptionForm form = new InscriptionForm();
		Collection<User> set = new HashSet<User>();
		form.inscrire(request);
		set.addAll(form.getListUser());
		System.out.println(set);
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
	}

}
