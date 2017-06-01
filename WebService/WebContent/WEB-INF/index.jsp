<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consultation</title>
<!-- Latest compiled and minified CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body> 

 <h1>Consultation Evenement</h1>
 	
 	
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

<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
 	<c:forEach var="personne" items= "${set}">
 	
 	<div class="panel panel-default">
    <div class="panel-heading" role="tab" id="headingOne">
      <h4 class="panel-title">
        <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
          Evenement
        </a>
      </h4>
    </div>
    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
      <div class="panel-body">
      ${personne.getNom()}, ${personne.getPrenom()}</p>
		<form action="${pageContext.request.contextPath}/Acceuil" method="post">		
		<button value="Reserver" class="btn btn-default" stype="submit" >Reserver</button>
		</form>
      </div>
    </div>
  </div>
 	</c:forEach>
</div>


<div> <form class="form-inline" action="#" method="POST"><button type="submit" name="btnCrea" value ="1" class="btn btn-default">Creation Evenement</button></form>



</body>

</html>
