package cn.itheima.oneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtil.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		
		
		 // 2.操作
        // 2.1创建客户
        Customer c = new Customer();
        c.setName("张三");

        // 2.2创建两个订单
        Order o1 = new Order();
        o1.setMoney(1000d);
        o1.setReceiverInfo("武汉");

        Order o2 = new Order();
        o2.setMoney(2000d);
        o2.setReceiverInfo("上海");

        // 2.3建立关系
        // 2.3.1订单关联客户
        o1.setC(c);
        o2.setC(c);
        // 2.3.2客户关联订单
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
