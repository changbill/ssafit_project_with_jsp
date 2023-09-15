package com.ssafy.review.model.service;

import java.util.List;
import com.ssafy.review.model.dao.ReviewDao;
import com.ssafy.review.model.dao.ReviewDaoImpl;
import com.ssafy.review.model.dto.Review;

public class ReviewServiceImpl implements ReviewService {
    private static ReviewService service2 = new ReviewServiceImpl();

    private ReviewDao reviewdao = ReviewDaoImpl.GetInstance();

    private ReviewServiceImpl() {
    }
    
    public static ReviewService GetInstance() {
        return service2;
    }

    @Override
    public List<Review> getList() {
        return reviewdao.selectAll();
    }

    @Override
    public void writeReview(Review review) {
        reviewdao.insertReview(review);
    }

    @Override
    public Review getReview(int reviewId) {
        return reviewdao.selectOne(reviewId);
    }

    @Override
    public void modifyReview(Review review) {
        reviewdao.updateReview(review);
    }

    @Override
    public void removeReview(int reviewId) {
        reviewdao.deleteReview(reviewId);
    }

}