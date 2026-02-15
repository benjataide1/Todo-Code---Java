<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<%--! header --%>
<%@ include file="components/header.jsp" %>


<body class="sb-nav-fixed">

 <%

     //? Arregla por que no funciona esto, puedo entrar tranquilamente ami jsp
    // Obtenemos la sesión actual del usuario
    HttpSession mysession = request.getSession();
    // Intentamos recuperar el atributo "user" que debió setearse al hacer login
    String user = (String) mysession.getAttribute("user");

    // Si el atributo es nulo, significa que el usuario no ha iniciado sesión
    if(user == null){
        // Redirigimos automáticamente a la página de login para proteger el contenido
        response.sendRedirect("sinLogin.jsp");
    }

    %>

<%--! Top Side--%>
<%@ include file="components/topSide.jsp" %>

<%--! Cuerpo --%>
<div id="layoutSidenav">

    <%--! Barra lateral--%>
    <%@ include file="components/sideBar.jsp" %>

    <div id="layoutSidenav_content">

        <%--! main --%>
        <%@ include file="components/main.jsp" %>

        <%--! footer --%>
        <%@ include file="components/footer.jsp" %>
    </div>
</div>


<%--! Scripts--%>
<%@ include file="components/scripts.jsp" %>

</body>
</html>
