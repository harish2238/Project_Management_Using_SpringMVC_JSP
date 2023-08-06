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
<h1>Airtable Task List</h1>
<table style="padding-left: 500px; justify-content: space-around;">
<tr>
<th>TASK ID</th>
<th>Name</th>
<th>ASSIGNEE</th>
<th>DUE DATE</th>
<th>DESCRIPTION</th>
</tr>
<c:forEach  var="air" items="${airtables}">
<tr>
<td>${air.getTaskid()}</td>
<td>${air.getName()}</td>
<td>${air.getAssignee()}</td>
<td>${air.getDuedate()}</td>
<td>${air.getDescription()}</td>
</tr>
</c:forEach>
</table>
</div>

</body>
</html>