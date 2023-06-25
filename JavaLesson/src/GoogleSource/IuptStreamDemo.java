package GoogleSource;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream是一个抽象类,是所有输入流的超类
 * public abstract int read() throws IOException; 他的一个方法
 * FileInputStream 是InputStream的一个子类
 *
 */
public class IuptStreamDemo {

	public static void main(String[] args) throws IOException {
//		Thread th = new Thread();
//		try {
//			th.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}		快捷键 Alt Shift zN
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		byte[] data = {23,56,12,68,90};
		try(InputStream input = new ByteArrayInputStream(data)){
			String s = readAsString(input);
			System.out.println(s);
		}
		
	}
	
	public static String readAsString(InputStream input) throws IOException {
		int n;
        StringBuilder sb = new StringBuilder();
        while ((n = input.read()) != -1) {
            sb.append((char) n);
        }
        return sb.toString();
	}
	
	public static void readFile() throws IOException{
		
		InputStream input = new FileInputStream("src/read.txt");
		
		while(true) {
			int n = input.read();
			
			if(n == -1) {
				break;
			}
			System.out.println(n);
		}
//		input.close();
		
		try {
			int n;
			while((n = input.read()) != -1) {
				System.out.println(n);
			}
		}finally {	//关闭资源
			if(input != null) {
				input.close();
			}
		}
	}
	
	void readFile2() throws IOException{	//编译器自动关闭资源
		try(InputStream input = new FileInputStream("..")){	//try(source)
			int n;
			while((n = input.read()) != -1) {
				System.out.println(n);
			}
		}
	}
	
	
	/*
	 * 一次读取一个字节很低效
	 * 所以InputStream提供了两个重载方法读取多个字节
	 * 缓冲
	 * int read(byte[] b)：读取若干字节并填充到byte[]数组，返回读取的字节数
	 * int read(byte[] b, int off, int len)：指定byte[]数组的偏移量和最大填充数
	 */
	public void readFile3() throws IOException{
		
		try(InputStream input = new FileInputStream("..")){	//try(source)
			
			byte[] buffer = new byte[1000];
			int n;
			while((n = input.read(buffer)) != -1) {
				System.out.println("read " + n + "bytes");
			}
		}
	}
	
	/**
	 * 我们想从文件中读取所有字节，并转换成char然后拼成一个字符串，可以这么写
	 */
	public void readFile4() throws IOException {
		String s;
		try(InputStream input = new FileInputStream(".")){
			int n;
			StringBuilder sb = new StringBuilder();
			while((n = input.read()) != -1) {
				sb.append((char)n);
			}
			s = sb.toString();
		}
		System.out.println(s);
	}
}
