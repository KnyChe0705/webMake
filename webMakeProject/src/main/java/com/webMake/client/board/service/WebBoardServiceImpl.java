package com.webMake.client.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webMake.client.board.dao.WebBoardDAO;
import com.webMake.client.board.vo.WebBoardVO;

import lombok.Setter;

@Service
public class WebBoardServiceImpl implements WebBoardService {
	@Setter(onMethod_ = @Autowired)
	private WebBoardDAO wbDao;
	
	
	@Override
	public List<WebBoardVO> wbList(WebBoardVO wbvo){
		List<WebBoardVO> list = null;
		list=wbDao.wbList(wbvo);
		return list;
	}
}
