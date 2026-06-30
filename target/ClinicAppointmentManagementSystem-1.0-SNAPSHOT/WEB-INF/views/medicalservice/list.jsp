<%-- 
    Document   : list
    Created on : Jun 23, 2026, 10:13:43?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Medical Service List</h2>

<a href="medicalservice?action=add" class="btn btn-success">Add</a>

<table class="table table-bordered mt-3">

    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Category</th>
        <th>Fee</th>
        <th>Duration</th>
        <th>Status</th>
    </tr>

    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.serviceCode}</td>
            <td>${s.serviceName}</td>
            <td>${s.category}</td>
            <td>${s.fee}</td>
            <td>${s.duration}</td>
            <td>${s.status}</td>
        </tr>
    </c:forEach>

</table>

<jsp:include page="../layout/footer.jsp"/>
