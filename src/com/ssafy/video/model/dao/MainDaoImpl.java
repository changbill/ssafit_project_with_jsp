package com.ssafy.video.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.video.model.dto.Video;

public class MainDaoImpl implements MainDao{
    
	// 8개 영상에 대한 리뷰 리스트
	
	// 영상 리스트
	private List<Video> list;
    private static MainDaoImpl instance;
    private MainDaoImpl() {
        list = new ArrayList<Video>();
        list.add(new Video("gMaB-fG4u4g", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "전신", "ThankyouBUBU","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gMaB-fG4u4g?si=yKax_LGVKc04Rfss\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("swRNeYw1JkY", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", "전신", "ThankyouBUBU","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/swRNeYw1JkY?si=5-Kgv3GsSWdveGWW\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("54tTYO-vU2E", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", "상체", "ThankyouBUBU","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/54tTYO-vU2E?si=cnhmQxhh3RlaNzY2\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("QqqZH3j_vH0", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]", "상체","ThankyouBUBU","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/QqqZH3j_vH0?si=_9Epda1zpcWdZoNT\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("tzN6ypk6Sps", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]", "하체", "김강민","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/tzN6ypk6Sps?si=g-rJKL3GI9Qly1qc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("u5OgcZdNbMo",  "저는 하체 식주의자 입니다", "하체","짐종국","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/u5OgcZdNbMo?si=CFaJ9F-fmxj9uCNZ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("PjGcOP-TQPE", "11자복근 복부 최고의 운동 [복근 핵매운맛]", "복부", "ThankyouBUBU","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/PjGcOP-TQPE?si=eaBnELtjkKzt-udG\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        list.add(new Video("7TLk7pscICk", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "복부", "소미핏","<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/7TLk7pscICk?si=TW1_ucgOGICZ_G6_\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"));
        
    }
    
    public static MainDao GetInstance() {
        if(instance == null) instance = new MainDaoImpl();
        return instance;
    }
    
    @Override
    public List<Video> selectAll(){
        return list;
        
    }
    
    @Override
    public void insertBoard(Video video){
        list.add(video);
    }
    
    @Override
    public Video selectOne(String id) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getId().equals(id))
                return list.get(i);
        }
        return null;
    }
    
    @Override
    public void updateBoard(Video video) {
        for(int i=0;i<list.size();i++) {
            Video v = list.get(i);
            if(v.getId().equals(video.getId())) {
                v.setTitle(video.getTitle());
                v.setPart(video.getPart());
                return;
            }
        }
    }


    
    @Override
    public void deleteBoard(String id) {
        for(int i=0;i<list.size();i++) {
            Video v = list.get(i);
            if(v.getId().equals(id)) {
                list.remove(i);
                return;
            }
        }
    }
    
    @Override
    public void updateViewCnt(String id) {
        for(int i=0;i<list.size();i++) {
            Video v = list.get(i);
            if(v.getId() == id) {
                int viewCnt = v.getViewCnt();
                v.setViewCnt(viewCnt+1);
                break;
            }
        }
    }

    
    
    
    
}