package com.redis.TestRedis04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.redis.serialize.SerializeObject;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	
	public static void main(String[] args) {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(8);
		poolConfig.setMaxTotal(100);
		poolConfig.setMaxWaitMillis(2000);
		
		JedisPool pool = new JedisPool(poolConfig,"localhost");
		Jedis jedis = pool.getResource();
		jedis.select(0);
		List<String> list = useHmset(jedis);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		List<String> list1 = useList(jedis);
		Iterator<String> it1 = list1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		usesadd(jedis);
		usezadd(jedis);
		useObject(jedis);
		
	}
	
	private static void useObject(Jedis jedis) {
		Student stu = new Student("liqiang",1001,20);
		byte[] bs = SerializeObject.serialize(stu);
		jedis.set("li".getBytes(), bs);
		byte[] li = jedis.get("li".getBytes());
		Student stuget = (Student)SerializeObject.unserialize(li);
		System.out.println(stuget);
		System.out.println("li".getBytes());
	}

	//list的使用
	public static List<String> useList(Jedis jedis){
		
		String key = "list";
		String[] rpush = {"list1","list2","list3","list4"};
		jedis.rpush(key, rpush);
		String[] lpush = {"list10","list9","list8","list7"};
		jedis.lpush(key, lpush);
		return jedis.lrange(key, 0, 10);
	}
	
	//hash的使用
	public static List<String> useHmset(Jedis jedis){
		Map<String,String> map = new HashMap<>();
		map.put("map1", "map1");
		map.put("map2", "map2");
		map.put("map3", "map3");
		map.put("map4", "map4");
		map.put("map5", "map5");
		jedis.hmset("map",map);
		
		String[] s = {"map1","map2"};
		return jedis.hmget("map",s);
	}
	
	//set的使用
	public static Set<String> usesadd(Jedis jedis){
		String key = "set";
		String[] members = {"set1","set2","set3","set4","set5"};
		jedis.sadd(key, members);
		Set<String> string = jedis.smembers(key);
		return string;
	}
	
	//set的使用
		public static Set<String> usezadd(Jedis jedis){
			String key = "sort";
			Map<String,Double> map = new HashMap<>();
			map.put("sort1", 1.1111);
			map.put("sort2", 4.1111);
			map.put("sort3", 2.1111);
			map.put("sort4", 7.1111);
			jedis.zadd(key, map);
			Set<String> string = jedis.zrange(key, 0, 3);
			return string;
		}
		
		
		
	
}
