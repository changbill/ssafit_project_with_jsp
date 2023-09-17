package com.ssafy.video.model.service;

import java.util.List;

import com.ssafy.video.model.dao.MainDao;
import com.ssafy.video.model.dao.MainDaoImpl;
import com.ssafy.video.model.dto.Video;

public class VideoServiceImpl implements VideoService {

	private static VideoService service = new VideoServiceImpl();

	private MainDao dao = MainDaoImpl.GetInstance();

	private VideoServiceImpl() {

	}

	public static VideoService GetInstance() {
		return service;
	}

	@Override
	public List<Video> getList() {
		return dao.selectAll();
	}

	@Override
	public void writeBoard(Video video) {
		dao.insertBoard(video);
	}

	@Override
	public Video getBoard(String id) {
		dao.updateViewCnt(id);
		return dao.selectOne(id);
	}

	@Override
	public void modifyBoard(Video video) {
		dao.updateBoard(video);
	}

	@Override
	public void removeBoard(String id) {
		dao.deleteBoard(id);
	}

	@Override
	public List<Video> fullBodyList() {
		return dao.selectPart("전신");
	}

	@Override
	public List<Video> upperBodyList() {
		return dao.selectPart("상체");
	}

	@Override
	public List<Video> lowerBodyList() {
		return dao.selectPart("하체");
	}

	@Override
	public List<Video> absList() {
		return dao.selectPart("복근");
	}

}