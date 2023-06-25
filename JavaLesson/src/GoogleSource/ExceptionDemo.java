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
//	   // 程序代码
//	}catch(ExceptionName e1)
//	{
//	   //Catch 块
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
	

//	多重代码块
//	try{
//		   // 程序代码
//		}catch(异常类型1 异常的变量名1){
//		  // 程序代码
//		}catch(异常类型2 异常的变量名2){
//		  // 程序代码
//		}catch(异常类型2 异常的变量名2){
//		  // 程序代码
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

	
	
//	finally关键字  无论是否发生异常，finally 代码块中的代码总会被执行   
//	可以运行清理类型等收尾善后性质的语句
//	try{
//		  // 程序代码
//		}catch(异常类型1 异常的变量名1){
//		  // 程序代码
//		}catch(异常类型2 异常的变量名2){
//		  // 程序代码
//		}finally{
//		  // 程序代码
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
	
	
//	声明自定义异常
//	在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。
//	所有异常都必须是 Throwable 的子类。
//	如果希望写一个检查性异常类，则需要继承 Exception 类。
//	如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。
	
}
