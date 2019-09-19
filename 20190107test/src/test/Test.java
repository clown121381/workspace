package test;

public class Test {
	static int f1(int a,int b) {
		return a > b ? a : b;
	}
	static int f4(int[] a) {
		int max = a[0];
		for(int i = 0;i < a.length;i ++)
		{
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	static int f(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0)
				sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int a[] = new int [100];
		for (int i = 0; i < args.length; i++) {
			a[i] = i;
		}
		
		f(a);
	}
}