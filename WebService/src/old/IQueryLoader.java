package old;

import java.util.*;

public interface IQueryLoader {

    Map<String, String> getQueries(String queriesName); 
  
    String getQuery(String groupName, String queryName); 
  

}
