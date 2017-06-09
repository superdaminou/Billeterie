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

<head>
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/tuto.css" rel="stylesheet">
  <!-- Un peu de style pour la visualisation -->
  <style type="text/css">
    .col-md-8, .col-sm-10 { line-height: 200px; }
    .col-md-12 { line-height: 80px; }
  </style>
  </head>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/WEB-INF/ajoutEvent.jsp">Creer <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Modifier</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav> 	



  
  <body>
    <div class="container">

      <header class="row">
        <div class="col-md-12">
          <h1>Création d'événement</h1>
        </div>
      </header>
     </div>
      
 
       <div>
        <form class="form-inline" action="#" method="POST">
  			<div class="form-group">
			    <label for="exampleInputName2">Nom</label>
			    <input type="text" class="form-control" name="nom" id="nom" placeholder="Nom">
			</div>
			<div class="form-inline">
			    <label for="exampleInputName2">Lieu</label>
			    
			    <div class="form-inline">
			    <div class="form-group">
			    	<label for="exampleInputName2">Nom</label>
			    
			    	<input type="text" class="form-control" name="nom" id="nom" placeholder="Nom">
				</div>
				
				<div class="form-group">
			    	<label for="exampleInputName2">Adresse</label>
			    
			    	<input type="text" class="form-control" name="adresse" id="adresse" placeholder="Prenom">
				</div>
				
				<div class="form-group">
			    	<label for="exampleInputName2">Code Postal</label>
			    
			    	<input type="text" class="form-control" name="codePostal" id="codePostal" placeholder="codePostal">
				</div>
				
				<div class="form-group">
			    	<label for="exampleInputName2">Ville</label>
			    
			    	<input type="text" class="form-control" name="ville" id="ville" placeholder="Prenom">
				</div>
			    
			    </div>
			    
			    
			</div>
			<div class="form-group">
			    <label for="exampleInputName2">Date</label>
			    <input type="text" class="form-control" name="date" id="date" placeholder="Date">
			</div>
			<div class="form-group">
			    <label for="exampleInputName2">Prix</label>
			    <input type="number" class="form-control" name="prix" id="prix" placeholder="Prix">
			</div>
			<div class="form-group">
			    <label for="exampleInputName2">Nombre de place</label>
			    <input type="text" class="form-control" name="nbPlace" id="nbPLace" placeholder="nbPlace">
			</div>
			<div class="form-group">
			    <label for="exampleInputName2">Description</label>
			    <input type="text" class="form-control" name="description" id="description" placeholder="Prenom">
			</div>
			  	<button type="submit" name="creer" value ="1"  class="btn btn-default">ajouter</button>
		</form>  
		
		</div>    
       

</body>
</html>



