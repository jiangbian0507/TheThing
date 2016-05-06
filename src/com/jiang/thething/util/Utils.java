package com.jiang.thething.util;

import java.util.UUID;

public class Utils {
	
	/**
	 * 获得任意32位uuid(去除-)
	 * @return
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		return uuid;
	}
	
	/**
	 * 多个字符串相加
	 * @param seperator 分隔符
	 * @param s 多个字符串
	 * @return
	 */
	public static String addString(String seperator, String ... s) {
		StringBuilder sb = null;
		for(String temp : s) {
			if(sb == null) {
				sb = new StringBuilder(temp);
			} else {
				sb.append(seperator);
				sb.append(temp);
			}
		}
		return sb.toString();
	}
	
}
