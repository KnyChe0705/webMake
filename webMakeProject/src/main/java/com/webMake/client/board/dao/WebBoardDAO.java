package com.webMake.client.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.webMake.client.board.vo.WebBoardVO;

@Mapper
public interface WebBoardDAO {
	public List<WebBoardVO> wbList(WebBoardVO wbvo);
	public int wbListCnt(WebBoardVO wbvo);
	public WebBoardVO wbDetail(WebBoardVO wbvo);
	public int wbReadcntUpdate(WebBoardVO wbvo);
	public int wbInsert(WebBoardVO wbvo);
	public List<WebBoardVO> wbListExcel(WebBoardVO wbvo);
}