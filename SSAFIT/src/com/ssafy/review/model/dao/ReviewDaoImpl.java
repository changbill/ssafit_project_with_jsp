package com.ssafy.review.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.review.model.dto.Review;

public class ReviewDaoImpl implements ReviewDao {

    private static ReviewDao reviewdao = new ReviewDaoImpl();
    
    // 여러 리뷰 내용을 담아 관리할 리뷰 리스트
    private List<Review> reviewlist = new ArrayList<>();

    private ReviewDaoImpl() {
        reviewlist.add(new Review("백만스물하나", "조한빈", "2023/09/15"));
        reviewlist.add(new Review("등맛있다", "이수민", "2023/09/15"));
        reviewlist.add(new Review("몸짱 될래요", "이창헌", "2023/09/15"));
        reviewlist.add(new Review("너무 빡세요", "이예원", "2023/09/15"));
        reviewlist.add(new Review("준철쌤 최고", "김동학", "2023/09/15"));
        reviewlist.add(new Review("매일 들어와요", "조민준", "2023/09/15"));
        reviewlist.add(new Review("힘들지만 재밌어요", "천우진", "2023/09/15"));
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