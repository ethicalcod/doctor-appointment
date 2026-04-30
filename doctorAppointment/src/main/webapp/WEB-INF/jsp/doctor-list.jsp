<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Doctors</title>
    
    <style>
        body {
            font-family: Arial;
            background-color: #f4f6f8;
            padding: 20px;
        }

        h2 {
            color: #333;
        }

        a {
            text-decoration: none;
            color: blue;
            font-weight: bold;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            background: white;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: center;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        .btn {
            padding: 6px 10px;
            border-radius: 4px;
        }

        .edit {
            color: green;
        }

        .delete {
            color: red;
        }
    </style>
</head>
<body>

<h2>Doctor List</h2>

<a href="new">Add Doctor</a>

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
        <a href="edit/${d.id}">Edit</a> |
        <a href="delete/${d.id}">Delete</a>
    </td>
</tr>
</c:forEach>

</table>

</body>
</html>