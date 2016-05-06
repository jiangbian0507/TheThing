package com.jiang.thething.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiang.thething.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping("index")
	public String toHomePage(HttpServletRequest request, String content) {
		request.setAttribute("content", homeService.getHomePageData(content));
		return "index";
	}
}
