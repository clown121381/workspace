package problems;
/**
 * JAVA����ļ���˳��
 * @author ���������
 *
 */
public class Test02 extends Test03{
	static{
		System.out.println("���ྲ̬�����");
	}

	{
		System.out.println("��������");
	}
	
	Test02(){
		System.out.println("���๹�췽��");
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
class Test03{
	static{
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("��������");
	}
	
	public Test03(){
		System.out.println("���๹�췽��");
	}
	
}

