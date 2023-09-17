<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>reviewApply</title>
    <link rel="stylesheet" href="./css/reviewApply.css">
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
                    <span><b>Review</b></span>
                </div>
                <div class="header-left-icon">
                    <span><i class="bi bi-play-btn-fill"></i></span>
                </div>
            </div>
            <div class="header-right d-flex align-items-center">
                <div class="header-right-name me-2">
                    <span>김싸피님</span>
                </div>
                <!-- <div class="header-right-icon">
                    <span><i class="bi bi-person-circle"></i></i></span>
                </div> -->
                <div>
                	<!-- @@@@@@@@@@@@@ -->
                    <a href="main?act=index"><i class="bi bi-house-door-fill fs-1"></i></a>
                </div>
            </div>
        </header>
        <main>
      		 <form action="main" method="POST">
        <input type="hidden" name="act" value="write">
       <div class="form-upside border-bottom border-info-subtle border-2 pt-2">
           <div class="mb-3 w-100 max-vw-100">
               <label for="review-title" class="form-label">&nbsp;작성자</label>
                <input type="text" name="writer" class="form-control" id="review-title" placeholder="이름을 작성해주세요.">
            </div>
            <div class="mb-3 w-100">
               <label for="review-content" class="form-label">&nbsp;작성 내용</label>
               <textarea class="form-control" name="reviewContent" id="review-content" rows="4" style="resize: none;" placeholder="내용을 작성해주세요."></textarea>
            </div>
      </div>
        <div class="form-downside d-flex justify-content-center pt-3">
           <input type="submit" class="btn btn-outline-primary mx-3" value="등록하기">
            <a href="main?act=reviewList"><button type="submit" class="btn btn-outline-secondary mx-3">목록가기</button></a>
        </div>
        </form> 
        </main>
        <footer>
            <div class="footer-p">
                <p>&copy;SSAFIT PROJECT</p>
            </div>
        </footer>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>