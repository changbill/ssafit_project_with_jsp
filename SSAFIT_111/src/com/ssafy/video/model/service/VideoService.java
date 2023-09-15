package com.ssafy.video.model.service;

import java.util.List;

import com.ssafy.video.model.dto.Video;

public interface VideoService {
    // 게시글 전체 조회
        List<Video> getList();
        
        
        // 전신운동 영상
        List<Video> fullBodyList();
        
        // 상체운동 영상
        List<Video> upperBodyList();
        
        // 하체운동 영상
        List<Video> lowerBodyList();
        
        // 복근운동 영상
        List<Video> absList();

        // 게시글 등록
        void writeBoard(Video video);

        // 게시글 상세 조회
        Video getBoard(String id);

        // 게시글 수정
        void modifyBoard(Video video);

        // 게시글 삭제
        void removeBoard(String id);
}