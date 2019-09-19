package TestLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * 
 * java8�Ĵ���ĺ���ʽ�ӿ�
 * 
 * Consumer<T> :�����ͽӿ�
 * 		void accept(T t);
 * Supplier<T> :�����ͽӿ�
 * 		T get();
 * Function<T,R>:�����ͽӿ�
 * 		R apply(T t);
 * Predicate<T> :�����ͽӿ�
 * 		boolean	test(T t);
 * 
 * 
 * 
 * 
 * @author ���������
 *
 */
public class Test03 {
	
	
	@Test
	public void test1(){
		happy(1000,m->System.out.println("m:"+m));
	}
	
	public void happy(double money,Consumer<Double> con){
		con.accept(money);
	}
	
	
	@Test
	public void test2(){
		List<Integer> li = getNumber(10,()->(int)Math.random()*100);
		System.out.println(li);
	
	}

	private List<Integer> getNumber(int num,Supplier<Integer> sup) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < num;i ++){
			list.add(sup.get());
		}
		return list;
	}
	
	
	@Test
	public void test3(){
		String s = strHandler("hello world",(str)->str.trim().toUpperCase());
		System.out.println(s);
	}
	
	public String strHandler(String str,Function<String,String> fun){
		return fun.apply(str);
	}
	
	@Test
	public void test4(){
		List<String> li = Arrays.asList("hello","world","nihao","shit","nibuhao");
		List<String> newli = filterStr(li,s->s.length()>5);
		System.out.println(newli);
	
	}
	
	public List<String> filterStr(List<String> list,Predicate<String> pre){
		List<String> strList = new ArrayList<>();
		for(String s : list){
			if(pre.test(s)){
				strList.add(s);
			}
		}
		return strList;
	}
}
