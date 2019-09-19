package test0627;

import java.util.concurrent.atomic.AtomicReference;

public class TestAtomic {
	public static void main(String[] args) {
		AtomicReference<Student> stuRe = new AtomicReference<Student>();
		stuRe.set(new Student(1001,"xiaoming"));
		
	}
}


class TestThread1 implements Runnable{

	@Override
	public void run() {
		
	}
}

class Student{
	Integer id;
	String name;
	
	public Student(Integer id,String name){
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}