package problems;
/**
 * ���ྲ̬�����
 * ���ྲ̬�����
 * ��������
 * ���๹�췽��
 * ��������
 * ���๹�췽��
 * @author ���������
 *
 */
public class ClassInit extends Demo{
	{
		new Demo("{}"+i);
	}
	static int i = 0;
	static{
		new ClassInit();
	}
	static {
		System.out.println("start");
	}
	public static void main(String args[]) { 
 		new ClassInit();
	}
	ClassInit(){
		i++;
		System.out.println(i);
	}
}
class Demo{
	static{
		System.out.println("Static Demo");
	}
	Demo(String i){
		System.out.println("Demo_"+i);
	}
	Demo(){
		System.out.println("Demo_");
	}
}



