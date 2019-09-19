package com.spring.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownLoadHandler {

	@RequestMapping("")
	public String downLoad() {
		return "";
	}
}
