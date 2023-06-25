package GoogleSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
	}
	
//	try
//	{
//	   // �������
//	}catch(ExceptionName e1)
//	{
//	   //Catch ��
//	}
	public static void demo01() {
		
		try{
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	      
	}
	

//	���ش����
//	try{
//		   // �������
//		}catch(�쳣����1 �쳣�ı�����1){
//		  // �������
//		}catch(�쳣����2 �쳣�ı�����2){
//		  // �������
//		}catch(�쳣����2 �쳣�ı�����2){
//		  // �������
//		}
	public static int demo02() {
		
		String fileName = "C:/java/hello";
		
		File fileName1 = new File(fileName);
		
		try {
		    InputStream file = new FileInputStream(fileName1);
		    byte x = (byte) file.read();
		} catch(FileNotFoundException f) { // Not valid!
		    f.printStackTrace();
		    return -1;
		} catch(IOException i) {
		    i.printStackTrace();
		    return -1;
		}
		return 0;
	}

	
	
//	finally�ؼ���  �����Ƿ����쳣��finally ������еĴ����ܻᱻִ��   
//	���������������͵���β�ƺ����ʵ����
//	try{
//		  // �������
//		}catch(�쳣����1 �쳣�ı�����1){
//		  // �������
//		}catch(�쳣����2 �쳣�ı�����2){
//		  // �������
//		}finally{
//		  // �������
//		}
	public static void demo03() {
		
		int a[] = new int[2];
	    try{
	       System.out.println("Access element three :" + a[3]);
	    }catch(ArrayIndexOutOfBoundsException e){
	       System.out.println("Exception thrown  :" + e);
	    }
	    finally{
	       a[0] = 6;
	       System.out.println("First element value: " +a[0]);
	       System.out.println("The finally statement is executed");
	    }
	    
	}
	
	
//	�����Զ����쳣
//	�� Java ��������Զ����쳣����д�Լ����쳣��ʱ��Ҫ��ס����ļ��㡣
//	�����쳣�������� Throwable �����ࡣ
//	���ϣ��дһ��������쳣�࣬����Ҫ�̳� Exception �ࡣ
//	�������дһ������ʱ�쳣�࣬��ô��Ҫ�̳� RuntimeException �ࡣ
	
}
