<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project Management System</title>
</head>
<body>
<div style="text-align: center; background-color: silver; height: 100%; padding: 250px;">
<h1>Add Asana Task..</h1>
<f:form action="addAsana" modelAttribute="asana"> 
<label>Name :</label>
<f:input type="text" path="name" placeholder="Enter Name"/><br><br>
<label>Due Date :</label>
<f:input type="date" path="duedate" placeholder="EnterDueDate"/><br><br>
<label>Assignee :</label>
<f:input type="text" path="assignee" placeholder="Enter Assignee"/><br><br>
<label>Description :</label>
<f:textarea path="description" placeholder="Enter Description"/><br><br>
<input type="submit" value="Save">
</f:form></div>
</body>
</html>