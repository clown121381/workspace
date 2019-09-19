package com.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.order.Order;
import com.person.Person;

public interface IPersonMapper {			
	//关联查询		
	@Select( "select p.pid,p.name,o.orderid,o.total from  persons p,orders o "		
		   + " where p.pid = o.pid  and p.pid =#{pid}")	
	@ResultMap("com.sql.sql.personMap")		
	public Person findOnePerson(Integer pid);		
	//查询2次		
	
	@Select("select orderid,total,pid from orders where pid=#{pid}")		
	public Order findOrders(Integer pid);		
	@Select("select pid,name from persons where pid =#{pid}")		
	@Results({		
			  @Result(id=true, property="pid",column="pid"),
			  @Result(property="name",column="name"),
			  @Result(property="orders", column="pid",
			  many=@Many(select="com.Idao.IPersonMapper.findOrders"))
	          })		
	public Person findPersonByID(Integer pid);	
}			
