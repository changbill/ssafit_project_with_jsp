package com.ssafy.video.model.service;

import java.util.List;

import com.ssafy.video.model.dao.MainDao;
import com.ssafy.video.model.dao.MainDaoImpl;
import com.ssafy.video.model.dto.Video;

public class VideoServiceImpl implements VideoService{

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
//		dao.updateBoard(video);
		return null;
	}

	@Override
	public void modifyBoard(Video video) {
		dao.updateBoard(video);
	}

	@Override
	public void removeBoard(String id) {
		dao.deleteBoard(id);
	}

}