package TestLambda;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

import TestLambda.entity.Employee;

/**
 * 
 * �������ã���lambda ���е������Ѿ�ʵ���˵Ļ������ǿ���ʹ�÷�������
 * 			���������Ϊ��������ʱlambda���ʽ������һ�ֱ�����ʽ��
 * ��Ҫ�������﷨��ʽ��
 * 
 * ���󣺣�ʵ��������
 * 
 * 1�������б�ͷ���ֵ���ͱ���һ�²ſ���ʹ��
 * 
 * �ࣺ����̬������
 * 
 * ��::ʵ��������
 * 2����Lambda�����б��еĵ�һ��������ʵ�������ĵ����ţ��ڶ�����ʵ���������ǲ���ʱ����ʹ�ø÷���
 * 
 * 
 * 
 * 
 * ���������ã�
 * 
 * 	ClassName::new
 * 
 * �������ã�
 * 	type::new
 * 
 * 	���磺 String[]::new;
 * @author ���������
 *
 */
public class Test04 {

	@Test
	public void Test1(){
		Consumer<String> con = (x)->System.out.println(x);
		
		Consumer<String> con1 = System.out::print;
		con.accept("hello");
		con1.accept("hello");
	}
	
	
	@Test
	public void test2(){
		Employee emp = new Employee("mihao",122,121.00);
		Supplier<String> sup = emp::getName;
		System.out.println(sup.get());
		
	}
	
	@Test
	public void comparator(){
		Comparator<Integer> com = Integer::compare;
		com.compare(1, 2);
	}
	 
	public void test4(){
		
		BiPredicate<String,String> bp = String::equals;
	}
	
	
	public void test5(){
		Supplier<Employee> sup = Employee::new;
		sup.get();
	}
	public void test6(){
		Function<Integer,String[]> fun = String[]::new;
		fun.apply(10);
	}
}














