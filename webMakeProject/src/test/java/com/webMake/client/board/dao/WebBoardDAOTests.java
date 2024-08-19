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
	
	@Test
	public void testWebBoardList() {
		WebBoardVO wbvo = null;
		List<WebBoardVO> list = wbDao.wbList(wbvo);
		for(WebBoardVO vo : list) {
			log.info(vo.toString());
		}
	}
}