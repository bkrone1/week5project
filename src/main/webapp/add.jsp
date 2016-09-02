<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.ravensOffense.*"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, shrink-to-fit=no, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<title>List of Ravens Offensive Skill Players</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

	<p>The Baltimore Ravens Skill Players 2016</p>
	
	<form action="addToDB" method="post">
							Last Name:<br>
							<input type="text" name="lastName">
							<br>
							First Name:<br>
							<input type="text" name="firstName">
							<br>
							Number:<br>
							<input type="text" name="number">
							<br>
							Position:<br>
							<input type="text" name="position">
							<br>
  							<input type="submit" value="Submit">
						</form>
						<br/>
						<br/>
						<br/>
						<br/>



<a class="btn btn-danger btn-lg" href="week5project.jsp" role="button">Home</a>


</body>
</html>