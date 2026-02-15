<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content="Dental Clinic Management System - Secure Login" />
  <meta name="author" content="Dental Clinic Pro" />
  <title>Welcome - Dental Clinic Pro</title>
  <link href="css/styles.css" rel="stylesheet" />
  <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
  <style>
    /* Premium Gradient Background */
    body.login-page {
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      min-height: 100vh;
      display: flex;
      align-items: center;
      justify-content: center;
      position: relative;
      overflow: hidden;
      padding: 0;
    }

    /* Animated Background Shapes */
    body.login-page::before {
      content: '';
      position: absolute;
      width: 500px;
      height: 500px;
      background: rgba(255, 255, 255, 0.1);
      border-radius: 50%;
      top: -250px;
      right: -250px;
      animation: float 6s ease-in-out infinite;
    }

    body.login-page::after {
      content: '';
      position: absolute;
      width: 400px;
      height: 400px;
      background: rgba(255, 255, 255, 0.08);
      border-radius: 50%;
      bottom: -200px;
      left: -200px;
      animation: float 8s ease-in-out infinite;
    }

    @keyframes float {
      0%, 100% { transform: translateY(0px); }
      50% { transform: translateY(-20px); }
    }

    /* Premium Card Design */
    .login-card {
      backdrop-filter: blur(10px);
      background: rgba(255, 255, 255, 0.98) !important;
      border: 1px solid rgba(255, 255, 255, 0.3);
      box-shadow: 0 20px 60px rgba(0, 0, 0, 0.3);
      border-radius: 20px !important;
      overflow: hidden;
      animation: slideUp 0.5s ease-out;
      width: 100%;
      max-width: 920px;
      margin: 0 auto;
    }

    @keyframes slideUp {
      from {
        opacity: 0;
        transform: translateY(30px);
      }
      to {
        opacity: 1;
        transform: translateY(0);
      }
    }

    .login-card .card-header {
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      border: none;
      padding: 3rem 2.5rem;
      text-align: center;
    }

    .login-card .card-header h3 {
      color: white;
      font-weight: 700;
      font-size: 2.4rem;
      margin: 0;
      letter-spacing: 0.5px;
    }

    .login-card .card-header p {
      color: rgba(255, 255, 255, 0.9);
      margin: 0.5rem 0 0 0;
      font-size: 1rem;
    }

    .login-card .brand-icon {
      width: 96px;
      height: 96px;
      background: white;
      border-radius: 50%;
      display: flex;
      align-items: center;
      justify-content: center;
      margin: 0 auto 1.5rem;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
    }

    .login-card .brand-icon i {
      font-size: 3rem;
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      -webkit-background-clip: text;
      -webkit-text-fill-color: transparent;
      background-clip: text;
    }

    .login-card .card-body {
      padding: 3.5rem 3rem;
    }

    /* Premium Input Fields - Sin floating labels para mejor visualización */
    .input-group-custom {
      position: relative;
      margin-bottom: 1.5rem;
    }

    .input-group-custom label {
      display: block;
      margin-bottom: 0.5rem;
      color: #495057;
      font-weight: 600;
      font-size: 0.95rem;
    }

    .input-group-custom i.input-icon-left {
      position: absolute;
      left: 1.25rem;
      top: 50%;
      transform: translateY(-50%);
      color: #667eea;
      z-index: 10;
      pointer-events: none;
    }

    .input-group-custom .form-control {
      border: 2px solid #e0e6ed;
      border-radius: 12px;
      padding: 1rem 1rem 1rem 3rem;
      transition: all 0.3s ease;
      font-size: 1rem;
      height: auto;
    }

    .input-group-custom .form-control:focus {
      border-color: #667eea;
      box-shadow: 0 0 0 0.25rem rgba(102, 126, 234, 0.15);
      transform: translateY(-2px);
    }

    .input-group-custom .form-control::placeholder {
      color: #adb5bd;
    }

    /* Premium Button */
    .btn-login {
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      border: none;
      padding: 1rem 3rem;
      border-radius: 12px;
      font-weight: 700;
      font-size: 1.1rem;
      letter-spacing: 0.5px;
      transition: all 0.3s ease;
      box-shadow: 0 8px 20px rgba(102, 126, 234, 0.4);
      width: 100%;
      color: white;
      text-transform: uppercase;
    }

    .btn-login:hover {
      transform: translateY(-3px);
      box-shadow: 0 15px 35px rgba(102, 126, 234, 0.5);
      background: linear-gradient(135deg, #5568d3 0%, #65408b 100%);
    }

    .btn-login:active {
      transform: translateY(-1px);
    }

    /* Custom Checkbox */
    .form-check {
      margin-bottom: 1.5rem;
    }

    .form-check-input {
      width: 1.25rem;
      height: 1.25rem;
      margin-top: 0.125rem;
      border: 2px solid #667eea;
      border-radius: 0.375rem;
    }

    .form-check-input:checked {
      background-color: #667eea;
      border-color: #667eea;
    }

    .form-check-label {
      color: #495057;
      font-weight: 500;
      margin-left: 0.5rem;
      font-size: 0.95rem;
    }

    /* Footer Styling */
    .login-footer {
      background: rgba(248, 249, 250, 0.95);
      border-top: 1px solid rgba(102, 126, 234, 0.1);
      padding: 1.25rem;
    }

    .login-footer .small {
      color: #6c757d;
      font-size: 0.875rem;
    }

    .login-footer a {
      color: #667eea;
      text-decoration: none;
      font-weight: 500;
      transition: color 0.3s ease;
    }

    .login-footer a:hover {
      color: #764ba2;
    }

    /* Fix: ensure SB Admin auth wrappers don't constrain the page width/height */
    body.login-page #layoutAuthentication,
    body.login-page #layoutAuthentication_content,
    body.login-page main {
      width: 100%;
    }

    body.login-page #layoutAuthentication_content {
      display: flex;
      flex: 1 1 auto;
      min-height: 100vh;
    }

    body.login-page main {
      display: flex;
      flex: 1 1 auto;
      align-items: center;
    }

    body.login-page .container-fluid {
      width: 100%;
    }

    body.login-page .row.min-vh-100 {
      min-height: 100vh !important;
    }

    /* Make the card feel “full size” on desktop, while staying responsive */
    @media (min-width: 992px) {
      .login-card {
        max-width: 980px;
      }
    }

    @media (max-width: 420px) {
      .login-card .card-body {
        padding: 2rem 1.5rem;
      }
      .login-card .card-header {
        padding: 2.25rem 1.5rem;
      }
    }
  </style>
</head>
<body class="login-page">
<div id="layoutAuthentication">
  <div id="layoutAuthentication_content">
    <main>
      <div class="container-fluid px-4 px-lg-5">
        <div class="row min-vh-100 align-items-center justify-content-center">
          <div class="col-12 col-md-10 col-lg-8 col-xl-7 col-xxl-6">
            <div class="card login-card border-0">
              <div class="card-header">
                <div class="brand-icon">
                  <i class="fas fa-tooth"></i>
                </div>
                <h3>Welcome Back</h3>
                <p>Sign in to your account</p>
              </div>
              <div class="card-body">
                <form action="Login" method="POST">

                  <!-- Username Input -->
                  <div class="input-group-custom">
                    <label for="inputUser">
                      <i class="fas fa-user me-2"></i>Username
                    </label>
                    <input class="form-control"
                           id="inputUser"
                           name="user"
                           type="text"
                           placeholder="Enter your username"
                           required
                           autocomplete="username" />
                  </div>

                  <!-- Password Input -->
                  <div class="input-group-custom">
                    <label for="inputPassword">
                      <i class="fas fa-lock me-2"></i>Password
                    </label>
                    <input class="form-control"
                           id="inputPassword"
                           name="password"
                           type="password"
                           placeholder="Enter your password"
                           required
                           autocomplete="current-password" />
                  </div>

                  <!-- Submit Button -->
                  <div class="d-grid mt-4">
                    <button class="btn btn-primary btn-login" type="submit">
                      <i class="fas fa-sign-in-alt me-2"></i>Sign In
                    </button>
                  </div>
                </form>
              </div>
              <div class="card-footer login-footer text-center">
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="js/scripts.js"></script>
</body>
</html>
