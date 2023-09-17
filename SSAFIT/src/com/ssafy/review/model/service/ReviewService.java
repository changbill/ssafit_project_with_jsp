package com.ssafy.review.model.service;

import java.util.List;

import com.ssafy.review.model.dto.Review;

public interface ReviewService {
	List<Review> getList();

	void writeReview(Review review);

	Review getReview(int reviewId);

	void modifyReview(Review review);

	void removeReview(int reviewId);
}