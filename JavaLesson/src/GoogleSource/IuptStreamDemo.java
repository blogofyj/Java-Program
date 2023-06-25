package GoogleSource;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream��һ��������,�������������ĳ���
 * public abstract int read() throws IOException; ����һ������
 * FileInputStream ��InputStream��һ������
 *
 */
public class IuptStreamDemo {

	public static void main(String[] args) throws IOException {
//		Thread th = new Thread();
//		try {
//			th.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}		��ݼ� Alt Shift zN
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
		}finally {	//�ر���Դ
			if(input != null) {
				input.close();
			}
		}
	}
	
	void readFile2() throws IOException{	//�������Զ��ر���Դ
		try(InputStream input = new FileInputStream("..")){	//try(source)
			int n;
			while((n = input.read()) != -1) {
				System.out.println(n);
			}
		}
	}
	
	
	/*
	 * һ�ζ�ȡһ���ֽںܵ�Ч
	 * ����InputStream�ṩ���������ط�����ȡ����ֽ�
	 * ����
	 * int read(byte[] b)����ȡ�����ֽڲ���䵽byte[]���飬���ض�ȡ���ֽ���
	 * int read(byte[] b, int off, int len)��ָ��byte[]�����ƫ��������������
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
	 * ��������ļ��ж�ȡ�����ֽڣ���ת����charȻ��ƴ��һ���ַ�����������ôд
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
