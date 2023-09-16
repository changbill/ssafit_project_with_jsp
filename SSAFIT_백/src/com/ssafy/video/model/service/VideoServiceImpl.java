package com.ssafy.video.model.service;

import java.util.ArrayList;
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
		List<Video> fullBody = new ArrayList<>();
		fullBody.add(dao.selectOne("gMaB-fG4u4g"));
		fullBody.add(dao.selectOne("swRNeYw1JkY"));
		return fullBody;
	}

	@Override
	public List<Video> upperBodyList() {
		List<Video> upperBody = new ArrayList<>();
		upperBody.add(dao.selectOne("54tTYO-vU2E"));
		upperBody.add(dao.selectOne("QqqZH3j_vH0"));
		return upperBody;
	}

	@Override
	public List<Video> lowerBodyList() {
		List<Video> lowerBody = new ArrayList<>();
		lowerBody.add(dao.selectOne("tzN6ypk6Sps"));
		lowerBody.add(dao.selectOne("u5OgcZdNbMo"));
		return lowerBody;
	}

	@Override
	public List<Video> absList() {
		List<Video> abs = new ArrayList<>();
		abs.add(dao.selectOne("PjGcOP-TQPE"));
		abs.add(dao.selectOne("7TLk7pscICk"));
		return abs;
	}

}