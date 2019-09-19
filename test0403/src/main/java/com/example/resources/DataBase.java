package com.example.resources;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.entity.Teacher;

public class DataBase {
	
	private static List<Student> students = new ArrayList<Student>();
	private static List<Teacher> teachers = new ArrayList<Teacher>();
	static {
		int i = 0;
		for(;i < students.size();i ++) {
			students.add(new Student(i,"student_"+i,i % 3,i * 10.0));
		}
		int j = 0;
		for(;i < teachers.size() + students.size();i ++) {
			
			teachers.add(new Teacher(i,"teacher_"+i,"professional" + i % 5,i * 10));
		}
		
	}
	public static List<Student> getStudents() {
		return students;
	}
	public static List<Teacher> getTeachers() {
		return teachers;
	}
}
