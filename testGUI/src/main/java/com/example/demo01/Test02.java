package com.example.demo01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if(s.contains(".") && s.contains("/")) {
				String s1 = s.substring(s.lastIndexOf("/")+1, s.lastIndexOf("."));
				String s2 = s.substring(s.lastIndexOf(".")+1);
				System.out.println(s1);		
				System.out.println(s2);
			}else {
				System.out.println("您输入的路径名格式不正确！！！");
			}
		}
	}
}
