package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test04 {
	public static void main(String[] args) {
		
		OutputStream os  = null;
		InputStream is  = null;
		File f1 = new File("e:/test02.txt");
		File f2 = new File("e:/test01.txt");
		try {
			os = new FileOutputStream(f1);
			is = new FileInputStream(f2);
			byte[] b = new byte[1024];
			while(is.read(b)!=-1){
				System.out.println(new String(b));
				os.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
