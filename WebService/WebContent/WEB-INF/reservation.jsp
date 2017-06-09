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

  <head>
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/tuto.css" rel="stylesheet">
  <!-- Un peu de style pour la visualisation -->
  <style type="text/css">
    .col-md-8, .col-sm-10 { line-height: 200px; }
    .col-md-12 { line-height: 80px; }
  </style>
  </head>
  <body>
    <div class="container">

        <div class="col-md-12">
          <h1>Ma réservation</h1>
        </div>
        
       <div>
        <form class="form-inline" action="#" method="POST">
  			<div class="form-group">
			    <label for="exampleInputName2">Nom</label>
			    <input type="text" class="form-control" name="nom" id="nom" placeholder="Nom">
			</div>
			<div class="form-group">
			    <label for="exampleInputName2">Prenom</label>
			    <input type="text" class="form-control" name="prenom" id="prenom" placeholder="Prenom">
			</div><div class="form-group">
			    <label for="exampleInputName2">Email</label>
			    <input type="text" class="form-control" name="email" id="email" placeholder="Email">
			</div>
			<div class="form-group">
			    <label for="exampleInputName2">Nombre de place</label>
			    <input type="text" class="form-control" name="nbPlace" id="nbPlace" placeholder="Nombre de Place">
			</div>
			
			  	<button type="submit" name="reservation" value ="1"  class="btn btn-default">Reserver</button>
		</form>
     </div>
      
      
          
<!--  <label class="sr-only" for="inputHelpBlock">Nom</label>
<input type="text" id="inputHelpBlock" class="form-control" aria-describedby="helpBlock">

<label class="sr-only" for="inputHelpBlock">Prenom</label>
<input type="text" id="inputHelpBlock" class="form-control" aria-describedby="helpBlock"> -->
       

</body>
</html>