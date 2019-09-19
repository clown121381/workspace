package com.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LiFangTi.setDemo();
		LiFangTi.needv();
	}
}
class LiFangTi {
	static int x;
	static int y;
	static int z;
	
	static void setDemo() {
		Scanner sc= new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
	}
	
	static void needv() {
		System.out.println(x*y*z);
	}
	
}
