<%@page import="logic.Controller"%>
<%@page import="logic.User"%>
<%@page import="java.util.List"%>
<%@ page import="logic.Shift" %>
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
                    <h1 class="display-4 mb-3">Alta Odontólogos</h1>
                </div>
            </div>
        </div>

        <!-- Registration Form -->
        <div id="layoutAuthentication_content">
            <main>
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-7">
                            <div class="card shadow-lg border-0 rounded-lg mt-5">
                                <div class="card-header">
                                    <h3 class="text-center font-weight-light my-4">Complete the form to create a new Odontologo</h3>
                                </div>
                                <div class="card-body">
                                    <form action="registerOdonto" method="POST">
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

                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputPhone" name="phone"
                                                       type="tel" placeholder="Enter your Phone Number" required/>
                                                <label for="inputPhone">Phone Number</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputAddress" name="address"
                                                       type="text" placeholder="Enter your Address" required/>
                                                <label for="inputMatricula">Address</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputDate" name="date" type="date"
                                                       placeholder="Date" required/>
                                                <label for="inputDate">Date</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputEspeciality" name="especiality"
                                                       type="text"
                                                       placeholder="Enter your Especiality" required/>
                                                <label for="inputEspeciality">Especiality</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="start_time" name="scheduleBegin"
                                                       type="text"
                                                       placeholder="Start Time" required/>
                                                <label for="inputSchedule">Start Time</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="end_time" name="scheduleEnd"
                                                       type="text"
                                                       placeholder="End Time" required/>
                                                <label for="inputSchedule">End Time</label>
                                            </div>

                                            <div class="form-floating mb-3">
                                                <select class="form-select" id="userOdonto" name="userOdonto" aria-label="Select a User" required>
                                                    <option selected disabled value="">Select a User</option>
                                                    <%
                                                        Controller control = new Controller();
                                                        List<User> listUsers = control.getUsers();
                                                        for (User user : listUsers) {
                                                    %>
                                                    <option value="<%= user.getId_user() %>"><%= user.getName_user() %></option>
                                                    <% } %>
                                                </select>
                                            </div>

                                        </div>
                                        <div class="mt-4 mb-0">
                                            <div class="d-grid">
                                                <button class="btn btn-primary btn-block" type="submit">
                                                    Create Odontologo
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
