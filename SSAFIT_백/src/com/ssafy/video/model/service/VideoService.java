package com.ssafy.video.model.service;

import java.util.List;

import com.ssafy.video.model.dto.Video;

public interface VideoService {
    // 게시글 전체 조회
        List<Video> getList();

        // 게시글 등록
        void writeBoard(Video video);

        // 게시글 상세 조회
        Video getBoard(String id);

        // 게시글 수정
        void modifyBoard(Video video);

        // 게시글 삭제
        void removeBoard(String id);

		List<Video> absList();

		List<Video> lowerBodyList();

		List<Video> upperBodyList();

		List<Video> fullBodyList();
}