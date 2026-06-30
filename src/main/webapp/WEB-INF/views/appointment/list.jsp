<%-- 
    Document   : list
    Created on : Jun 23, 2026, 10:42:39?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Appointments</h2>

<table class="table table-bordered">

    <tr>
        <th>ID</th>
        <th>Patient</th>
        <th>Service</th>
        <th>Date</th>
        <th>Status</th>
    </tr>

    <c:forEach items="${list}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.patientId}</td>
            <td>${a.serviceCode}</td>
            <td>${a.appointmentDate}</td>
            <td>${a.status}</td>
        </tr>
    </c:forEach>

</table>

<jsp:include page="../layout/footer.jsp"/>