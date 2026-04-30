<html>
<head>
<title>Doctor Form</title>

<style>
    body {
        font-family: Arial;
        background-color: #f4f6f8;
        padding: 20px;
    }

    input {
        margin: 8px;
        padding: 6px;
        width: 200px;
    }

    button {
        padding: 8px 12px;
        background-color: green;
        color: white;
        border: none;
        cursor: pointer;
    }

    button:hover {
        background-color: darkgreen;
    }
</style>

</head>
<body>

<h2>Add / Update Doctor</h2>

<form action="save" method="post">

    <input type="hidden" name="id" value="${doctor.id}" />

    Name: <input type="text" name="name" value="${doctor.name}" /><br/>
    Specialization: <input type="text" name="specialization" value="${doctor.specialization}" /><br/>
    Email: <input type="email" name="email" value="${doctor.email}" /><br/>

    <button type="submit">Save</button>
</form>

<br/>
<a href="list">Go Back</a>

</body>
</html>