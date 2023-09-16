<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="./css/login.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
</head>
<body class="d-flex justify-content-center align-items-center">
    <div class="main-container">
        <header class="d-flex justify-content-between 
            border-bottom border-top border-info-subtle border-2
            px-2">
                <div class="header-left d-flex align-items-center">
                    <div class="header-left-title me-2">
                        <span><b>Login</b></span>
                    </div>
                    <div class="header-left-icon">
                        <span><i class="bi bi-play-btn-fill"></i></span>
                    </div>
                </div>
                <div class="header-right d-flex align-items-center">
                    <div class="header-right-name me-2">
                        <!-- <span>김싸피님</span> -->
                    </div>
                    <!-- <div class="header-right-icon">
                        <span><i class="bi bi-person-circle"></i></i></span>
                    </div> -->
                    <div>
                        <a href="index.html"><i class="bi bi-house-door-fill fs-1"></i></a>
                    </div>
                </div>
            </header>
        <main class="d-flex justify-content-center
        border-bottom border-info-subtle border-2">
        <div class="window d-flex align-items-center">
            <div class="window-login">
                <div class="d-flex justify-content-center my-1  ">
                    <div class="login-title">
                       	 로그인
                    </div>
                </div>
                <div class="login-input">
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" placeholder="Username" aria-label="Username">
                        <span class="input-group-text">@</span>
                        <input type="text" class="form-control" placeholder="" aria-label="Server">
                      </div>
                      <div class="input-group mb-3">
                        <input type="password" class="form-control" placeholder="Password" aria-label="Username" aria-describedby="basic-addon1">
                    </div>
                </div>
                    <div class="login-button">
                        <div class="d-flex justify-content-center">
                            <div class="btn-group"  role="group" aria-label="Basic example">
                                <a href="index.html"><button type="button" class="btn btn-outline-primary">로그인</button></a>
                                <a href="index.html"><button type="button" class="btn btn-outline-secondary">취소</button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <footer>
            <div class="footer-p">
                <p>&copy;SSAFIT PROJECT</p>
            </div>
        </footer>
    </div>
</body>
</html>