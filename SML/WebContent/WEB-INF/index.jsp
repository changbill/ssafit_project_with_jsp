<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SSAFIT</title>
    <link rel="stylesheet" href="css/main.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<style>
#video-list{
	border-collapse : collapse;
}

#video-list td, #video-list th {
	padding : 10px;
	border-bottom :1px solid #CD5C5C
}

#video-list tr:hover{
	background-color: #F5F5F5
}
</style>
</head>
<body>
    <header style="display: flex; justify-content: space-between; background-color:rgb(60, 196, 254);">
        <h1 style="flex-grow: 1; padding: 1%;">SSAFIT</h1>
        <nav style="padding:1%;">
        
            <a href="main?act=index"><i class="bi bi-house-door-fill fs-1"></i></a>
            <a href="main?act=reviewList"><i class="bi bi-search fs-1"></i></a>
            <a href="main?act=registerForm"><i class="bi bi-person-circle fs-1"></i></a>
            <a href="main?act=loginForm"><i class="bi bi-box-arrow-in-right fs-1"></i></a>
            
        </nav>
        
        <hr />
        <!-- 
        ë°ì¤
        Home, search, user, ë¡ê·¸ìì ìì´ì½
        ë§í¬ ë¬ë¦° img
         -->
    </header>
    <main>
        <section>
            <article>
                <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img src="img/1.png" class="d-block w-100" alt="...">
                      </div>
                      <div class="carousel-item">
                        <img src="img/2.png" class="d-block w-100" alt="...">
                      </div>
                      <div class="carousel-item">
                        <img src="img/3.png" class="d-block w-100" alt="...">
                      </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Next</span>
                    </button>
                  </div>
                <div style="padding:2%"  class="input-group mb-3">
                    <input type="text" class="form-control" placeholder="검색하세요" aria-label="검색하세요" aria-describedby="button-addon2">
                    <button class="btn btn-outline-secondary" type="button" id="button-addon2">검색</button>
                </div>
                <div class="youtube">
                    <h3>최근 가장 많이 본 영상</h3>
                    <table id="video-list">
                   			<th>
                   				<td>조회수</td>
                   				<td>제목</td>
                   				<td>운동 부위</td>
                   				<td>채널명</td>
                   			</th>
                   		<c:forEach items="${list}" var="video">
							<tr>
								<td></td>
								<td>${video.viewCnt}</td>
								<td>${video.title}</td>
								<td>${video.part}</td>
								<td>${video.channelName}</td>
							</tr>
						</c:forEach>
					</table>
                   <!--  <div id="carouselExampleIndicators" class="carousel slide">
                        <div class="carousel-indicators">
                          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                        </div>
                        <div class="carousel-inner">
                          <div class="carousel-item active">
                            <div id="view-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                          </div>
                          <div class="carousel-item">
                            <div id="view1-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                          </div>
                          <div class="carousel-item">
                            <div id="view2-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                          </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                          <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                          <span class="carousel-control-next-icon" aria-hidden="true"></span>
                          <span class="visually-hidden">Next</span>
                        </button>
                    </div> -->

                    
                </div>
                <div class="youtube">
                    <h3>운동 부위 선택</h3>
                    <p class="d-inline-flex gap-1">
                        <a class="btn btn-primary" data-bs-toggle="collapse" href="#collapseExample1" role="button" aria-expanded="false" aria-controls="collapseExample">
                           	전신
                        </a>
                        <a class="btn btn-primary" data-bs-toggle="collapse" href="#collapseExample2" role="button" aria-expanded="false" aria-controls="collapseExample">
                        	상체
                        </a>
                        <a class="btn btn-primary" data-bs-toggle="collapse" href="#collapseExample3" role="button" aria-expanded="false" aria-controls="collapseExample">
							하체
                        </a>
                        <a class="btn btn-primary" data-bs-toggle="collapse" href="#collapseExample4" role="button" aria-expanded="false" aria-controls="collapseExample">
							복근
                        </a>
                    </p>
                    <div class="collapse multi-collapse" id="collapseExample1">
                        <div class="card card-body">
                            <div id="all-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                        </div>
                    </div>
                    <div class="collapse multi-collapse" id="collapseExample2">
                        <div class="card card-body">
                            <div id="up-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                        </div>
                    </div>
                    <div class="collapse multi-collapse" id="collapseExample3">
                        <div class="card card-body">
                            <div id="down-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                        </div>
                    </div>
                    <div class="collapse.show" id="collapseExample4">
                        <div class="card card-body">
                            <div id="belly-video-area">
                            </div>
                            <button class="btn" onclick="toggleAct(this)">찜하기</button>
                        </div>
                    </div>
                </div>
            </article>
        </section>
        <aside></aside>
    </main>
    <footer></footer>
    <script src="./main.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>