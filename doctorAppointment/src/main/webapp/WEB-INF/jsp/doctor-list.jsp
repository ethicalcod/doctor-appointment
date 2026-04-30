<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Doctors</title>
    <link rel="stylesheet" href="/css/style.css">
    
    
</head>
<body>

<h2>Doctor List</h2>

<a href="/doctors/new">Add Doctor</a>

<br/><br/>

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Specialization</th>
    <th>Email</th>
    <th>Actions</th>
</tr>

<c:forEach var="d" items="${doctors}">
<tr>
    <td>${d.id}</td>
    <td>${d.name}</td>
    <td>${d.specialization}</td>
    <td>${d.email}</td>
    <td>
        <a href="/doctors/edit/${d.id}">Edit</a> |
        <a href="/doctors/delete/${d.id}">Delete</a>
    </td>
</tr>
</c:forEach>

</table>

</body>
</html>