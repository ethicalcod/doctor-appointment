<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
    <head><link rel="stylesheet" href="/css/style.css"></head>
<body>

<h2>Appointments</h2>

<a href="/appointments/new"> Add Appointment</a>

<br/><br/>

<table border="1">
<tr>
<th>ID</th>
<th>Patient</th>
<th>Date</th>
<th>Doctor</th>
<th>Action</th>
</tr>

<c:forEach var="a" items="${appointments}">
<tr>
<td>${a.id}</td>
<td>${a.patientName}</td>
<td>${a.date}</td>
<td>${a.doctor.name}</td>
<td>
<a href="/appointments/edit/${a.id}">Edit</a> |
<a href="/appointments/delete/${a.id}">Delete</a>
</td>
</tr>
</c:forEach>

</table>

</body>
</html>