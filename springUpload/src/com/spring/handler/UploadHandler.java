package com.spring.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadHandler {

	@RequestMapping(value={"/upload"})
	public String Upload() {
		return "success";
	}
}