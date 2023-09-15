package com.ssafy.review.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.review.model.dto.Review;

public class ReviewDaoImpl implements ReviewDao {

    private static ReviewDao reviewdao = new ReviewDaoImpl();

    private List<Review> reviewlist = new ArrayList<>();

    private ReviewDaoImpl() {
        reviewlist.add(new Review(1, "백만스물하나", "조한빈", "2023/09/15"));
        reviewlist.add(new Review(2, "등맛있다", "이수민", "2023/09/15"));
    }

    public static ReviewDao GetInstance() {
        return reviewdao;
    }

    @Override
    public List<Review> selectAll() {
        return reviewlist;
    }

    @Override
    public void insertReview(Review review) {
        reviewlist.add(review);
    }

    @Override
    public Review selectOne(int reviewId) {
        for (int i = 0; i < reviewlist.size(); i++) {
            if (reviewlist.get(i).getReviewId() == reviewId)
                return reviewlist.get(i);
        }
        return null;
    }

    @Override
    public void updateReview(Review review) {
        for (int i = 0; i < reviewlist.size(); i++) {
            Review r = reviewlist.get(i);
            if (r.getReviewId() == review.getReviewId()) {
                r.setTitle(review.getTitle());
                r.setWriter(review.getWriter());
                return;
            }
        }

    }

    @Override
    public void deleteReview(int reviewId) {
        for (int i = 0; i < reviewlist.size(); i++) {
            Review r = reviewlist.get(i);
            if (r.getReviewId() == reviewId) {
                reviewlist.remove(i);
                return;
            }
        }

    }

}