package javaSE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


/**
 * java总结
 * @author 爱不会绝迹
 *
 */
public class java {
	//public 方法为经方法可以类名.方法调用该方法
	//static 关键字修饰
	public static void test() {
		int a = 10;//int 为变量的声明，10为变量的赋值
		Student stu = new Student();//new关键字用于创建对象stu对象为Student类的一个实例化
		stu.setAge(18);
		stu.setName("yang");
		stu.setId("2017214213");
		System.out.println(a + stu.getAge());
		
		try {
			int b = 10/0;//可能出现异常的代码
		} catch (Exception e) {
			//处理异常
			e.printStackTrace();
		}
	}
	public static void listTest() {//集合
		List<String> li = new ArrayList<String>();
		Set<String> s = new TreeSet<String>();
		Map<Integer,String> map = new HashMap<Integer,String>();
	}
	public static void main(String[] args) {
		test();
	}
}
