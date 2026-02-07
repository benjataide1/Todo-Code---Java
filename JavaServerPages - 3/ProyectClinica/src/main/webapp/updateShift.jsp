<%@ page import="java.util.List" %>
<%@ page import="logic.Shift" %>
<%@ page import="logic.Controller" %>
<%@ page import="logic.Odontologo" %>
<%@ page import="logic.Patient" %>
<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<%--! header --%>
<%@ include file="components/header.jsp" %>


<body class="sb-nav-fixed">

<%--! Top Side--%>
<%@ include file="components/topSide.jsp" %>

<%--! Cuerpo --%>
<div id="layoutSidenav">

    <%--! Barra lateral--%>
    <%@ include file="components/sideBar.jsp" %>

    <div id="layoutSidenav_content">
        <%--! main --%>
        <%@ include file="components/main.jsp" %>

        <!-- Main Title Centered -->
        <div class="container mt-5">
            <div class="row justify-content-center">
                <div class="col-lg-8 text-center">
                    <h1 class="display-4 mb-3">Update Shift</h1>
                </div>
            </div>
        </div>

        <% Shift shift = (Shift) request.getSession().getAttribute("updateshift"); %>

        <!-- Registration Form -->
        <div id="layoutAuthentication_content">
            <main>
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-7">
                            <div class="card shadow-lg border-0 rounded-lg mt-5">
                                <div class="card-header">
                                    <h3 class="text-center font-weight-light my-4">Shift Register</h3>
                                </div>
                                <div class="card-body">
                                    <form action="updateShift" method="POST">
                                        <div class="col-10">

                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputAfeccion" name="affection" type="text"
                                                       placeholder="Enter Affection"
                                                       value="<%= shift.getAfeccion() %>" required/>
                                                <label for="inputAfeccion">Affection</label>
                                            </div>


                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputDate" name="date"
                                                       type="date" placeholder="Enter the Date"
                                                       value="<%= shift.getDate() %>" required/>
                                                <label for="inputDate">Date</label>
                                            </div>

                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputHour" name="hour"
                                                       type="text" placeholder="Enter the Hour"
                                                       value="<%= shift.getShift_hours()%>" required/>
                                                <label for="inputHour">Hour</label>
                                            </div>


                                            <div class="form-floating mb-3">
                                                <select class="form-select" id="userOdonto" name="userOdonto" aria-label="Select a Odontologo" required>
                                                    <option selected disabled value="">Select a Odontologo</option>
                                                    <%
                                                        Controller control = new Controller();
                                                        List<Odontologo> listOdo = control.getOdonto();
                                                        for (Odontologo odo : listOdo) {
                                                    %>
                                                    <option value="<%= odo.getId_person() %>"><%= odo.getFirst_name()%> - <%= odo.getSpeciality() %></option>
                                                    <% } %>
                                                </select>
                                            </div>

                                            <div class="form-floating mb-3">
                                                <select class="form-select" id="userPatient" name="userPatient" aria-label="Select a Patient" required>
                                                    <option selected disabled value="">Select Patient</option>
                                                    <%
                                                        control = new Controller();
                                                        List<Patient> listPatient = control.getPatients();
                                                        for (Patient patient : listPatient) {
                                                    %>
                                                    <option value="<%= patient.getId_person() %>"><%= patient.getFirst_name()%> <%= patient.getLast_name()%></option>
                                                    <% } %>
                                                </select>
                                            </div>


                                        </div>
                                        <div class="mt-4 mb-0">
                                            <div class="d-grid">
                                                <button class="btn btn-primary btn-block" type="submit">
                                                    Save Shift
                                                </button>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>

        <%--! footer --%>
        <%@ include file="components/footer.jsp" %>
    </div>
</div>


<%--! Scripts--%>
<%@ include file="components/scripts.jsp" %>

</body>
</html
