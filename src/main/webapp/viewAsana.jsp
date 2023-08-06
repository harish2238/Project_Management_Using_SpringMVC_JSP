<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Asana</title>
</head>
<body>
<div style="text-align: center; height: 100%; padding: 50px;">
<h1>Asana Task List</h1>
<table style="padding-left: 500px; justify-content: space-around;">
<tr>
<th>TASK ID</th>
<th>Name</th>
<th>ASSIGNEE</th>
<th>DUE DATE</th>
<th>DESCRIPTION</th>
<th>Action</th>
</tr>
<c:forEach  var="asana" items="${asanas}">
<tr>
<td>${asana.getTaskid()}</td>
<td>${asana.getName()}</td>
<td>${asana.getAssignee()}</td>
<td>${asana.getDuedate()}</td>
<td>${asana.getDescription()}</td>
<td><a href="updateAsana?id=${asana.getTaskid()}">Edit</a> <a href="deleteAsana?id=${asana.getTaskid()}">Delete</a></td>
<td></td>
</tr>
</c:forEach>
</table>
</div>

</body>
</html>