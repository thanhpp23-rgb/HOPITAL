<%-- 
    Document   : add
    Created on : Jun 23, 2026, 10:13:51?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Assign Doctor</h2>

<form method="post" action="assignment">

    <input name="serviceCode" class="form-control" placeholder="Service Code"><br>
    <input name="doctorId" class="form-control" placeholder="Doctor ID"><br>

    <button class="btn btn-primary">Assign</button>

</form>

<jsp:include page="../layout/footer.jsp"/>