<%-- 
    Document   : add
    Created on : Jun 23, 2026, 10:13:51?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Add Medical Service</h2>

<form method="post" action="medicalservice">

    <input name="serviceCode" placeholder="Code" class="form-control"><br>
    <input name="serviceName" placeholder="Name" class="form-control"><br>
    <input name="category" placeholder="Category" class="form-control"><br>
    <input name="description" placeholder="Description" class="form-control"><br>
    <input name="fee" placeholder="Fee" class="form-control"><br>
    <input name="duration" placeholder="Duration" class="form-control"><br>
    <input name="status" placeholder="Available/Unavailable" class="form-control"><br>

    <button class="btn btn-primary">Save</button>

</form>

<jsp:include page="../layout/footer.jsp"/>
