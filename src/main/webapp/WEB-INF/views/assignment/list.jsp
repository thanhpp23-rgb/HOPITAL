<%-- 
    Document   : list
    Created on : Jun 23, 2026, 10:13:43?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Doctor Assignment</h2>

<table class="table table-bordered">

    <tr>
        <th>Service</th>
        <th>Doctor</th>
        <th>Date</th>
    </tr>

    <c:forEach items="${list}" var="a">
        <tr>
            <td>${a.serviceCode}</td>
            <td>${a.doctorId}</td>
            <td>${a.assignDate}</td>
        </tr>
    </c:forEach>

</table>

<jsp:include page="../layout/footer.jsp"/>