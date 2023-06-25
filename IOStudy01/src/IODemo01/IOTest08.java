package IODemo01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 字节数组输入流
 * ByteArrayInputStream
 * 1.创建源 ：字节数组 不要太大
 * 2.选择流
 * 3.操作
 * 4.释放资源: 可以不用处理
 */

public class IOTest08 {

	public static void main(String[] args) {
	
		//创建源
		byte[] src = "Hello the world".getBytes();
		
		//选择流
		InputStream is = null;
		
		try {
			is = new ByteArrayInputStream(src);
//			System.out.println(is.read()); H的ASCII码值
			//操作
			byte[] flush = new byte[5];//缓冲容器
			int len = -1;
			while((len = is.read(flush)) != -1) {
				String str = new String(flush);
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		is.close();不用调用，是空方法
	}
}
