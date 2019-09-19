package com.yang.dao;

class A{
	void foo(){
		System.out.println("A");
	}
}
class B extends A{
	@Override
	void foo(){
		System.out.println("B");
	}
}
class C extends A{
	@Override
	void foo(){
		System.out.println("C");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		a.foo();
		a1.foo();
		a2.foo();
	}
}

