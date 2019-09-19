package TestLambda;
/**
 * Stream API
 * 
 * 一、Stream 的三个步骤
 * 
 * 1、创建Stream
 * 
 * 2、中间操作
 * 
 * 3、终止操作（终端操作）
 * 
 * 
 * 
 * 
 * @author 爱不会绝迹
 *
 */
public class Test05 {
	
	/*
	 * 赛选与切片
	 * 
	 * filter--接受Lambda，从流中排除某些元素
	 * limit--截断流，使其元素不超过给定的数量。
	 * skip(n)--跳过元素，返回一个扔掉了前n个元素的流，
	 * 若不足n个元素，则返回一个空流，与limit(n) 互补
	 * distinct--赛选，通过流所生成的元素的hashcode()和equals()方法去除重复元素
	 * 懒加载 重甲操作只有当终止操作时，才一次性执行所有操作
	 *
	 */

	
	public void test1(){
		//java实验中做过类似的
	}
}
