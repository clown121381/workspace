package javaSE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


/**
 * java�ܽ�
 * @author ���������
 *
 */
public class java {
	//public ����Ϊ��������������.�������ø÷���
	//static �ؼ�������
	public static void test() {
		int a = 10;//int Ϊ������������10Ϊ�����ĸ�ֵ
		Student stu = new Student();//new�ؼ������ڴ�������stu����ΪStudent���һ��ʵ����
		stu.setAge(18);
		stu.setName("yang");
		stu.setId("2017214213");
		System.out.println(a + stu.getAge());
		
		try {
			int b = 10/0;//���ܳ����쳣�Ĵ���
		} catch (Exception e) {
			//�����쳣
			e.printStackTrace();
		}
	}
	public static void listTest() {//����
		List<String> li = new ArrayList<String>();
		Set<String> s = new TreeSet<String>();
		Map<Integer,String> map = new HashMap<Integer,String>();
	}
	public static void main(String[] args) {
		test();
	}
}
