package com.example.service.impl;

import com.example.entity.Person;
import com.example.entity.Teacher;
import com.example.resources.DataBase;
import com.example.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

	@Override
	public Person getPersonById(int id) {
		for(Person p : DataBase.getTeachers()) {
			if(id == p.getId()) {
				return p;
			}
		}
		return null;
	}

	@Override
	public int getTeacherPublishCounts(String professional) {
		int count = 0;
		for(Teacher t : DataBase.getTeachers()) {
			if(professional.equals(t.getProfessional())) {
				count += t.getPublishCount();
			}
		}
		return count;
	}

}
