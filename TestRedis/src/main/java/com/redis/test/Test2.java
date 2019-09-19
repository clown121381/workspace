package com.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Test2 {
	public static void main(String[] args) {
//		Test t = new Test();
//		t.test02();
		JedisPoolConfig poolcfg = new JedisPoolConfig();
		poolcfg.setMaxIdle(50);
		poolcfg.setMaxTotal(100);
		poolcfg.setMaxWaitMillis(20000);
		JedisPool pool = new JedisPool(poolcfg,"localhost");
		Jedis jedis = pool.getResource();
		int i = 0;
		try{
			long start = System.currentTimeMillis();
			while(true) {
				long end = System.currentTimeMillis();
				if(end-start >= 1000) {
					break;
				}
				i ++;
				jedis.set("test"+i, i+"");
			}
		}finally{
			jedis.close();
		}
		System.out.println("redis每秒操作："+i+"次");
	}
}
