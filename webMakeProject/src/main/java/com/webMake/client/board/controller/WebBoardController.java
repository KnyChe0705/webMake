package com.webMake.client.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webMake.client.board.service.WebBoardService;
import com.webMake.client.board.vo.WebBoardVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/webboard/*")
@Slf4j
public class WebBoardController {
	@Setter(onMethod_ = @Autowired)
	private WebBoardService wbService;
	
	@GetMapping("/WebBoardList")
	public String WebBoardList(@ModelAttribute WebBoardVO wbvo, Model model) {
		//log.info("WebBoardList 호출 성공");
		
		List<WebBoardVO> WebBoardList = wbService.wbList(wbvo);
		model.addAttribute("WebBoardList", WebBoardList);
		
		return "client/webboard/WebBoardList";
	}
	
	@GetMapping("/WebBoardDetail")
	public String WebBoardDetail(@ModelAttribute WebBoardVO wbvo, Model model) {
		//log.info("WebBoardDetail 호출 성공");
		//log.info("wbvo = " + wbvo);
		
		WebBoardVO detail = wbService.wbDetail(wbvo);
		model.addAttribute("detail", detail);
		
		return "client/webboard/WebBoardDetail";
	}
	
	@GetMapping("/WebBoardWriteForm")
	public String WebBoardWriteForm() {
	    log.info("WebBoardWriteForm 호출 성공");
	    return "client/webboard/WebBoardWriteForm";
	}

}