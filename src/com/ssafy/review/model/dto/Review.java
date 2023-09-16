package com.ssafy.review.model.dto;

import java.util.Date;

public class Review {

//    private String movieId; // 어떤 영상에 대한 리뷰인지 식별하기 위한 id
    private int reviewId; // 헤당 영상에 대해서 몇번째 리뷰인지,,,
    private String title; // 리뷰 제목
    private String writer; // 리뷰 작성자
    private String regDate; // 리뷰 작성일

    public Review() {
    }

    public Review( int reviewId, String title, String writer, String regDate) {
        super();
//        this.movieId = movieId;
        this.reviewId = reviewId;
        this.title = title;
        this.writer = writer;
        this.regDate = new Date().toString();
    }

//    public String getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(String movieId) {
//        this.movieId = movieId;
//    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Review [reviewId=" + reviewId + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate
                + "]";
    }

    

}