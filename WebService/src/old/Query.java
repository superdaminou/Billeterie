package old;

import javax.xml.bind.annotation.*;


public class Query { 
	  
    private String name; 
    private String query; 
  
    @XmlAttribute(name = "name") 
    public final String getName() { 
        return name; 
    } 
  
    public void setName(String name) { 
        this.name = name; 
    } 
  
    @XmlValue 
    public final String getQuery() { 
        return query; 
    } 
  
    public final void setQuery(String query) { 
        this.query = query; 
    } 
} 