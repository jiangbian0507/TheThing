package com.jiang.thething.service;

import org.springframework.stereotype.Service;

import com.jiang.thething.util.Utils;

@Service
public class HomeService {
	
	public String getHomePageData(String content) {
		return Utils.addString("", content,Utils.getUUID());
	}
}
