package com.redis.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import redis.clients.jedis.Jedis;

public class Test {
	public void test02() {
		Jedis jedis = new Jedis("localhost",6379);
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
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
	}
}