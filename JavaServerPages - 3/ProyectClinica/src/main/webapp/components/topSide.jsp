<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>

<style>
  /* Premium Navbar Styling */
  .sb-topnav {
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%) !important;
    box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
    border-bottom: 2px solid rgba(255, 255, 255, 0.1);
    backdrop-filter: blur(10px);
    padding: 0.75rem 0;
  }

  .navbar-brand {
    font-weight: 700 !important;
    font-size: 1.4rem !important;
    letter-spacing: 0.5px;
    transition: all 0.3s ease;
    padding: 0.5rem 1rem !important;
    border-radius: 10px;
  }

  .navbar-brand:hover {
    background: rgba(255, 255, 255, 0.1);
    transform: translateY(-2px);
  }

  .navbar-brand i {
    margin-left: 0.5rem;
    animation: pulse 2s infinite;
  }

  @keyframes pulse {
    0%, 100% { transform: scale(1); }
    50% { transform: scale(1.1); }
  }

  .btn-link {
    color: white !important;
    transition: all 0.3s ease;
    border-radius: 8px;
    padding: 0.5rem 0.75rem;
  }

  .btn-link:hover {
    background: rgba(255, 255, 255, 0.15);
    transform: scale(1.05);
  }

  .nav-link {
    color: rgba(255, 255, 255, 0.95) !important;
    font-weight: 500;
    transition: all 0.3s ease;
    border-radius: 8px;
    padding: 0.5rem 1rem !important;
  }

  .nav-link:hover {
    background: rgba(255, 255, 255, 0.15);
    color: white !important;
  }

  .nav-link i {
    margin-right: 0.5rem;
  }
</style>

<nav class="sb-topnav navbar navbar-expand navbar-dark">
  <!-- Navbar Brand-->
  <a class="navbar-brand ps-3" href="index.jsp">
    <i class="fas fa-clinic-medical me-1"></i>
    Dental Clinic Pro
    <i class="fas fa-tooth"></i>
  </a>
  <!-- Sidebar Toggle-->
  <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!">
    <i class="fas fa-bars"></i>
  </button>
  <!-- Navbar Search-->
  <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0"></form>

  <!-- Navbar-->
  <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown"
         aria-expanded="false">
        <i class="fas fa-user-circle fa-fw"></i>
        <span class="ms-1"><%= request.getSession().getAttribute("user")%></span>
      </a>
      <ul class="dropdown-menu dropdown-menu-end shadow-lg border-0" aria-labelledby="navbarDropdown" style="border-radius: 12px; margin-top: 0.5rem;">
        <li><a class="dropdown-item" href="#"><i class="fas fa-user me-2"></i>Profile</a></li>
        <li><a class="dropdown-item" href="#"><i class="fas fa-cog me-2"></i>Settings</a></li>
        <li><hr class="dropdown-divider" /></li>
        <li><a class="dropdown-item" href="Login"><i class="fas fa-sign-out-alt me-2"></i>Logout</a></li>
      </ul>
    </li>
  </ul>
</nav>