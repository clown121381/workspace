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
 * 方法引用：若lambda 体中的内容已经实现了的话，我们可以使用方法引用
 * 			（可以理解为方法引用时lambda表达式的另外一种表现形式）
 * 主要有三种语法格式：
 * 
 * 对象：：实例方法名
 * 
 * 1、参数列表和返回值类型必须一致才可以使用
 * 
 * 类：：静态方法名
 * 
 * 类::实例方法名
 * 2、若Lambda参数列表中的第一个参数是实例方法的调用着，第二个是实例方法的是参数时可以使用该方法
 * 
 * 
 * 
 * 
 * 构造器引用：
 * 
 * 	ClassName::new
 * 
 * 数组引用：
 * 	type::new
 * 
 * 	例如： String[]::new;
 * @author 爱不会绝迹
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














