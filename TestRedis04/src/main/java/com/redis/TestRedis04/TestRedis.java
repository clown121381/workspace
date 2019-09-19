package com.redis.TestRedis04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestRedis {
	public static void main(String[] args) {
		method01();
		method02();
		method03();
	}
	private static void method02() {
		JedisPoolConfig poolcfg = new JedisPoolConfig();
		poolcfg.setMaxIdle(50);
		poolcfg.setMaxTotal(100);
		poolcfg.setMaxWaitMillis(2000);
		JedisPool pool = new JedisPool(poolcfg,"localhost");
		Jedis jedis = pool.getResource();
		jedis.set("1002", "xiaohuang");
		System.out.println(jedis.get("1002"));
		
	}
	public static void method01(){
		Jedis jedis = new Jedis("localhost",6379);
		jedis.set("1001", "xiaoming");
		
		System.out.println(jedis.get("1001"));
	}
	public static void method03(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JedisPool pool = (JedisPool)act.getBean("redisClient");
		Jedis jedis = pool.getResource();
		jedis.set("1003", "xiaoli");
		System.out.println(jedis.get("1003"));
	}
}
