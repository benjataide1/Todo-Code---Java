<%@ page import="java.util.List" %>
<%@ page import="logic.Odontologo" %>
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
                    Odontologos
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
                            <th>speciality</th>
                            <th style="width:210px">Action</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Last Name</th>
                            <th>Phone</th>
                            <th>speciality</th>
                            <th style="width:210px">Action</th>
                        </tr>
                        </tfoot>

                        <%
                            List<Odontologo> listOdonto = (List<Odontologo>) request.getSession().getAttribute("listOdonto");
                        %>
                        <tbody>

                        <% for (Odontologo odo : listOdonto) { %>
                        <tr>
                            <td> <%= odo.getId_person() %> </td>
                            <td> <%= odo.getFirst_name() %> </td>
                            <td> <%= odo.getLast_name()%> </td>
                            <td> <%= odo.getPhone() %> </td>
                            <td> <%= odo.getSpeciality() %> </td>

                            <td style="white-space: nowrap;">
                                <form name="delete" action="SvDeleteOdo" method="post" style="display: inline-block; margin: 0; margin-right: 5px;"> <!-- We execute the Servlet -->
                                    <button type="submit" class="btn btn-primary btn-sm" style="background-color: red;">
                                        <i class="fas fa-trash-alt"></i> Delete
                                    </button>
                                    <input type="hidden" name="id" value="<%= odo.getId_person() %>"> <!-- esto es para mandar el codigo al servlet -->
                                </form>
                                <form name="update" action="SvUpdateOdonto" method="get" style="display: inline-block; margin: 0;">
                                    <button type="submit" class="btn btn-primary btn-sm">
                                        <i class="fas fa-pencil-alt"></i> Update
                                    </button>
                                    <input type="hidden" name="id" value="<%= odo.getId_person() %>">
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
