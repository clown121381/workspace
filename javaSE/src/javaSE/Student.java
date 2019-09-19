package javaSE;

public class Student extends Human{
	//构造方法用于初始化给变量赋值
	public Student(){
		
	}
	public Student(int age,String name,String id) {
		this.id = id;//this关键字用于制定当前对象
		this.name = name;
		this.age = age;
	}
	//封装属性私有化，提供get/set方法给属性赋值
	private String name; //private 关键字，表示为类的私有属性
	private int age;
	private String id;
	public String getName() {//getName	方法命名单词拼接，首字母大写
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
