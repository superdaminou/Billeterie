package old;

//import static org.hamcrest.CoreMatchers.is; 
//import static org.junit.Assert.assertThat; 

// Autres import 
public class QueriesTest { 
  
 /*   private Queries queries; 
  
    @Before 
    public void before() { 
        InputStream xmlStream = Queries.class.getResourceAsStream("queriesTest.xml"); 
        queries = JAXB.unmarshal(xmlStream, Queries.class); 
    } 
  
    @Test 
    public void unmarshallingTest() throws Exception { 
        List<QueryGroup> queryGroups = queries.getQueryGroups(); 
        assertThat(queries.getQueryGroups().size(), is(2)); 
  
        QueryGroup group = queryGroups.get(0); 
        assertThat(group.getName(), is("group1")); 
        assertThat(group.getQueries().size(), is(2)); 
  
        List<Query> queryList = group.getQueries(); 
        Query query = queryList.get(0); 
        assertThat(query.getName(), is("query1")); 
        assertThat(query.getQuery().trim(), is("SELECT field1 FROM table1")); 
  
        query = queryList.get(1); 
        assertThat(query.getName(), is("query2")); 
        assertThat(query.getQuery().trim(), is("SELECT field2 FROM table2")); 
  
        group = queryGroups.get(1); 
        assertThat(group.getName(), is("group2")); 
        assertThat(group.getQueries().size(), is(2)); 
  
        queryList = group.getQueries(); 
        query = queryList.get(0); 
        assertThat(query.getName(), is("query3")); 
        assertThat(query.getQuery().trim(), is("SELECT field3 FROM table3")); 
  
        query = queryList.get(1); 
        assertThat(query.getName(), is("query4")); 
        assertThat(query.getQuery().trim(), is("SELECT field4 FROM table4")); 
  
    } 
  
    @Test 
    public void marshallingTest() throws Exception { 
        StringWriter writer = new StringWriter(); 
        JAXB.marshal(queries, writer); 
  
        String xmlString = writer.toString(); 
        System.out.println(xmlString); 
        Queries queries2 = JAXB.unmarshal(new StringReader(xmlString), Queries.class); 
  
        checkQueries(queries2, queries); 
    } 
  
    private void checkQueries(Queries queries, Queries expected) { 
        List<QueryGroup> groups = queries.getQueryGroups(); 
        List<QueryGroup> expectedGroups = expected.getQueryGroups(); 
        checkGroups(groups, expectedGroups); 
    } 
  
    private void checkGroups(List<QueryGroup> groups, List<QueryGroup> expectedGroups) { 
        assertThat(groups.size(), is(expectedGroups.size())); 
        Iterator<QueryGroup> iterator1 = groups.iterator(); 
        Iterator<QueryGroup> iterator2 = expectedGroups.iterator(); 
        while (iterator1.hasNext()) { 
            checkGroup(iterator1.next(), iterator2.next()); 
        } 
    } 
  
    private void checkGroup(QueryGroup group, QueryGroup expectedGroup) { 
        assertThat(group.getName(), is(expectedGroup.getName())); 
        List<Query> queriesList = group.getQueries(); 
        List<Query> expectedQueriesList = expectedGroup.getQueries(); 
        checkQueriesList(queriesList, expectedQueriesList); 
    } 
  
    private void checkQueriesList(List<Query> queriesList, List<Query> expectedQueriesList) { 
        assertThat(queriesList.size(), is(expectedQueriesList.size())); 
        Iterator<Query> iterator1 = queriesList.iterator(); 
        Iterator<Query> iterator2 = expectedQueriesList.iterator(); 
        while (iterator1.hasNext()) { 
            checkQuery(iterator1.next(), iterator2.next()); 
        } 
    } 
  
    private void checkQuery(Query query, Query expectedQuery) { 
        assertThat(query.getName(), is(expectedQuery.getName())); 
        assertThat(query.getQuery().trim(), is(expectedQuery.getQuery().trim())); 
    } 
 */ 
} 