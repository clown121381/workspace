package javaSE;

public class Student extends Human{
	//���췽�����ڳ�ʼ����������ֵ
	public Student(){
		
	}
	public Student(int age,String name,String id) {
		this.id = id;//this�ؼ��������ƶ���ǰ����
		this.name = name;
		this.age = age;
	}
	//��װ����˽�л����ṩget/set���������Ը�ֵ
	private String name; //private �ؼ��֣���ʾΪ���˽������
	private int age;
	private String id;
	public String getName() {//getName	������������ƴ�ӣ�����ĸ��д
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
