<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>reviewList</title>
    <link rel="stylesheet" href="./css/reviewList.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
</head>
<body>
    <div class="main-container">
        <header class="d-flex justify-content-between 
        border-bottom border-top border-info-subtle border-2
        px-2">
            <div class="header-left d-flex align-items-center">
                <div class="header-left-title me-2">
                    <span><b>Review List</b></span>
                </div>
                <div class="header-left-icon">
                    <span><i class="bi bi-play-btn-fill"></i></span>
                </div>
            </div>
            <div class="header-right d-flex align-items-center">
                <div class="header-right-name me-2">
                    <span>ê¹ì¸í¼ë</span>
                </div>
                <!-- <div class="header-right-icon">
                    <span><i class="bi bi-person-circle"></i></i></span>
                </div> -->
                <div>
                    <a href="main?act=index"><i class="bi bi-house-door-fill fs-1"></i></a>
                </div>
            </div>
        </header>
        <main class="border-bottom border-info-subtle border-2">
            <div class="main-flex-container d-flex w-100">
                <div class></div>
                <div class="review-videoside d-flex align-items-center px-4">
                    <div>
                        <iframe width="560" height="315" src="https://www.youtube.com/embed/tzN6ypk6Sps" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
                    </div>
                </div>
                <div class="vertical-line"></div>
                <div class="review-rightside px-3">
                    <div class="review-rightside-header">
                        <ul class="review-item-header-ul h-100 d-flex align-items-center">
                            <li class="review-item-num">
                                <div>번호</div>
                            </li>
                            <li class="review-item-title">
                                <div>제목</div>
                            </li>
                            <li class="review-item-writer">
                                <div>작성자</div>
                            </li>
                            <li class="review-item-date">
                                <div>작성일자</div>
                            </li>
                        </ul>
                    </div>
                   	<div class="review-rightside-list">
                        <ul class="review-item-list-ul d-flex"
                        data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                            <li class="review-item-num">
                                <div>1</div>
                            </li>
                            <li class="review-item-title">
                                <div>ì ì©í ììì´ìì</div>
                            </li>
                            <li class="review-item-writer">
                                <div>ê¹ì¸í¼</div>
                            </li>
                            <li class="review-item-date">
                                <div>23.08.11</div>
                            </li>
                        </ul>
                        <div class="collapse collap" id="collapseExample">
                            <div class="card card-body">
                                <div class="card-content d-flex">
                                    <div class="card-left">
                                        <div>내</div>
                                        <div>&nbsp;</div>
                                        <div>용</div>
                                    </div>
                                    <div class="card-right">ìì ë³´ê³  ìì²´ë ì»¤ì¡ìµëë¤</div>
                                </div>
                                <div class="card--footer">
                                    <a href="main?act=reviewUpdateForm"><button type="button" class="btn btn-outline-danger btn-sm">리뷰 수정</button></a>
                                    <button type="button" class="btn btn-outline-secondary btn-sm">리뷰 삭제</button>
                                </div>
                            </div>
                         </div>
                    </div>
                    <div class="review-rightside-footer d-flex align-items-center">
                        <a href="main?act=reviewApplyForm"><button type="button" class="btn btn-outline-primary">리뷰 작성</button></a>
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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>