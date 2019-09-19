package test0627;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 
 * 
 * volatile ��������ͬ������
 * 
 * �˹ؼ��ֵ��ص�
 * 
 * 1 �ڴ�ɼ���
 * 2 ����ԭ����
 * 3 ��ָֹ���������
 * 
 * @author ���������
 *
 */

public class TestJUC {
	
	public static void main(String[] args) {
		
		TestThread td = new TestThread();
		//TestAtomicThread td = new TestAtomicThread();
		for (int i = 0; i < 10; i++) {
			new Thread(td).start();
		}
	}
}



class TestAtomicThread implements Runnable{
	private AtomicInteger i = new AtomicInteger();
	@Override
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		System.out.println(i.addAndGet(1));
	}
}



class TestThread implements Runnable{
	private volatile int i = 0;
	@Override
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		i = i + 1;
		System.out.println(i);
	}
}

