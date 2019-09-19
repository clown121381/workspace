package com.spring.handler;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class LoadHandler {
	
	@RequestMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file) {
		String path = "D:/BaiduNetdiskDownload/tomcat";
		String filename = file.getOriginalFilename();
		File filepath = new File(path,filename);
		
		if(!filepath.getParentFile().exists()) {
			filepath.getParentFile().mkdirs();
		}
		
		try {
			file.transferTo(filepath);
			return "success";
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error";
	}
}
