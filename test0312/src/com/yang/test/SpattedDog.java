package com.yang.test;

import java.util.Scanner;

public class SpattedDog extends Dog{
	String spotColor;
	@Override
	void init(){
		super.init();
		Scanner sc = new Scanner(System.in);
		spotColor = sc.next();
	}
	@Override
	void show(){
		System.out.println(breed + weight + color + spotColor);
	}
}
