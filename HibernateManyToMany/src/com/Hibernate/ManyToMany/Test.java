package com.Hibernate.ManyToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtil.HibernateUtil;

public class Test {
	public static void main(String[] args) {
	        Session session = HibernateUtil.getSession();
	        Transaction transaction = session.beginTransaction();
	        
	        Student s1 = new Student();
	        s1.setSid(1);
	        s1.setSname("张三");
	        Student s2 = new Student();
	        s2.setSname("李四");
	        s2.setSid(2);
	        
	        Course c1 = new Course();
	        c1.setCname("C语言");
	        c1.setCid(1);
	        Course c2 = new Course();
	        c2.setCname("Java");
	        c2.setCid(2);
	        Course c3 = new Course();
	        c3.setCname("前端");
	        c3.setCid(3);
	        
	        //s1选择了c1和c2
	        s1.getCourses().add(c1);
	        s1.getCourses().add(c2);
	        
	        //s2选择了c2 c3
	        s2.getCourses().add(c2);
	        s2.getCourses().add(c3);
	        
	        //c1被s1选了
	        c1.getStudents().add(s1);
	        //c2被s1,s2选了
	        c2.getStudents().add(s1);
	        c2.getStudents().add(s2);
	        //c3被s2选了
	        c3.getStudents().add(s2);
	        //如果双向关联,一定要一方放弃主键维护
//	        session.save(s1);
//	        session.save(s2);
//	        session.save(c1);
//	        session.save(c2);
//	        session.save(c3);
	        
	        
	        Course c = session.get(Course.class, 5);
			Student stu = session.get(Student.class, 1);
			if(c!= null && stu != null)
			{
				stu.getCourses().remove(c);
			}
	        
	      //  session.delete(s1);
	        
	        transaction.commit();
	        HibernateUtil.closeSession();
	        HibernateUtil.closesessionFactory();
	}
}
