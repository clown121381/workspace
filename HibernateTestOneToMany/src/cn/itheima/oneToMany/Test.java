package cn.itheima.oneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtil.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		
		
		 // 2.����
        // 2.1�����ͻ�
        Customer c = new Customer();
        c.setName("����");

        // 2.2������������
        Order o1 = new Order();
        o1.setMoney(1000d);
        o1.setReceiverInfo("�人");

        Order o2 = new Order();
        o2.setMoney(2000d);
        o2.setReceiverInfo("�Ϻ�");

        // 2.3������ϵ
        // 2.3.1���������ͻ�
        o1.setC(c);
        o2.setC(c);
        // 2.3.2�ͻ���������
        c.getOrders().add(o1);
        c.getOrders().add(o2);

        session.save(o1);
        session.save(o2);
        session.save(c);
        
        ts.commit();
        HibernateUtil.closeSession();
        HibernateUtil.closesessionFactory();
	}
}
