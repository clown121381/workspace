package problems;
/**
 * 父类静态代码块
 * 子类静态代码块
 * 父类代码块
 * 父类构造方法
 * 子类代码块
 * 子类构造方法
 * @author 爱不会绝迹
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



