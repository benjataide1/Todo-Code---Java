<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>

<style>
  /* Premium Sidebar Styling */
  .sb-sidenav {
    background: linear-gradient(180deg, #2c3e50 0%, #34495e 100%) !important;
    box-shadow: 4px 0 20px rgba(0, 0, 0, 0.1);
  }

  .sb-sidenav-menu-heading {
    font-weight: 700;
    font-size: 0.7rem;
    text-transform: uppercase;
    letter-spacing: 1.5px;
    color: rgba(255, 255, 255, 0.5) !important;
    padding: 1.5rem 1rem 0.5rem !important;
  }

  .sb-sidenav .nav-link {
    color: rgba(255, 255, 255, 0.85) !important;
    padding: 0.875rem 1rem !important;
    margin: 0.25rem 0.75rem;
    border-radius: 10px;
    transition: all 0.3s ease;
    font-weight: 500;
    position: relative;
    overflow: hidden;
  }

  .sb-sidenav .nav-link::before {
    content: '';
    position: absolute;
    left: 0;
    top: 0;
    height: 100%;
    width: 0;
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    transition: width 0.3s ease;
    z-index: -1;
  }

  .sb-sidenav .nav-link:hover {
    color: white !important;
    transform: translateX(5px);
    background: rgba(255, 255, 255, 0.1);
  }

  .sb-sidenav .nav-link:hover::before {
    width: 100%;
  }

  .sb-sidenav .nav-link.collapsed {
    background: rgba(255, 255, 255, 0.05);
  }

  .sb-nav-link-icon {
    width: 2rem;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-size: 1.1rem;
  }

  .sb-sidenav-menu-nested .nav-link {
    padding-left: 2.5rem !important;
    font-size: 0.9rem;
    margin: 0.125rem 0.75rem;
  }

  .sb-sidenav-menu-nested .nav-link::before {
    content: '→';
    position: absolute;
    left: 1.5rem;
    opacity: 0;
    transition: all 0.3s ease;
  }

  .sb-sidenav-menu-nested .nav-link:hover::before {
    opacity: 1;
    left: 1rem;
  }

  .sb-sidenav-collapse-arrow {
    transition: transform 0.3s ease;
    margin-left: auto;
  }

  .nav-link[aria-expanded="true"] .sb-sidenav-collapse-arrow {
    transform: rotate(180deg);
  }

  .sb-sidenav-footer {
    background: rgba(0, 0, 0, 0.2) !important;
    padding: 1.25rem !important;
    border-top: 1px solid rgba(255, 255, 255, 0.1);
    margin-top: auto;
  }

  .sb-sidenav-footer .small {
    color: rgba(255, 255, 255, 0.6);
    font-weight: 600;
    text-transform: uppercase;
    letter-spacing: 0.5px;
    font-size: 0.7rem;
  }

  .sb-sidenav-footer div:last-child {
    color: white;
    font-weight: 700;
    font-size: 1rem;
    margin-top: 0.5rem;
  }

  /* Icon Colors */
  .icon-user { color: #3498db; }
  .icon-dentist { color: #1abc9c; }
  .icon-patient { color: #e74c3c; }
  .icon-shift { color: #f39c12; }
  .icon-menu { color: #9b59b6; }
</style>

<div id="layoutSidenav_nav">
  <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
    <div class="sb-sidenav-menu">
      <div class="nav">
        <div class="sb-sidenav-menu-heading">Dashboard</div>
        <a class="nav-link" href="index.jsp">
          <div class="sb-nav-link-icon"><i class="fas fa-home icon-menu"></i></div>
          Home
        </a>

        <div class="sb-sidenav-menu-heading">Management</div>

        <!-- User Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseUser"
           aria-expanded="false" aria-controls="collapseUser">
          <div class="sb-nav-link-icon"><i class="fas fa-users-cog icon-user"></i></div>
          User Management
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapseUser" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="SvUser">
              <i class="fas fa-list me-2"></i>View All Users
            </a>
            <a class="nav-link" href="altaUser.jsp">
              <i class="fas fa-user-plus me-2"></i>Add New User
            </a>
          </nav>
        </div>

        <!-- Dentist Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseDentist"
           aria-expanded="false" aria-controls="collapseDentist">
          <div class="sb-nav-link-icon"><i class="fas fa-user-md icon-dentist"></i></div>
          Dentist Management
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapseDentist" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="registerOdonto">
              <i class="fas fa-list me-2"></i>View All Dentists
            </a>
            <a class="nav-link" href="altaOdontologo.jsp">
              <i class="fas fa-user-plus me-2"></i>Add New Dentist
            </a>
          </nav>
        </div>

        <!-- Patient Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePatient"
           aria-expanded="false" aria-controls="collapsePatient">
          <div class="sb-nav-link-icon"><i class="fas fa-hospital-user icon-patient"></i></div>
          Patient Management
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapsePatient" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="SvPatient">
              <i class="fas fa-list me-2"></i>View All Patients
            </a>
            <a class="nav-link" href="altaPatient.jsp">
              <i class="fas fa-user-plus me-2"></i>Add New Patient
            </a>
          </nav>
        </div>

        <!-- Shift Menu -->
        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseShift"
           aria-expanded="false" aria-controls="collapseShift">
          <div class="sb-nav-link-icon"><i class="fas fa-calendar-check icon-shift"></i></div>
          Appointment Management
          <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
        </a>
        <div class="collapse" id="collapseShift" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
          <nav class="sb-sidenav-menu-nested nav">
            <a class="nav-link" href="SvShift">
              <i class="fas fa-list me-2"></i>View All Appointments
            </a>
            <a class="nav-link" href="altaShift.jsp">
              <i class="fas fa-calendar-plus me-2"></i>Schedule Appointment
            </a>
          </nav>
        </div>

      </div>
    </div>

</div>
