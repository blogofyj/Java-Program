package GoogleSource;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
 * java.io包中有五个类三个接口
 * File		文件类
 * InoutStream		字节输入流
 * OutputStream		字节输出流
 * Reader		字符输入流
 * Writer		字符输出流
 * 
 * Closeable		关闭流接口
 * Flushable		刷新流接口
 * Serializable		序列化接口
 * 
 * 数据到程序 (InputStream, Reader读进来)
 * 程序到目的地(OutputStream, Writer写出去)
 * 
 * 二八法则
 * 
 * 1.list(),列出下级名称
 * 2.listFiles(),列出下级File对象
 * 
 */
public class IODemo {
	
	public static void main(String[] args) {
		
		dirListDemo();
//		File dir = new File("D:\\ProgramFiles\\JavaProgram\\JavaLesson\\src\\GoogleSource\\test.txt");
//		boolean b = dir.mkdirs();
//		System.out.println(b);
//		dir.delete();
	}
	
	public static void dirListDemo() {
		
		File dir = new File("D:/ProgramFiles/JavaProgram/JavaLesson");
		
		//列出下级名称
		String[] subDir = dir.list();
		for (String s : subDir) {
			System.out.println(s);
		}
		
		//列出下级File对象
		File[] f = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				/*
				 * dir - 被找到的文件所在的目录。name - 文件的名称。
				 * 具体FilenameFilter详见：
				 * https://blog.csdn.net/qq_26767175/article/details/89444567
				 */
				
				return name.endsWith(".project");
			}
		});
		for (File ff : f) {
			System.out.println(ff);
		}
		
//		File[] f1 = dir.listFiles(new FileFilter() {
//			
//			@Override
//			public boolean accept(File pathname) {
//
//				// System.out.println(pathname);
//				// boolean flag = pathname.isFile();
//				// boolean flag2 = pathname.endsWith(".html");
//				// return flag && flag2;
//				// return pathname.isFile() && pathname.getName().endsWith(".html");
//				return pathname.getName().endsWith(".html");
//				//return false;
//			}
//		});
		
		File[] f1 = dir.listRoots();
		for (File f2 : f1) {
			System.out.println(f2);
		}
	}
	
	
	//打印子孙级目录和文件的名称		递归调用
	/*
	 * 1.递归头
	 * 2.递归体
	 * 3.控制前面层次
	 */
	public static void printName(File src, int deep) {
		
		for (int i = 0; i < deep; i++) {	//实现目录的层次感
			System.out.println("-");
		}
		
		System.out.println(src.getName());
		
		if(src == null || !src.exists()) {	//递归头
			return;
		}else if(src.isDirectory()) {	//目录
			
			for(File s : src.listFiles()) {
				printName(s, deep + 1); 	//递归体
			}
		}
	}
	
	private static long len = 0;
	/*
	 * 获取大小
	 */
	public static void count(File src) {
		
		if(src != null && src.exists()) {
			
			if(src.isFile()) {		//大小
				len += src.length();
			}else {		//子孙级
				
				for(File f : src.listFiles()) {
					count(f);
					
				}
			}
		}
	}
}
