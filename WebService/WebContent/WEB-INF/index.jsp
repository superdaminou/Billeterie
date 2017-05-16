<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Billeterie</title>
</head>
<body> 

 <jsp:useBean id="personne"  scope="request" class= "billeterie.User" />
 	<h1>YOLO</h1>
	<form action="#" method="POST" >
		<label for="prenom">Prenom</label>
		<input type="text" id="prenom" name="prenom" value="" size=20 maxlength =60/>
		<label for="nom">Nom</label>
		<input type="text" id="nom" name="nom" value="" size=20 maxlength =60/>
		<input type="submit" value="Inscription" />
	</form>
 	<p>nom initial = <jsp:getProperty name="personne" property="nom"/> </p>
 	<c:forEach var="personne" items= "${set}">
 		<c:out value ="personne.nom" />
 	</c:forEach>
</body>
</html>