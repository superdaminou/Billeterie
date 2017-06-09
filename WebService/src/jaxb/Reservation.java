package jaxb;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Reservation")
@XmlType(propOrder={"user", "nbPlaceReserve", })
public class Reservation extends HttpServlet {
	
	public Reservation()
	{
		
	}
	
	

	
	private User user;
	
	private int nbPlaceReserve; 
	
	
	
	private static final long serialVersionUID = 1L;
	public static final String res="/WEB-INF/reservation.jsp";
	

	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher( res ).forward(request, response);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher(res).forward(request, response);
	}


	/**
	 * @return the user
	 */
	@XmlElement
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the nbPlaceReserve
	 */
	@XmlElement
	public int getNbPlaceReserve() {
		return nbPlaceReserve;
	}

	/**
	 * @param nbPlaceReserve the nbPlaceReserve to set
	 */
	public void setNbPlaceReserve(int nbPlace) {
		this.nbPlaceReserve = nbPlace;
	}





}
