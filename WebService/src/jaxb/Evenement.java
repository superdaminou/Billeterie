package jaxb;


import javax.xml.bind.annotation.*;;
  

@XmlRootElement(name="Evenement")
public class Evenement {
	
	private String id,name,lieu;
	private int date;
	
	@XmlElement
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	@XmlElement
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public Evenement(String id, String name, String lieu, int date) {
		super();
		this.id = id;
		this.name = name;
		this.lieu = lieu;
		this.date = date;
	}
	public Evenement() {
		super();
	}
	
}
