package com.webMake.client.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	    //log.info("WebBoardWriteForm 호출 성공");
	    return "client/webboard/WebBoardWriteForm";
	}
	
	@PostMapping("/WebBoardInsert")
	public String WebBoardInsert(WebBoardVO wbvo, RedirectAttributes ras) {
		log.info("WebBoardInsert 호출 성공");
		
		int result = 0;
		String url="";
		
		result = wbService.wbInsert(wbvo);
		if(result == 1) {
			url = "/webboard/WebBoardList";
		} else {
			ras.addFlashAttribute("errorMsg", "입력에 문제가 있어 다시 진행해 주세요");
			url = "/webboard/WebBoardWriteForm";
		}
		return "redirect:"+url;
	}
	
	@PostMapping("/WebBoardDelete")
	public String WebBoardDelete(@ModelAttribute WebBoardVO wbvo, RedirectAttributes ras) {
		log.info("WebBoardDelete 호출 성공");
		
		int result = 0;
		String url = "";
		result = wbService.wbDelete(wbvo);
		
		if(result == 1) {
			url="/webboard/WebBoardList";
		} else {
			ras.addFlashAttribute("errorMsg", "삭제에 문제가 있어 다시 진행해 주세요.");
			url="/webboard/WebBoardDetail";
		}
		return "redirect:"+url;
	}

}