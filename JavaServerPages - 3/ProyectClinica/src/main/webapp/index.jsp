<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<%--! header --%>
<%@ include file="components/header.jsp" %>


<body class="sb-nav-fixed">

 <%-- Auth is now enforced centrally by AuthFilter (WEB-INF/web.xml) --%>

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
