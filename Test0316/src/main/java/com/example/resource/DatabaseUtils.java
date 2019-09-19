package com.example.resource;

import com.example.entity.Student;
/**
 * 在com.example.resource下，创建DatabaseUtils工具类，通过静态方法对外提供服务
 * 在类中创建一个私有静态学生数组变量，通过一个私有静态方法初始化数组，再创建一个公共静态方法，
 * 外界通过该方法获取封装的学生数组对象。
 * 如何创建学生类型的数组？如何初始化并赋值？如何创建学生数组类型的静态变量，并提供对外使用的方法？
 * 在数组中，模拟添加2-5个元素，即可。理解基于引用类型数组的引用传递
 * @author 爱不会绝迹
 *
 */
public class DatabaseUtils {
	private static Student[] students;
	static {
		createStudent();
	}
	public static void createStudent(){
		students = new Student[5];
		initStudent();
	}
	private static void initStudent(){
		for(int i = 0;i < students.length;i ++){
			students[i] = new Student(i,"zhangsan_"+i,i * 10.0,i%3); 
		}
	}
	public static Student[] getStudents(){
		return students;
	}
}
