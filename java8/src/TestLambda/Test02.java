package TestLambda;

import java.util.function.Consumer;

/**
 * 
 * 
 * 
 * �����﷨��java8��������һ���µĲ�������->��,�ò�������lambda���ʽ���Ϊ������
 * ��ࣺLambda���ʽ�Ĳ����б��ӿ��з����Ĳ����б�
 * �ҲࣺLambda���ʽҪִ�в������ӿڵķ�����д�Ĳ���
 * 
 * ����ʽ�ӿڣ�ֻ��һ�����󷽷��Ľӿ�.lambda���ʽ��Ҫ����ʽ�ӿڵ�֧��
 * �����ڲ���ʹ���ⲿ��ĳ�Ա��������Ա��������Ϊfinal
 * �﷨��ʽһ���޲����޷���ֵ
 *		()->System.out.println("hello world");
 * �﷨��ʽ����һ�������޷���ֵС���ſ���ʡ��
 * 		(a)->System.out.println("hello world");
 * �﷨��ʽ�����з���ֵ���������ϵĲ���lambda�����ж�����䣨ֻ��һ�����{}����ʡ�Բ�д��
 * 		A a1 = (a,b,c,d)->{
 * 						System.out.println(a+b+c+d);
 * 						System.out.println("hello world");
 * 
 * 						return new A();
 * 					}
 * �﷨��ʽ�ġ������б��е��������Ϳ���ʡ�Բ�д��jvm�ı��������Ը����������ƶϳ��������������ͣ������ƶϣ�
 * @author ���������
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Runnable r1 = ()->System.out.println("hello world");
	
		Consumer<String> con = (a)->System.out.println("hello world");
		
	
	}
}
