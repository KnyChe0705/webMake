package com.webMake.client.board.service;

import java.util.List;

import com.webMake.client.board.vo.WebBoardVO;

public interface WebBoardService {
	public List<WebBoardVO> wbList(WebBoardVO wbvo);
	public int wbListCnt(WebBoardVO wbvo);
	public WebBoardVO wbDetail(WebBoardVO wbvo);
	public int wbInsert(WebBoardVO wbvo);
	public int wbDelete(WebBoardVO wbvo);
}