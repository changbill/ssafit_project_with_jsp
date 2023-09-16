package com.ssafy.video.controller;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.review.model.service.ReviewService;
import com.ssafy.review.model.service.ReviewServiceImpl;
import com.ssafy.user.model.service.UserService;
import com.ssafy.user.model.service.UserServiceImpl;
import com.ssafy.video.model.dto.Video;
import com.ssafy.video.model.service.VideoService;
import com.ssafy.video.model.service.VideoServiceImpl;

@WebServlet("/main")
public class MainController extends HttpServlet {

	// 의존성 주입
	private VideoService service = VideoServiceImpl.GetInstance();
	private UserService userService = UserServiceImpl.getInstance();
	private ReviewService service2 = ReviewServiceImpl.GetInstance();

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getMethod().equals("POST")) {
			request.setCharacterEncoding("UTF-8");
		}

		String act = request.getParameter("act");
		switch (act) {
		case ("index"):
			doIndex(request, response);
			break;
		case ("reviewList"):
			doReviewList(request, response);
			break;
		case ("registerForm"):
			doRegisterForm(request, response);
			break;
		case ("loginForm"):
			doLoginForm(request, response);
			break;
		case ("reviewUpdateForm"):
			doReviewUpdateForm(request, response);
			break;
		case ("reviewApplyForm"):
			doReviewApplyForm(request, response);
			break;
		case ("detail"):
			doDetail(request, response);
			break;
		case("regist"):
			doRegist(request,response);
			break;
		case("deleteReview"):
			doRemove(request,response);
			break;
		}
	}
	
	private void doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		service2.removeReview(id);
		response.sendRedirect("review?act=list");
	}
	
	// 영상 상세 화면으로 이동
	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 해당 영상 id 받아오기
		String id = request.getParameter("id");

		// 해당 영상 조회수 1 증가시키고 request에 담아주기
		service.getBoard(id).setViewCnt(service.getBoard(id).getViewCnt()+1);
		request.setAttribute("video", service.getBoard(id));

		// 영상 리스트 재정렬 후 세션에 담아주기
		List<Video> tmp = service.getList();
		tmp.sort(new Comparator<Video>() {
			@Override
			public int compare(Video o1, Video o2) {
				return o2.getViewCnt() - o1.getViewCnt();
			}
		});
		HttpSession session = request.getSession();
		session.setAttribute("list", tmp);
		
//		System.out.println(service.getBoard(id));
		request.getRequestDispatcher("/WEB-INF/detail.jsp").forward(request, response);;
	}
	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.sendRedirect("/WEB-INF/loginForm.jsp");
	}

	private void doReviewApplyForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/reviewApplyForm.jsp").forward(request, response);
	}

	private void doReviewUpdateForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		request.getRequestDispatcher("/WEB-INF/reviewUpdateForm.jsp").forward(request, response);
	}

	private void doLoginForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/registerForm.jsp").forward(request, response);
	}

	private void doRegisterForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/loginForm.jsp").forward(request, response);
	}

	private void doReviewList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 리뷰 리스트 담아서 요청 보내기
		request.setAttribute("reviewList", service2.getList());
		request.getRequestDispatcher("/WEB-INF/reviewList.jsp").forward(request, response);
	}

	private void doIndex(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 영상 리스트를 조회수 순으로 정렬시킨 후 전달시키기
		List<Video> tmp = service.getList();
		tmp.sort(new Comparator<Video>() {
			@Override
			public int compare(Video o1, Video o2) {
				return o2.getViewCnt() - o1.getViewCnt();
			}
		});
		
		// 세션에 조회수 순으로 정렬된 리스트 담아주기
		HttpSession session = request.getSession();
		session.setAttribute("list", tmp);
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}
}
