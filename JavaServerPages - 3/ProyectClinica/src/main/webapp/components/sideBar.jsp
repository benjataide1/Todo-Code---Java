<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>

<div id="layoutSidenav_nav">
  <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
    <div class="sb-sidenav-menu">
      <div class="nav">
        <div class="sb-sidenav-menu-heading"></div>
        <a class="nav-link" href="index.html">
          <div class="sb-nav-link-icon"><i class="fas fa-solid fa-bars"></i></div>
          Menu
        </a>
        <div class="sb-sidenav-menu-heading">Management</div>

        <!-- User Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseUser"
           aria-expanded="false" aria-controls="collapseUser">
          <div class="sb-nav-link-icon"><i class="fas fa-solid fa-user"></i></div>
          User
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapseUser" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="SvUser">Get User</a>
            <a class="nav-link" href="altaUser.jsp">User Registration</a>
          </nav>
        </div>

        <!-- Dentist Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseDentist"
           aria-expanded="false" aria-controls="collapseDentist">
          <div class="sb-nav-link-icon"><i class="fas fa-solid fa-user-doctor"></i></div>
          Dentist
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapseDentist" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="registerOdonto">Get Dentist</a>
            <a class="nav-link" href="altaOdontologo.jsp">Dentist Registration</a>
          </nav>
        </div>

        <!-- Patient Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePatient"
           aria-expanded="false" aria-controls="collapsePatient">
          <div class="sb-nav-link-icon"><i class="fas fa-solid fa-user-doctor"></i></div>
          Patient
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapsePatient" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="SvPatient">Get Patient</a>
            <a class="nav-link" href="altaPatient.jsp">Patient Registration</a>
          </nav>
        </div>

        <!-- Shift Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseShift"
           aria-expanded="false" aria-controls="collapseShift">
          <div class="sb-nav-link-icon"><i class="fas fa-solid fa-user-doctor"></i></div>
          Shift
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapseShift" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="rasdf">Get Shifts</a>
            <a class="nav-link" href="sdfjsdf.jsp">Shift Registration</a>
          </nav>
        </div>
      </div>
    </div>


    <div class="sb-sidenav-footer">
      <div class="small">Logged in as:</div>
      Start Bootstrap
    </div>
  </nav>
</div>
