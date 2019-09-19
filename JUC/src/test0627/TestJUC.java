package test0627;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 
 * 
 * volatile 轻量级的同步机制
 * 
 * 此关键字的特点
 * 
 * 1 内存可见性
 * 2 不保原子性
 * 3 禁止指令的重排序
 * 
 * @author 爱不会绝迹
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

