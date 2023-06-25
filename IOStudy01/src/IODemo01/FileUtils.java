package IODemo01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 封装
 * 1.封装拷贝
 * 2.封装释放资源
 * 
 * try...with...resource  自动释放
 * try(is;os){
 * 	   //todo
 * }
 */

public class FileUtils {

	public static void main(String[] args) {
		
		//文件到文件
		try {
			InputStream is = new FileInputStream("abc.txt");
			OutputStream os = new FileOutputStream("abc-copy.txt");
			copy(is, os);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//文件到字节数组
		byte[] datas = null;
		try {
			InputStream is = new FileInputStream("abc.txt");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			copy(is, os);
			datas = os.toByteArray();
			System.out.println(datas.length);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//字节数组到文件
		try {
			InputStream is = new ByteArrayInputStream (datas);
			OutputStream os = new FileOutputStream("abc-copy.txt");
			copy(is, os);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/*
	 * 对接输入输出流
	 */
	public static void copy(InputStream is, OutputStream os) {
		
		
		try {
			
			//操作(分段读取)
			byte[] flush = new byte[1024];
			int len = -1;
			
			while((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			
			os.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//释放资源, 分别关闭，先打开的后关闭
			close(is, os); 
		}
		
	}
	
	public static void close(InputStream is, OutputStream os) {
		try {
			
			if (os != null) {
				os.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			if (is != null) {
				is.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void close(Closeable... ios) {
		for (Closeable io : ios) {
			try {
				if (io != null) {
					io.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
//	自动释放资源
//	try(InputStream is = new InputStream(src);OutputStream os = new OutputStream(dest); {
//		
//		@Override
//		public void write(int b) throws IOException {
//			// TODO Auto-generated method stub
//			
//		}
//	}; {
//		
//		@Override
//		public int read() throws IOException {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	})
	
}
