package billeterie;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Reservation")
@XmlType(propOrder={"idEvenement","user", "nbPlace", })
public class Reservation extends HttpServlet {
	
	public Reservation()
	{
		
	}
	
	@XmlAttribute(name="idEvenement")
	private int idEvenement;
	
	@XmlAttribute(name="user")
	private User user;
	
	@XmlAttribute(name="nbPlace")
	private int nbPlace; 
	
	
	
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
	 * @return the idEvenement
	 */
	public int getIdEvenement() {
		return idEvenement;
	}

	/**
	 * @param idEvenement the idEvenement to set
	 */
	public void setIdEvenement(int idEvenement) {
		this.idEvenement = idEvenement;
	}

	/**
	 * @return the user
	 */
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
	 * @return the nbPlace
	 */
	public int getNbPlace() {
		return nbPlace;
	}

	/**
	 * @param nbPlace the nbPlace to set
	 */
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}





}
