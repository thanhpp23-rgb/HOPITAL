<%-- 
    Document   : list
    Created on : Jun 23, 2026, 10:13:43?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Doctor List</h2>

<table class="table table-bordered">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Specialty</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>

    <c:forEach items="${list}" var="d">
        <tr>
            <td>${d.doctorId}</td>
            <td>${d.fullName}</td>
            <td>${d.specialty}</td>
            <td>${d.email}</td>
            <td>${d.phone}</td>
        </tr>
    </c:forEach>

</table>

<jsp:include page="../layout/footer.jsp"/>