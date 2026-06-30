<%-- 
    Document   : booking
    Created on : Jun 23, 2026, 10:43:09?AM
    Author     : ADMIN
--%>

<jsp:include page="../layout/header.jsp"/>

<h2>Book Appointment</h2>

<form method="post" action="appointment">

<input name="patientId" class="form-control" placeholder="Patient ID"><br>
<input name="serviceCode" class="form-control" placeholder="Service Code"><br>
<input name="date" type="date" class="form-control"><br>

<button class="btn btn-primary">Book</button>

</form>

<jsp:include page="../layout/footer.jsp"/>
