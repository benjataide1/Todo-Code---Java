<%@ page import="logic.User" %>
<%@ page import="logic.Patient" %>
<%@ page import="logic.Controller" %>
<%@ page import="logic.Responsible" %>
<%@ page import="java.util.List" %>
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
                    <h1 class="display-4 mb-3">Update Patient</h1>
                </div>
            </div>
        </div>

        <% Patient patient = (Patient) request.getSession().getAttribute("updatePatient"); %>

        <!-- Registration Form -->
        <div id="layoutAuthentication_content">
            <main>
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-7">
                            <div class="card shadow-lg border-0 rounded-lg mt-5">
                                <div class="card-header">
                                    <h3 class="text-center font-weight-light my-4">Registro de Usuario</h3>
                                </div>
                                <div class="card-body">
                                    <form action="UpdatePatient" method="POST">
                                        <div class="col-10">
                                            <%--                                            <div class="col-md-6">--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputNombre" name="name" type="text"
                                                       placeholder="Ingrese el nombre"
                                                       value="<%= patient.getFirst_name() %>" required/>
                                                <label for="inputNombre">Name</label>
                                            </div>
                                            <%--                                            </div>--%>
                                            <%--                                            <div class="col-md-6">--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputLastname" name="lastname"
                                                       type="text" placeholder="Enter your Last Name"
                                                       value="<%= patient.getLast_name()%>" required/>
                                                <label for="inputLastname">Last Name</label>
                                            </div>

                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputDNI" name="dni"
                                                       type="text" placeholder="Enter your DNI"
                                                       value="<%= patient.getDni()%>" required/>
                                                <label for="inputDNI">DNI</label>
                                            </div>

                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputPhone" name="phone"
                                                           type="text" placeholder="Enter your Phone"
                                                           value="<%= patient.getPhone()%>" required/>
                                                    <label for="inputPhone">Phone</label>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputAddress" name="address"
                                                           type="text" placeholder="Enter your Address"
                                                           value="<%= patient.getAddress()%>" required/>
                                                    <label for="inputAddress">Address</label>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="input" name="date"
                                                           type="text" placeholder="Enter your Date"
                                                           value="<%= patient.getDate()%>" required/>
                                                    <label for="inputDate">Date</label>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputMediumInsurance" name="medium_insurance"
                                                           type="text" placeholder="Enter your Medium Insurance"
                                                           value="<%= patient.isMedium_insurance()%>" required/>
                                                    <label for="inputMediumInsurance">Medium Insurance</label>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <select class="form-select" id="responsiblePa" name="responsible" aria-label="Select a User" required>
                                                        <option selected disabled value="">Select a Responsible</option>
                                                        <%
                                                            Controller control = new Controller();
                                                            List<Responsible> listResponsible = control.getResponsible();
                                                            for (Responsible responsible : listResponsible) {
                                                        %>
                                                        <option value="<%= responsible.getId_person() %>"><%= responsible.getFirst_name() %></option>
                                                        <% } %>
                                                    </select>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <select class="form-select" id="inputBloodGroup" name="bloodGroup" required>
                                                        <option value="" disabled selected>Blood Group</option>
                                                        <option value="A+">A+</option>
                                                        <option value="A-">A-</option>
                                                        <option value="B+">B+</option>
                                                        <option value="B-">B-</option>
                                                        <option value="AB+">AB+</option>
                                                        <option value="AB-">AB-</option>
                                                        <option value="O+">O+</option>
                                                        <option value="O-">O-</option>
                                                    </select>
                                                    <label for="inputBloodGroup">Blood Group</label>
                                                </div>

                                        </div>
                                        <div class="mt-4 mb-0">
                                            <div class="d-grid">
                                                <button class="btn btn-primary btn-block" type="submit">
                                                    Save Patient
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
