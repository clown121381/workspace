package com.redis.serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {
	
	public static byte[] serialize(Object b){
		ObjectOutputStream oos = null;
		ByteArrayOutputStream bos = null;
		
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(b);
			oos.close();
			
			byte[] byteArray = bos.toByteArray();
			return byteArray;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static Object unserialize(byte[] bytes){
		ObjectInputStream ois = null;
		ByteArrayInputStream bis = null;
		
		try {
			bis = new ByteArrayInputStream(bytes);
			ois = new ObjectInputStream(bis);
			
			Object obj = ois.readObject();
			return obj;
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
