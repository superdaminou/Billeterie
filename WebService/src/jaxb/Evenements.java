package jaxb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Evenements {
	private List<Evenement> events = new ArrayList<Evenement>();

	public Evenements(ArrayList<Evenement> events) {
		this.events = events;
	}

	public Evenements() {
	}

	@XmlElement(name = "evenement")
	public List<Evenement> getEvents() {
		return events;
	}

	public void setEvent(ArrayList<Evenement> events) {
		this.events = events;
	}
	
	public void addevent(Evenement e){
		events.add(e);
	}
	
	public Iterator iterator(){
		return events.iterator();
	}

}
