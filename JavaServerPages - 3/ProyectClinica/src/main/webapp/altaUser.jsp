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
                    <h1 class="display-4 mb-3">Alta User</h1>
                    <p class="lead mb-4">Complete el formulario para registrar un Nuevo Usuario.</p>
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
                                    <h3 class="text-center font-weight-light my-4">Registro de Usuario</h3>
                                </div>
                                <div class="card-body">
                                    <form action="SvUser" method="POST">
                                        <div class="col-10">
                                            <%--                                            <div class="col-md-6">--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputNombre" name="name" type="text"
                                                       placeholder="Ingrese el nombre" required/>
                                                <label for="inputNombre">Name</label>
                                            </div>
                                            <%--                                            </div>--%>
                                            <%--                                            <div class="col-md-6">--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputPassword" name="password"
                                                       type="password" placeholder="Ingrese el Password" required/>
                                                <label for="inputPassword">Password</label>
                                            </div>
                                            <%--                                            </div>--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputRol" name="rol"
                                                       type="tel" placeholder="Ingrese el Rol" required/>
                                                <label for="inputRol">Rol</label>
                                            </div>


                                        </div>
                                        <div class="mt-4 mb-0">
                                            <div class="d-grid">
                                                <button class="btn btn-primary btn-block" type="submit">
                                                    Create User
                                                </button>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                                <div class="card-footer text-center py-3">
                                    <div class="small">
                                        <a href="listarUsuario">Ver lista de usuarios registrados</a>
                                    </div>
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