<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content="Login Error - Dental Clinic Pro"/>
    <meta name="author" content="Dental Clinic Pro"/>
    <title>Login Error - Dental Clinic Pro</title>
    <link href="css/styles.css" rel="stylesheet"/>
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    <style>
        /* Premium Error Page Styling */
        body.error-page {
            background: linear-gradient(135deg, #eb3349 0%, #f45c43 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 0;
        }

        /* Fix: avoid SB Admin auth wrappers constraining the page */
        body.error-page #layoutAuthentication,
        body.error-page #layoutAuthentication_content,
        body.error-page main {
            width: 100%;
        }

        body.error-page #layoutAuthentication_content {
            display: flex;
            flex: 1 1 auto;
            min-height: 100vh;
        }

        body.error-page main {
            display: flex;
            flex: 1 1 auto;
            align-items: center;
        }

        body.error-page .row.min-vh-100 {
            min-height: 100vh !important;
        }

        .error-card {
            backdrop-filter: blur(10px);
            background: rgba(255, 255, 255, 0.98) !important;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 0 20px 60px rgba(0, 0, 0, 0.3);
            border-radius: 20px !important;
            overflow: hidden;
            animation: shake 0.5s ease-out, slideUp 0.5s ease-out;
        }

        @keyframes shake {
            0%, 100% { transform: translateX(0); }
            10%, 30%, 50%, 70%, 90% { transform: translateX(-5px); }
            20%, 40%, 60%, 80% { transform: translateX(5px); }
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

        .error-card .card-header {
            background: linear-gradient(135deg, #eb3349 0%, #f45c43 100%);
            border: none;
            padding: 2rem;
        }

        .error-card .card-header h3 {
            color: white;
            font-weight: 600;
            margin: 0;
        }

        .error-icon {
            width: 80px;
            height: 80px;
            background: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 1.5rem;
            animation: pulse 2s infinite;
        }

        .error-icon i {
            font-size: 2.5rem;
            color: #eb3349;
        }

        @keyframes pulse {
            0%, 100% { transform: scale(1); }
            50% { transform: scale(1.05); }
        }

        .error-message {
            background: linear-gradient(135deg, rgba(235, 51, 73, 0.1) 0%, rgba(244, 92, 67, 0.1) 100%);
            border-left: 4px solid #eb3349;
            padding: 1.5rem;
            border-radius: 12px;
            margin-bottom: 1.5rem;
        }

        .error-message p {
            color: #c72a3c;
            font-weight: 600;
            margin: 0;
            font-size: 1.05rem;
        }

        .btn-return {
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

        .btn-return:hover {
            transform: translateY(-2px);
            box-shadow: 0 12px 30px rgba(102, 126, 234, 0.4);
            color: white;
        }
    </style>
</head>
<body class="error-page">
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container-fluid px-4 px-lg-5">
                <div class="row min-vh-100 align-items-center justify-content-center">
                    <div class="col-12 col-md-10 col-lg-6 col-xl-5">
                        <div class="card error-card border-0">
                            <div class="card-header text-center">
                                <div class="error-icon">
                                    <i class="fas fa-exclamation-triangle"></i>
                                </div>
                                <h3>Authentication Failed</h3>
                            </div>
                            <div class="card-body p-4">
                                <div class="error-message">
                                    <p>
                                        <i class="fas fa-times-circle me-2"></i>
                                        Username or Password Incorrect
                                    </p>
                                </div>
                                <div class="alert alert-warning border-0 mb-4" style="border-radius: 12px;">
                                    <small>
                                        <i class="fas fa-info-circle me-1"></i>
                                        <strong>Tip:</strong> Please check your credentials and try again.
                                        Make sure Caps Lock is off.
                                    </small>
                                </div>
                                <a href="login.jsp" class="btn btn-return">
                                    <i class="fas fa-arrow-left me-2"></i>Return to Login
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
