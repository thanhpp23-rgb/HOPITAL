<%-- 
    Document   : add
    Created on : Jun 23, 2026, 10:13:51?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Add Doctor</h2>

<form method="post" action="doctor">

    <input name="doctorId" class="form-control" placeholder="ID"><br>
    <input name="fullName" class="form-control" placeholder="Name"><br>
    <input name="specialty" class="form-control" placeholder="Specialty"><br>
    <input name="email" class="form-control" placeholder="Email"><br>
    <input name="phone" class="form-control" placeholder="Phone"><br>

    <button class="btn btn-primary">Save</button>

</form>

<jsp:include page="../layout/footer.jsp"/>