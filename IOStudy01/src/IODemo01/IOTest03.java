package IODemo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/*
 * 字符流操作(中文不会出现乱码) 文件字符输入流
 * FileReader()
 * FileWriter()
 * 
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.关闭流
 */

public class IOTest03 {
	public static void main(String[] args) throws IOException {
		
		File src = new File("abc.txt");
		
		Reader reader = null;
		
		try {
			reader = new FileReader(src);
			//操作
			char[] flush = new char[1024];//1k字节
			int len = -1;
			
			while((len = reader.read(flush)) != -1) {
				//字符数组--》字符串
//				String str = String.valueOf(flush);
//				String str = Arrays.toString(flush);
				String str = new String(flush, 0, len);
				System.out.println(str);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				} 
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
