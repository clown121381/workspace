package com.example.service.impl;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.resources.DataBase;
import com.example.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public Person getPersonById(int id) {
		for(Person p : DataBase.getStudents()){
			if(id == p.getId()) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Double getAverageGrade(int classNumber) {
		Double sum = 0.0;
		int n = 0;
		for(Student s : DataBase.getStudents()){
			if(classNumber == s.getClassNumber()){
				sum += s.getGrade();
			}
			n ++;
		}
		
		return sum/n;
	}

}
