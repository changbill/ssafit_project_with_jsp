package com.ssafy.video.model.dto;

public class Video {
    private static int no = 1; //클래스 변수
    private String id;
    private String title;
    private String part;
    private String channelName;
    private String url;
    private int viewCnt;

    public Video() {

    }

    public Video(String id, String title, String part, String channelName, String url) {
        super();
        this.id = id;
        this.title = title;
        this.part = part;
        this.channelName = channelName;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    @Override
    public String toString() {
        return "Video [id=" + id + ", title=" + title + ", part=" + part + ", channelName=" + channelName + ", url="
                + url + ", viewCnt=" + viewCnt + "]";
    }
    
    

    
    
    
}