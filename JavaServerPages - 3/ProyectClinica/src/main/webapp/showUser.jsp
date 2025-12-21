<%@ page import="logic.User" %>
<%@ page import="java.util.List" %>
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
                    Users
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
                            <th>Rol</th>
                            <th style="width:210px">Action</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Rol</th>
                            <th style="width:210px">Action</th>
                        </tr>
                        </tfoot>

                        <%
                            List<User> listUsers = (List<User>) request.getSession().getAttribute("listUsu");
                        %>
                        <tbody>

                        <% for (User user : listUsers) { %>
                        <tr>
                            <td> <%= user.getId_user() %> </td>
                            <td> <%= user.getName_user() %> </td>
                            <td> <%= user.getRole_user() %> </td>

                            <td style="white-space: nowrap;">
                                <form name="delete" action="SvDeleteUser" method="post" style="display: inline-block; margin: 0; margin-right: 5px;"> <!-- We execute the Servlet -->
                                    <button type="submit" class="btn btn-primary btn-sm" style="background-color: red;">
                                        <i class="fas fa-trash-alt"></i> Delete
                                    </button>
                                    <input type="hidden" name="id" value="<%= user.getId_user() %>"> <!-- esto es para mandar el codigo al servlet -->
                                </form>
                                <form name="update" action="SvUpdateUser" method="get" style="display: inline-block; margin: 0;">
                                    <button type="submit" class="btn btn-primary btn-sm">
                                       <i class="fas fa-pencil-alt"></i> Update
                                    </button>
                                    <input type="hidden" name="id" value="<%= user.getId_user() %>">
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
