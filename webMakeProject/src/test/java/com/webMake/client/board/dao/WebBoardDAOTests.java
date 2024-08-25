package com.webMake.client.board.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webMake.client.board.vo.WebBoardVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class WebBoardDAOTests {
	@Setter(onMethod_ = @Autowired)
	private WebBoardDAO wbDao;
	
	/*@Test
	public void testWebBoardList() {
		WebBoardVO wbvo = null;
		List<WebBoardVO> list = wbDao.wbList(wbvo);
		for(WebBoardVO vo : list) {
			log.info(vo.toString());
		}
	}*/
	
	/*@Test
	public void testWebBoardReadcntUpdate() {
		WebBoardVO wbvo = new WebBoardVO();
		wbvo.setWbNo(1);
		
		int count = wbDao.wbReadcntUpdate(wbvo);
		log.info("수정된 행의 수: " + count);
	}
	
	@Test
	public void testWebBoardDetail() {
		WebBoardVO wbvo = new WebBoardVO();
		wbvo.setWbNo(1);
		
		WebBoardVO webboard = wbDao.wbDetail(wbvo);
		log.info(webboard.toString());
	}*/
	
	
	/*@Test
	public void testWebBoardInsert() {
		WebBoardVO webboard = new WebBoardVO();
		webboard.setWbTitle("테스트 점검기간");
		webboard.setWbName("게시판 담당자");
		webboard.setWbContent("테스트기간이 한달 연장되었습니다.");
		
		int count = wbDao.wbInsert(webboard);
		log.info("입력된 행의 수: " + count);
	}*/
	
	/*
	@Test
	public void testWebBoardDelete() {
		WebBoardVO wbvo = new WebBoardVO();
		wbvo.setWbNo(22);
		
		log.info("삭제된 행의 수: "+wbDao.wbDelete(wbvo));
	}*/
}