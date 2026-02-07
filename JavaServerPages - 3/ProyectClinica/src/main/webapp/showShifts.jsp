<%@ page import="java.util.List" %>
<%@ page import="logic.Patient" %>
<%@ page import="java.util.ArrayList" %>
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


        <div class="container-fluid px-4">
            <h1 class="mt-4">Tables</h1>
            <div class="card mb-4">
                <div class="card-body">
                    Shift
                </div>
            </div>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table me-1"></i>
                    DataTable
                </div>
                <div class="card-body">
                    <table id="datatablesSimple">
                        <thead>
                        <tr>
                            <th>Date</th>
                            <th>Shift Hour</th>
                            <th>Afeccion</th>
                            <th>Odontologo</th>
                            <th>Patient</th>
                            <th style="width:250px">Action</th>

                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Date</th>
                            <th>Shift Hour</th>
                            <th>Afeccion</th>
                            <th>Odontologo</th>
                            <th>Patient</th>
                            <th style="width:250px">Action</th>
                        </tr>
                        </tfoot>

                        <%
                            List<Shift> shifts = (List<Shift>) request.getSession().getAttribute("shifts");
                            if (shifts == null) {
                                shifts = new ArrayList<>();
                            }
                        %>
                        <tbody>

                        <% for (Shift sh : shifts) { %>
                        <tr>
                            <td> <%= sh.getDate() %> </td>
                            <td> <%= sh.getShift_hours() %> </td>
                            <td> <%= sh.getAfeccion() %> </td>
                            <td> <%= sh.getOdontologo().getFirst_name() %> <%= sh.getOdontologo().getLast_name() %> </td>
                            <td> <%= sh.getPatient().getFirst_name() %> <%= sh.getPatient().getLast_name() %> </td>

                            <td style="display: flex; flex-direction: row; align-items: center; white-space: nowrap;">
                                <form name="delete" action="deleteShift" method="post" style="display: inline-block; margin-right: 10px;"> <!-- We execute the Servlet -->
                                    <button type="submit" class="btn btn-primary btn-sm" style="background-color: red;">
                                        <i class="fas fa-trash-alt"></i> Delete
                                    </button>
                                    <input type="hidden" name="id" value="<%= sh.getId() %>"> <!-- esto es para mandar el codigo al servlet -->
                                </form>
                                <form name="update" action="updateShift" method="get" style="display: inline-block;">
                                    <button type="submit" class="btn btn-primary btn-sm">
                                        <i class="fas fa-pencil-alt"></i> Update
                                    </button>
                                    <input type="hidden" name="id" value="<%= sh.getId() %>">
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