package com.ssafy.video.model.dao;

import java.util.List;

import com.ssafy.video.model.dto.Video;


public interface MainDao {

        // 게시글 전체 조회
        List<Video> selectAll();
        
        // 게시글 등록
        void insertBoard(Video video);

        // 게시글 상세 조회
        Video selectOne(String id);

        // 게시글 수정
        void updateBoard(Video video);

        // 게시글 삭제
        void deleteBoard(String id);

        //조회수 증가
        void updateViewCnt(String id);
}