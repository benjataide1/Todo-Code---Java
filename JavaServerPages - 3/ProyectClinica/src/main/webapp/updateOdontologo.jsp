<%@ page import="logic.User" %>
<%@ page import="logic.Odontologo" %>
<%@ page import="logic.Controller" %>
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
          <h1 class="display-4 mb-3">Update Odontologo</h1>
        </div>
      </div>
    </div>

    <% Odontologo odo = (Odontologo) request.getSession().getAttribute("updateOdon"); %>

    <!-- Registration Form -->
    <div id="layoutAuthentication_content">
      <main>
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-lg-7">
              <div class="card shadow-lg border-0 rounded-lg mt-5">
                <div class="card-header">
                  <h3 class="text-center font-weight-light my-4">Register Odontologo</h3>
                </div>
                <div class="card-body">
                  <form action="SvUpdateOdonto" method="POST">
                    <div class="col-10">
                      <%--                                            <div class="col-md-6">--%>
                      <div class="form-floating mb-3">
                        <input class="form-control" id="inputNombre" name="name" type="text"
                               placeholder="Ingrese el nombre" value="<%= odo.getFirst_name() %>" required/>
                        <label for="inputNombre">Name</label>
                      </div>

                      <div class="form-floating mb-3">
                        <input class="form-control" id="last_name" name="lastname"
                               type="text" placeholder="Enter your lastname" value="<%= odo.getLast_name() %>" required/>
                        <label for="inputLastName">Last Name</label>
                      </div>

                        <div class="form-floating mb-3">
                          <input class="form-control" id="dni" name="dni"
                                 type="text" placeholder="Enter your DNI" value="<%= odo.getDni() %>" required/>
                          <label for="inputDNI">DNI</label>
                        </div>


                        <div class="form-floating mb-3">
                          <input class="form-control" id="phone" name="phone"
                                 type="text" placeholder="Enter your Phone" value="<%= odo.getPhone() %>" required/>
                          <label for="inputPhone">Phone</label>
                        </div>

                        <div class="form-floating mb-3">
                          <input class="form-control" id="address" name="address"
                                 type="text" placeholder="Enter your Address" value="<%= odo.getAddress() %>" required/>
                          <label for="inputAddress">Address</label>
                        </div>

                        <div class="form-floating mb-3">
                          <input class="form-control" id="date" name="date"
                                 type="date" placeholder="Enter Date" value="<%= odo.getDate() %>" required/>
                          <label for="inputDate">Date</label>
                        </div>

                        <div class="form-floating mb-3">
                          <input class="form-control" id="speciality" name="speciality"
                                 type="text" placeholder="Enter your specialilty" value="<%= odo.getSpeciality() %>" required/>
                          <label for="inputSpeciality">Speciality</label>
                        </div>

                        <div class="form-floating mb-3">
                          <input class="form-control" id="scheduleStart" name="scheduleStart"
                                 type="text" placeholder="Start" value="<%= odo.getSchedule().getStart_time() %>" required/>
                          <label for="inputStart">Start</label>
                        </div>

                        <div class="form-floating mb-3">
                          <input class="form-control" id="schedulEnd" name="schedulEnd"
                                 type="text" placeholder="End" value="<%= odo.getSchedule().getEnd_time() %>" required/>
                          <label for="inputEnd">End</label>
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
                            Save Odontologo
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