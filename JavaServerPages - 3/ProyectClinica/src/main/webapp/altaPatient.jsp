<%@page import="logic.Controller"%>
<%@page import="logic.Shift"%>
<%@page import="java.util.List"%>
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
                    <h1 class="display-4 mb-3">Patient Registration</h1>
                    <p class="lead mb-4">Complete the form to register a new patient.</p>
                </div>
            </div>
        </div>

        <!-- Registration Form -->
            <!-- Registration Form -->
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header">
                                        <h3 class="text-center font-weight-light my-4">Register Patient</h3>
                                    </div>
                                    <div class="card-body">
                                        <form action="SvPatient" method="POST">
                                            <div class="col-10">
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputName" name="name" type="text"
                                                           placeholder="Enter your Name" required/>
                                                    <label for="inputName">Name</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputLastname" name="lastname"
                                                           type="text" placeholder="Enter your Last Name" required/>
                                                    <label for="inputLastname">Apellido</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputDNI" name="DNI" type="text"
                                                           placeholder="Enter your DNI" required/>
                                                    <label for="inputDNI">DNI</label>
                                                </div>
                                                <%--                                            </div>--%>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputPhone" name="phone"
                                                           type="tel" placeholder="Enter your Phone Number" required/>
                                                    <label for="inputPhone">Phone Number</label>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputAddress" name="address"
                                                           type="text" placeholder="Enter your Address" required/>
                                                    <label for="inputAddress">Address</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputDate" name="date" type="date"
                                                           placeholder="Date" required/>
                                                    <label for="inputDate">Date</label>
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
                                                <div class="form-floating mb-3">
                                                    <select class="form-select" id="inputInsurance" name="insurance" required>
                                                        <option value="" disabled selected>Has Insurance?</option>
                                                        <option value="true">True</option>
                                                        <option value="false">False</option>
                                                    </select>
                                                    <label for="inputInsurance">Insurance</label>
                                                </div>

                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputResponsibleFirstName" name="responsibleFirstName"
                                                           type="text"
                                                           placeholder="Responsible First Name" required/>
                                                    <label for="inputResponsibleFirstName">Responsible First Name</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputResponsibleLastName" name="responsibleLastName"
                                                           type="text"
                                                           placeholder="Responsible Last Name" required/>
                                                    <label for="inputResponsibleLastName">Responsible Last Name</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputResponsibleDNI" name="responsibleDNI"
                                                           type="text"
                                                           placeholder="Responsible DNI" required/>
                                                    <label for="inputResponsibleDNI">Responsible DNI</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputResponsibleAddress" name="responsibleAddress"
                                                           type="text"
                                                           placeholder="Responsible Address" required/>
                                                    <label for="inputResponsibleAddress">Responsible Address</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputResponsiblePhone" name="responsiblePhone"
                                                           type="tel"
                                                           placeholder="Responsible Phone" required/>
                                                    <label for="inputResponsiblePhone">Responsible Phone</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <input class="form-control" id="inputResponsibleDate" name="responsibleDate"
                                                           type="date"
                                                           placeholder="Responsible Date" required/>
                                                    <label for="inputResponsibleDate">Responsible Date</label>
                                                </div>
                                                <div class="form-floating mb-3">
                                                    <select class="form-select" id="inputResponsibleType" name="responsibleType" required>
                                                        <option value="" disabled selected>Responsible Type</option>
                                                        <option value="Parent">Parent</option>
                                                        <option value="Guardian">Guardian</option>
                                                        <option value="Other">Friend</option>
                                                        <option value="Other">Other</option>
                                                    </select>
                                                    <label for="inputResponsibleType">Responsible Type</label>
                                                </div>

                                            </div>
                                            <div class="mt-4 mb-0">
                                                <div class="d-grid">
                                                    <button class="btn btn-primary btn-block" type="submit">
                                                        Create Patient
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
</html>
