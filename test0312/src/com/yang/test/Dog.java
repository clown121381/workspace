package com.yang.test;

import java.util.Scanner;

public class Dog {
	String breed;
	int weight;
	String color;
	void init(){
		Scanner sc= new Scanner(System.in);
		breed = sc.next();
		weight = sc.nextInt();
		color = sc.next();
	}
	void show(){
		System.out.println(breed + weight + color);
	}
}
