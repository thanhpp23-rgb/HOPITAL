<%-- 
    Document   : add
    Created on : Jun 23, 2026, 10:13:51?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Add Patient</h2>

<form method="post" action="patient">

    <input name="patientId" class="form-control" placeholder="ID"><br>
    <input name="fullName" class="form-control" placeholder="Name"><br>
    <input name="dob" type="date" class="form-control"><br>
    <input name="email" class="form-control"><br>
    <input name="phone" class="form-control"><br>

    <button class="btn btn-primary">Save</button>

</form>

<jsp:include page="../layout/footer.jsp"/>
