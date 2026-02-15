<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>

<style>
  /* Premium Main Content */
  #layoutSidenav_content {
    background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
  }

  main {
    min-height: calc(100vh - 120px);
  }

  .dashboard-header {
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    color: white;
    padding: 3rem 0;
    margin: -1.5rem -1.5rem 2rem -1.5rem;
    border-radius: 0 0 30px 30px;
    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
  }

  .dashboard-header h1 {
    font-weight: 700;
    margin-bottom: 0.5rem;
  }

  .dashboard-header p {
    opacity: 0.9;
    font-size: 1.1rem;
  }

  /* Stats Cards */
  .stats-card {
    background: white;
    border-radius: 16px;
    padding: 1.5rem;
    box-shadow: 0 5px 20px rgba(0, 0, 0, 0.08);
    transition: all 0.3s ease;
    border: none;
    margin-bottom: 1.5rem;
    position: relative;
    overflow: hidden;
  }

  .stats-card::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 4px;
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
  }

  .stats-card:hover {
    transform: translateY(-5px);
    box-shadow: 0 15px 40px rgba(0, 0, 0, 0.12);
  }

  .stats-icon {
    width: 60px;
    height: 60px;
    border-radius: 12px;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 1.8rem;
    margin-bottom: 1rem;
  }

  .stats-icon.purple { background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); color: white; }
  .stats-icon.blue { background: linear-gradient(135deg, #667eea 0%, #3498db 100%); color: white; }
  .stats-icon.green { background: linear-gradient(135deg, #11998e 0%, #38ef7d 100%); color: white; }
  .stats-icon.orange { background: linear-gradient(135deg, #f2994a 0%, #f2c94c 100%); color: white; }

  .stats-card h3 {
    font-size: 2rem;
    font-weight: 700;
    color: #2c3e50;
    margin-bottom: 0.25rem;
  }

  .stats-card p {
    color: #7f8c8d;
    font-weight: 500;
    margin-bottom: 0;
    font-size: 0.9rem;
    text-transform: uppercase;
    letter-spacing: 0.5px;
  }

  /* Welcome Card */
  .welcome-card {
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    border-radius: 20px;
    padding: 2.5rem;
    color: white;
    box-shadow: 0 10px 30px rgba(102, 126, 234, 0.3);
    margin-bottom: 2rem;
    position: relative;
    overflow: hidden;
  }

  .welcome-card::before {
    content: '';
    position: absolute;
    width: 300px;
    height: 300px;
    background: rgba(255, 255, 255, 0.1);
    border-radius: 50%;
    top: -150px;
    right: -150px;
  }

  .welcome-card h2 {
    font-weight: 700;
    margin-bottom: 0.75rem;
  }

  .welcome-card p {
    opacity: 0.95;
    font-size: 1.05rem;
  }

  /* Quick Actions */
  .quick-action-btn {
    background: white;
    border: none;
    border-radius: 12px;
    padding: 1.25rem;
    text-align: center;
    transition: all 0.3s ease;
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.08);
    color: #2c3e50;
    text-decoration: none;
    display: block;
  }

  .quick-action-btn:hover {
    transform: translateY(-5px);
    box-shadow: 0 10px 25px rgba(0, 0, 0, 0.12);
    color: #667eea;
  }

  .quick-action-btn i {
    font-size: 2rem;
    margin-bottom: 0.75rem;
    display: block;
  }

  .quick-action-btn span {
    font-weight: 600;
    font-size: 0.95rem;
  }
</style>

<main>
  <div class="container-fluid px-4">
    <!-- Welcome Section -->
    <div class="row mt-4">
      <div class="col-12">
        <div class="welcome-card">
          <div class="row align-items-center">
            <div class="col-md-8">
              <h2><i class="fas fa-hand-sparkles me-2"></i>Welcome to Dental Clinic Pro</h2>
              <p class="mb-0">
                Manage your dental practice efficiently with our comprehensive management system.
                Track patients, appointments, and staff all in one place.
              </p>
            </div>
            <div class="col-md-4 text-end d-none d-md-block">
              <i class="fas fa-tooth" style="font-size: 5rem; opacity: 0.3;"></i>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Stats Cards -->
    <div class="row">
      <div class="col-xl-3 col-md-6">
        <div class="stats-card">
          <div class="stats-icon purple">
            <i class="fas fa-users"></i>
          </div>
          <h3>245</h3>
          <p>Total Patients</p>
        </div>
      </div>

      <div class="col-xl-3 col-md-6">
        <div class="stats-card">
          <div class="stats-icon blue">
            <i class="fas fa-user-md"></i>
          </div>
          <h3>12</h3>
          <p>Dentists</p>
        </div>
      </div>

      <div class="col-xl-3 col-md-6">
        <div class="stats-card">
          <div class="stats-icon green">
            <i class="fas fa-calendar-check"></i>
          </div>
          <h3>48</h3>
          <p>Today's Appointments</p>
        </div>
      </div>

      <div class="col-xl-3 col-md-6">
        <div class="stats-card">
          <div class="stats-icon orange">
            <i class="fas fa-clock"></i>
          </div>
          <h3>8</h3>
          <p>Pending Appointments</p>
        </div>
      </div>
    </div>

    <!-- Quick Actions -->
    <div class="row mt-4">
      <div class="col-12">
        <h4 class="mb-3" style="font-weight: 700; color: #2c3e50;">
          <i class="fas fa-bolt me-2" style="color: #667eea;"></i>Quick Actions
        </h4>
      </div>

      <div class="col-lg-3 col-md-6 mb-3">
        <a href="altaPatient.jsp" class="quick-action-btn">
          <i class="fas fa-user-plus" style="color: #667eea;"></i>
          <span>Add New Patient</span>
        </a>
      </div>

      <div class="col-lg-3 col-md-6 mb-3">
        <a href="altaShift.jsp" class="quick-action-btn">
          <i class="fas fa-calendar-plus" style="color: #3498db;"></i>
          <span>Schedule Appointment</span>
        </a>
      </div>

      <div class="col-lg-3 col-md-6 mb-3">
        <a href="SvPatient" class="quick-action-btn">
          <i class="fas fa-hospital-user" style="color: #11998e;"></i>
          <span>View All Patients</span>
        </a>
      </div>

      <div class="col-lg-3 col-md-6 mb-3">
        <a href="SvShift" class="quick-action-btn">
          <i class="fas fa-calendar-alt" style="color: #f2994a;"></i>
          <span>View Appointments</span>
        </a>
      </div>
    </div>
  </div>
</main>

