package com.example.service;

import com.example.entity.Student;
import com.example.resource.DatabaseUtils;
/**
 * 在com.example.service下，创建StudentService类，用于执行针对Student的相关操作
 * 在类中提供一个公共静态方法，通过DatabaseUtils类中的方法获取数组对象，遍历打印显示数组中，全部学生的姓名与成绩
 * 理解并掌握foreach遍历循环
 * 在Test类中主函数，调用以上方法，验证
 * 在StudentService类中，提供一个公共静态方法，实现输入学号，遍历数组中的学生，查询返回该生
 * 方法的返回类型？参数类型？用那种遍历循环更合适？
 * 找到指定学号学生后，检索流程是否应继续？不存在则应返回空引用null
 * 在StudentService，提供一个公共静态方法，计算指定班级编号班级的，成绩平均分
 * 思路：不知道数组中指定班级编号的学生有多少，计算平均成绩需要知道班级人数，需要设计一个计数器，
 * 在循环时当找到匹配学生时，累加，从而及时出学生个数，同时累加学生成绩，最后用总成绩除以总人数，计算出班级的平均分
 * 调用时，传入的班级编号不存在怎么办？
 * @author 爱不会绝迹
 *
 */
public class StudentService {
	public static Student getStudent(Integer id){
		Student[] students = DatabaseUtils.getStudents();
		
		return students[id];
	}
	public static void getAllStudents(){
		Student[] students = DatabaseUtils.getStudents();
		for(Student s : students){
			System.out.println(s);
		}
	}
	
	public static int getAverageGrade(Integer classNumber){
		Student[] students = DatabaseUtils.getStudents();
		Double[] grades = new Double[students.length];
		int i = 0;
		for(Student s : students){
			if(s.getClassNum() == classNumber){
				grades[i++] = s.getGrade(); 
			}
		}	
		int sum = 0;
		if(i != 0) {
			for(int j = 0;j < i;j ++){
				sum += grades[j];
			}
			System.out.println(sum);
			return sum/i;
		}
		else {
			return 0;
		}
	}
}
