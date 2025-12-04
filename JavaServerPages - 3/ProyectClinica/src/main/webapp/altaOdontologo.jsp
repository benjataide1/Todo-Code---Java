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
                    <p class="lead mb-4">Complete el formulario para registrar un nuevo odontólogo en el sistema.</p>
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
                                    <h3 class="text-center font-weight-light my-4">Registro de Odontólogo</h3>
                                </div>
                                <div class="card-body">
                                    <form action="registrarOdontologo" method="POST">
                                        <div class="col-10">
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputDNI" name="DNI" type="text"
                                                       placeholder="Enter your DNI" required/>
                                                <label for="inputDNI">DNI</label>
                                            </div>
                                            <%--                                            <div class="col-md-6">--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputNombre" name="nombre" type="text"
                                                       placeholder="Ingrese el nombre" required/>
                                                <label for="inputNombre">Nombre</label>
                                            </div>
                                            <%--                                            </div>--%>
                                            <%--                                            <div class="col-md-6">--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputApellido" name="apellido"
                                                       type="text" placeholder="Ingrese el apellido" required/>
                                                <label for="inputApellido">Apellido</label>
                                            </div>
                                            <%--                                            </div>--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputTelefono" name="telefono"
                                                       type="tel" placeholder="Ingrese el teléfono" required/>
                                                <label for="inputTelefono">Teléfono</label>
                                            </div>

                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputAddress" name="address"
                                                       type="text" placeholder="Enter your Address" required/>
                                                <label for="inputMatricula">Address</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputDate" name="date" type="text"
                                                       placeholder="Date" required/>
                                                <label for="inputDate">Date</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputEspecialidad" name="especialidad" type="text"
                                                       placeholder="Ingresar Especialidad" required/>
                                                <label for="inputNombre">Especialidad</label>
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
                                <div class="card-footer text-center py-3">
                                    <div class="small">
                                        <a href="listarOdontologos">Ver lista de odontólogos registrados</a>
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
</html>
