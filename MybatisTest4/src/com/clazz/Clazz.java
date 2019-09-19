package com.clazz;

import java.io.Serializable;
import java.util.List;

import com.student.Student;

public class Clazz implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//����ʵ��������ԣ���class���е��ֶζ�Ӧ
    private int id;            //id===>c_id
    private String name;    //name===>c_name
    
    //ʹ��һ��List<Student>�������Ա�ʾ�༶ӵ�е�ѧ��
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes [id=" + id + ", name=" + name + ", students=" + students + "]";
    }
}