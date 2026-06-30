<%-- 
    Document   : list
    Created on : Jun 23, 2026, 10:13:43?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Patient List</h2>

<table class="table table-bordered">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>DOB</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>

    <c:forEach items="${list}" var="p">
        <tr>
            <td>${p.patientId}</td>
            <td>${p.fullName}</td>
            <td>${p.dob}</td>
            <td>${p.email}</td>
            <td>${p.phone}</td>
        </tr>
    </c:forEach>

</table>

<jsp:include page="../layout/footer.jsp"/>