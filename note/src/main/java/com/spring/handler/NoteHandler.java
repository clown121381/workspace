package com.spring.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.bean.Admin;
import com.spring.bean.Message;
import com.spring.service.NoteBookService;

@Controller
public class NoteHandler {

	@Autowired
	NoteBookService noteBookService;
	@RequestMapping("/login")
	public String login(Admin admin,String mess) {
		if(admin.getUsername() != null && admin.getUserpass() != null) {
			Admin a = this.noteBookService.findUser(admin.getUsername());
			if(a != null) {
				if(admin.getUserpass().equals(a.getUserpass())) {
					admin.setUserid(a.getUserid());
					return "forward:homepage";
				}
				else {
					return "forward:/login.jsp";
				}
			}
		}
		return "forward:/login.jsp";
	}
	@RequestMapping("/homepage")
	public String homepage(ModelMap map,@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo) {
		PageHelper.startPage(pageNo, 3);
		List<Message> messages = this.noteBookService.findAllMess();
		PageInfo<Message> pages = new PageInfo<Message>(messages);
 		map.addAttribute("pageInfo", pages);
		return "main";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer mid) {
		this.noteBookService.deleteMess(mid);
		return "forward:homepage";
	}
	
	@RequestMapping("/updateMess")
	public String update(Message message,Model map) {

		if(message.getContent() != "" && message.getAuthor() != "" && message.getEmail() != "" && message.getTitle() != "") {
			if(message.getContent() != null && message.getContent().length() > 1000) {
				map.addAttribute("mess", "文字内容必须小于1000个字符");
				return "forward:findMess";	
			}else {
				this.noteBookService.updateMess(message);
				return "forward:homepage";
			}
		}else {
			map.addAttribute("mess", "姓名，标题，邮箱，内容，不能为空");
			return "forward:findMess";
		}
	}
	@RequestMapping("/findMess")
	public String findMess(Integer mid,Message message) {
		Message mess = this.noteBookService.findMess(mid);
		message.setMid(mess.getMid());
		message.setAuthor(mess.getAuthor());
		message.setContent(mess.getContent());
		message.setEmail(mess.getEmail());
		message.setAdd_date(mess.getAdd_date());
		message.setTitle(mess.getTitle());

		return "update";
	}
	@RequestMapping("/addMessage")
	public String addMessage(Message message,Model map) {
		if(message.getContent() != "" && message.getAuthor() != "" && message.getEmail() != "" && message.getTitle() != "") {
			if(message.getContent() != null && message.getContent().length() > 1000) {
				map.addAttribute("mess", "文字内容必须小于1000个字符");
				return "new";	
			}else {
				if(this.noteBookService.addMessage(message)) {
					return "forward:homepage";			
				}else {
					return "new";
				}
			}
		}else {
			map.addAttribute("mess", "姓名，标题，邮箱，内容，不能为空");
			return "new";
		}
	}
	@RequestMapping("/new")
	public String toNew(){
		return "new";
	}
	
	@RequestMapping("/findMessByMore")
	public ModelAndView findMessByMore(Message message) {
		List<Message> messages = this.noteBookService.findMessByMore(message);
		if(messages != null) {
			return new ModelAndView("findResult").addObject("messages", messages);
		}else {
			return new ModelAndView("findResult");
		}
	}
	@RequestMapping("/back")
	public String back() {
		return "forward:homepage";
	}
}
