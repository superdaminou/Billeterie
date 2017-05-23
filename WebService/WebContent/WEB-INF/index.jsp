<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body> 

 	<h1>Consultation Evenement</h1>
	<form action="#" method="POST" >
		<label for="prenom">Prenom</label>
		<input type="text" id="prenom" name="prenom" value="" size=20 maxlength =60/>
		<label for="nom">Nom</label>
		<input type="text" id="nom" name="nom" value="" size=20 maxlength =60/>
		<input type="submit" value="Inscription" />
	</form>
 	
 <form class="form-inline" action="#" method="POST">
  <div class="form-group">
    <label for="exampleInputName2">Nom</label>
    <input type="text" class="form-control" name="nom" id="nom" placeholder="Nom">
  </div>
  <div class="form-group">
    <label for="exampleInputName2">Prenom</label>
    <input type="text" class="form-control" name="prenom" id="prenom" placeholder="Prenom">
  </div>
  <button type="submit" class="btn btn-default">Reservation</button>
</form>


 	<c:forEach var="personne" items= "${set}">
 		${personne.getNom()}, ${personne.getPrenom()}<br>
 	</c:forEach>


</body>

</html>
