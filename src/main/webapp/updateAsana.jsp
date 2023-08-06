<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="u" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
</head>
<body>
<div style="text-align: center; background-color:teal; height: 100%; padding: 250px;">
<h1>Update Asana Task....</h1>
<u:form action="saveupdateAsana" modelAttribute="asana">
<label>Task ID :</label>
<u:input path="taskid" readonly="true"/><br><br>
<label>Name :</label>
<u:input path="name" /><br><br>
<label>Due Date :</label>
<u:input type="date" path="duedate"/><br><br>
<label>Assignee :</label>
<u:input path="assignee"/><br><br>
<label>Description :</label>
<u:textarea path="description"/><br><br>
<input type="Submit" value="Update">
</u:form>
</div>

</body>
</html>