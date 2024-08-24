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
	
	@Override
	public int wbListCnt(WebBoardVO wbvo) {
		return wbDao.wbListCnt(wbvo);
	}
	
	@Override
	public WebBoardVO wbDetail(WebBoardVO wbvo) {
	    wbDao.wbReadcntUpdate(wbvo);

	    WebBoardVO detail = wbDao.wbDetail(wbvo);
	    if(detail!=null) {
	    	detail.setWbContent(detail.getWbContent().replaceAll("\n", "<br />"));
	    }
	    return detail;
	}
	
	@Override
	public int wbInsert(WebBoardVO wbvo) {
		int result = 0;
		
		wbvo.setWbNo(0);
		if(wbvo.getWbNo() == 0) {
			return result;
		}
		result = wbDao.wbInsert(wbvo);
		return result;
	}
}
