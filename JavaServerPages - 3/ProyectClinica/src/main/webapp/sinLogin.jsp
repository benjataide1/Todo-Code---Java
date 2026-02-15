<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content="Access Denied - Dental Clinic Pro"/>
    <meta name="author" content="Dental Clinic Pro"/>
    <title>Access Denied - Dental Clinic Pro</title>
    <link href="css/styles.css" rel="stylesheet"/>
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    <style>
        /* Premium Access Denied Page Styling */
        body.access-denied-page {
            background: linear-gradient(135deg, #f2994a 0%, #f2c94c 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 0;
        }

        /* Fix: avoid SB Admin auth wrappers constraining the page */
        body.access-denied-page #layoutAuthentication,
        body.access-denied-page #layoutAuthentication_content,
        body.access-denied-page main {
            width: 100%;
        }

        body.access-denied-page #layoutAuthentication_content {
            display: flex;
            flex: 1 1 auto;
            min-height: 100vh;
        }

        body.access-denied-page main {
            display: flex;
            flex: 1 1 auto;
            align-items: center;
        }

        body.access-denied-page .row.min-vh-100 {
            min-height: 100vh !important;
        }

        .access-card {
            backdrop-filter: blur(10px);
            background: rgba(255, 255, 255, 0.98) !important;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 0 20px 60px rgba(0, 0, 0, 0.3);
            border-radius: 20px !important;
            overflow: hidden;
            animation: slideUp 0.5s ease-out;
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

        .access-card .card-header {
            background: linear-gradient(135deg, #f2994a 0%, #f2c94c 100%);
            border: none;
            padding: 2rem;
        }

        .access-card .card-header h3 {
            color: white;
            font-weight: 600;
            margin: 0;
        }

        .access-icon {
            width: 80px;
            height: 80px;
            background: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 1.5rem;
            animation: bounce 2s infinite;
        }

        .access-icon i {
            font-size: 2.5rem;
            color: #f2994a;
        }

        @keyframes bounce {
            0%, 100% { transform: translateY(0); }
            50% { transform: translateY(-10px); }
        }

        .access-message {
            background: linear-gradient(135deg, rgba(242, 153, 74, 0.1) 0%, rgba(242, 201, 76, 0.1) 100%);
            border-left: 4px solid #f2994a;
            padding: 1.5rem;
            border-radius: 12px;
            margin-bottom: 1.5rem;
        }

        .access-message p {
            color: #c77a3a;
            font-weight: 600;
            margin: 0;
            font-size: 1.05rem;
        }

        .btn-login {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border: none;
            padding: 0.875rem 2rem;
            border-radius: 12px;
            font-weight: 600;
            transition: all 0.3s ease;
            box-shadow: 0 8px 20px rgba(102, 126, 234, 0.3);
            width: 100%;
            color: white;
            text-decoration: none;
            display: inline-block;
        }

        .btn-login:hover {
            transform: translateY(-2px);
            box-shadow: 0 12px 30px rgba(102, 126, 234, 0.4);
            color: white;
        }
    </style>
</head>
<body class="access-denied-page">
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container-fluid px-4 px-lg-5">
                <div class="row min-vh-100 align-items-center justify-content-center">
                    <div class="col-12 col-md-10 col-lg-6 col-xl-5">
                        <div class="card access-card border-0">
                            <div class="card-header text-center">
                                <div class="access-icon">
                                    <i class="fas fa-lock"></i>
                                </div>
                                <h3>Access Denied</h3>
                            </div>
                            <div class="card-body p-4">
                                <div class="access-message">
                                    <p>
                                        <i class="fas fa-shield-alt me-2"></i>
                                        Authentication Required
                                    </p>
                                </div>
                                <div class="alert alert-info border-0 mb-4" style="border-radius: 12px; background: linear-gradient(135deg, rgba(102, 126, 234, 0.1) 0%, rgba(52, 152, 219, 0.1) 100%); border-left: 4px solid #667eea;">
                                    <small>
                                        <i class="fas fa-info-circle me-1"></i>
                                        You need to sign in to access this page. Please login with your credentials.
                                    </small>
                                </div>
                                <a href="login.jsp" class="btn btn-login">
                                    <i class="fas fa-sign-in-alt me-2"></i>Go to Login
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
    <div id="layoutAuthentication_footer" style="position: fixed; bottom: 0; width: 100%;">
        <footer class="py-3" style="background: rgba(255, 255, 255, 0.1); backdrop-filter: blur(10px);">
            <div class="container-fluid px-4">
                <div class="d-flex align-items-center justify-content-center small text-white">
                    <div>&copy; Dental Clinic Pro 2026</div>
                </div>
            </div>
        </footer>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="js/scripts.js"></script>
</body>
</html>
