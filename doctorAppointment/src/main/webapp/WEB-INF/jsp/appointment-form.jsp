<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
    <title>Appointments</title>
<body>

<h2>Add / Update Appointment</h2>

<form action="/appointments/save" method="post">

<input type="hidden" name="id" value="${appointment.id}" />

Patient Name:
<input type="text" name="patientName" value="${appointment.patientName}"/><br/>

Date:
<input type="date" name="date" value="${appointment.date}"/><br/>

Doctor:
<select name="doctor.id">
    <c:forEach var="d" items="${doctors}">
        <option value="${d.id}"
            <c:if test="${appointment.doctor != null && appointment.doctor.id == d.id}">
                selected
            </c:if>
        >
            ${d.name}
        </option>
    </c:forEach>
</select>

<br/><br/>
<button type="submit">Save</button>

</form>

<a href="/appointments/list">Back</a>

</body>
</html>