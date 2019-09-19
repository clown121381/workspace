package TestLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import TestLambda.entity.Employee;
import TestLambda.entity.MyCompare;
import TestLambda.entity.MyCompareImpl;
import TestLambda.entity.MyCompareImpl1;

public class Test01 {

	// �Ƚϴ�С������lambda���ʽ
	@Test
	public void test() {
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return Integer.compare(arg0, arg1);
			}
		};

	}

	// ��lambda���ʽ
	@Test
	public void test01() {
		Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
	}

	// �Ƚ�employee������ ����ͨ������
	public static List<Employee> compareEmployeesWithAge(List<Employee> emps, Integer age) {
		List<Employee> li = new ArrayList<>();
		for (Employee e : emps) {
			if (e.getAge() > age) {
				li.add(e);
			}
		}
		return li;
	}

	// �Ƚ�employee������ ����ͨ������
	public static List<Employee> compareEmployeesWithSalary(List<Employee> emps, Double salary) {
		List<Employee> li = new ArrayList<>();
		for (Employee e : emps) {
			if (e.getSalary() > salary) {
				li.add(e);
			}
		}
		return li;
	}

	public static List<Employee> compareEmployee(List<Employee> emps ,MyCompare<Employee> mycom){
		List<Employee> li = new ArrayList<>();
		for (Employee e : emps) {
			if (mycom.compare(e)) {
				li.add(e);
			}
		}
		return li;
	}
	
	public static void main(String[] args) {

		Employee[] emps = new Employee[] {  new Employee("����", 20, 4000.00), 
											new Employee("����", 21, 5000.00),
											new Employee("����", 22, 8000.00),
											new Employee("����", 24, 1000.00),
											new Employee("�Ǻ�", 30, 9000.00) };
		List<Employee> list = Arrays.asList(emps);
		//��ʹ��lambda���ʽ ��ͨ��д��
		//System.out.println(compareEmployeesWithAge(list, 20));
		//System.out.println(compareEmployeesWithSalary(list, 5000.00));
		
		//��ʹ��lambda���ʽ �ӿ�ʵ���ࣨ���������ڲ��ࣩ��д��(�������ģʽ)
		//System.out.println(compareEmployee(list, new MyCompareImpl()));
		//System.out.println(compareEmployee(list, new MyCompareImpl1()));
		
		
		//System.out.println(compareEmployee(list, (l)->l.getAge() > 20));
		
		list.stream().filter(e->e.getSalary()>5000.00).limit(2).forEach(System.out::println);
	
		
	}

}
