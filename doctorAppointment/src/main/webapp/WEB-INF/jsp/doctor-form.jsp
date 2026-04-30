<html>
<head>
<title>Doctor Form</title>
<link rel="stylesheet" href="/css/style.css">



</head>
<body>

<h2>Add / Update Doctor</h2>

<form action="/doctors/save" method="post">

    <input type="hidden" name="id" value="${doctor.id}" />

    Name: <input type="text" name="name" value="${doctor.name}" /><br/>
    Specialization: <input type="text" name="specialization" value="${doctor.specialization}" /><br/>
    Email: <input type="email" name="email" value="${doctor.email}" /><br/>

    <button type="submit">Save</button>
</form>

<br/>
<a href="/doctors/list">Go Back</a>

</body>
</html>