package com.example.test;

import java.util.List;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.entity.Teacher;
import com.example.resources.DataBase;
import com.example.service.PersonService;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import com.example.service.impl.PersonServiceImpl;
import com.example.service.impl.StudentServiceImpl;
import com.example.service.impl.TeacherServiceImpl;

public class Test {
	public static StudentService studentService = new StudentServiceImpl();
	public static TeacherService teacherService = new TeacherServiceImpl();
	public static PersonService personService = new PersonServiceImpl();
	
	public static void main(String[] args) {
		List<Student> students = DataBase.getStudents();
		List<Teacher> teachers = DataBase.getTeachers();
		for(Person s : students) {
			System.out.println(s);
		}
		for(Person t : teachers) {
			System.out.println(t);
		}
		System.out.println(studentService.getAverageGrade(2));	
		System.out.println(teacherService.getTeacherPublishCounts("professional0"));
		System.out.println(personService.getPersonById(20));
	}
}
