package problems;
/**
 * JAVA中类的加载顺序
 * @author 爱不会绝迹
 *
 */
public class Test02 extends Test03{
	static{
		System.out.println("子类静态代码块");
	}

	{
		System.out.println("子类代码块");
	}
	
	Test02(){
		System.out.println("子类构造方法");
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
class Test03{
	static{
		System.out.println("父类静态代码块");
	}
	
	{
		System.out.println("父类代码块");
	}
	
	public Test03(){
		System.out.println("父类构造方法");
	}
	
}

