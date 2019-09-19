package com.spring.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;
import com.spring.service.IService;

@Controller
public class HandlerImpl implements IHandler{

	@Autowired
	private IService iService;
	
	@Override
	@RequestMapping(value={"/addStudent"})
	@Transactional
	public String addStudent(Student student) {

		if(this.iService.insertStudent(student)) {
			return "success";			
		}else {
			return "error";
		}
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value={"/deleteStudent"})
	public String deleteStudent(Integer s_id) {
		if(this.iService.deleteStudent(s_id)) {
			return "success";			
		}else {
			return "error";
		}
	}

	@Override
	@RequestMapping(value={"/findById"})
	public String findByid(Student student,Integer s_id) {
		Student s = this.iService.findById(s_id);
		
		if(s != null) {
			student.setS_id(s.getS_id());
			student.setS_name(s.getS_name());
			student.setS_age(s.getS_age());
			student.setS_sex(s.getS_sex());
			return "findResult";			
		}else {
			return "error";
		}
	}

	@RequestMapping("/findAllStudent")
	public ModelAndView findAll() {
		return new ModelAndView("findAll").addObject("students", this.iService.findAll());
	}

}
