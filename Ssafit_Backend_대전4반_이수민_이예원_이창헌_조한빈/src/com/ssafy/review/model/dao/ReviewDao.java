package com.ssafy.review.model.dao;

import java.util.List;

import com.ssafy.review.model.dto.Review;

public interface ReviewDao {
    List<Review> selectAll();
    
    void insertReview(Review review);
    
    Review selectOne(int reviewId);
    
    void updateReview(Review review);
    
    void deleteReview(int reviewId);
    
}