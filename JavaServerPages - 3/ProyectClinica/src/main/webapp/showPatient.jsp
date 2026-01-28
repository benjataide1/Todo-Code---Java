<%@ page import="java.util.List" %>
<%@ page import="logic.Patient" %>
<%@ page import="java.util.ArrayList" %>
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


        <div class="container-fluid px-4">
            <h1 class="mt-4">Tables</h1>
            <div class="card mb-4">
                <div class="card-body">
                    Patients
                </div>
            </div>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table me-1"></i>
                    DataTable Example
                </div>
                <div class="card-body">
                    <table id="datatablesSimple">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Last Name</th>
                            <th>Phone</th>
                            <th>Medium Insuranc</th>
                            <th >Blood Group</th>
                            <th>Responsible</th>
                            <th style="width:250px">Action</th>

                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Last Name</th>
                            <th>Phone</th>
                            <th>Medium Insuranc</th>
                            <th>Blood Group</th>
                            <th>Responsible</th>
                            <th style="width:250px">Action</th>
                        </tr>
                        </tfoot>

                        <%
                            List<Patient> listPatient = (List<Patient>) request.getSession().getAttribute("patient");
                            if (listPatient == null) {
                                listPatient = new ArrayList<>();
                            }
                        %>
                        <tbody>

                        <% for (Patient pt : listPatient) { %>
                        <tr>
                            <td> <%= pt.getId_person() %> </td>
                            <td> <%= pt.getFirst_name() %> </td>
                            <td> <%= pt.getLast_name() %> </td>
                            <td> <%= pt.getPhone()%> </td>
                            <td> <%= pt.isMedium_insurance() %> </td>
                            <td> <%= pt.getBlood_group() %> </td>
                            <td> <%= pt.getResponsible().getFirst_name() %> <%= pt.getResponsible().getLast_name() %> </td>

                            <td style="display: flex; flex-direction: row; align-items: center; white-space: nowrap;">
                                <form name="delete" action="DeletePatient" method="post" style="display: inline-block; margin-right: 10px;"> <!-- We execute the Servlet -->
                                    <button type="submit" class="btn btn-primary btn-sm" style="background-color: red;">
                                        <i class="fas fa-trash-alt"></i> Delete
                                    </button>
                                    <input type="hidden" name="id" value="<%= pt.getId_person() %>"> <!-- esto es para mandar el codigo al servlet -->
                                </form>
                                <form name="update" action="UpdatePatient" method="get" style="display: inline-block;">
                                    <button type="submit" class="btn btn-primary btn-sm">
                                        <i class="fas fa-pencil-alt"></i> Update
                                    </button>
                                    <input type="hidden" name="id" value="<%= pt.getId_person() %>">
                                </form>
                            </td>
                        </tr>

                        <% } %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <%--! footer --%>
        <%@ include file="components/footer.jsp" %>
    </div>


</div>


<%--! Scripts--%>
<%@ include file="components/scripts.jsp" %>
</body>
</html>
