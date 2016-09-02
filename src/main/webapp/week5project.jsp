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

	<table class="table table-bordered">
		<tr>
			<th>Last Name</th>
			<th>First Name</th>
			<th>Number</th>
			<th>Position</th>
		</tr>

		<%DAO.readFromDB(); %>
		<%
							Player readToJSP = new Player();
							for( int i = 0; i < DAO.myPlayers.size(); i++){ 
							  readToJSP = DAO.myPlayers.get(i);
							%>
		<tr>
			<th><%= readToJSP.getLastName() %></th>
			<th><%= readToJSP.getFirstName() %></th>
			<th><%= readToJSP.getNumber() %></th>
			<th><%= readToJSP.getPosition() %></th>
		</tr>
		<%}
							
							DAO.myPlayers.clear();
							%>
							</table>

<a class="btn btn-success btn-lg" href="add.jsp" role="button">Add</a>


</body>
</html>