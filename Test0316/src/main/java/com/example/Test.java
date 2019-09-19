package com.example;

import com.example.service.StudentService;
/**
 * 
 * 在com.example下，创建包含main()主函数的Test类
 * 在Test中声明一个私有静态方法，在方法中创建1个包含5个元素的整型数组，添加考试成绩，将其个低于60分的成绩打印显示。
 * 成绩(可自定义)：94,64,55,59,88
 * 如何初始化一个整型数组？使用基本for循环，以及foreach循环分别实现
 * @author 爱不会绝迹
 *
 */
public class Test {
	
	private static void foo(){
		int[] grade = {38,90,45,78,65};
		for(int i : grade){
			if(i < 60){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(StudentService.getStudent(1));
		StudentService.getAllStudents();
		System.out.println(StudentService.getAverageGrade(0));
	}
}
