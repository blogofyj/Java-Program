package GoogleSource;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
 * java.io����������������ӿ�
 * File		�ļ���
 * InoutStream		�ֽ�������
 * OutputStream		�ֽ������
 * Reader		�ַ�������
 * Writer		�ַ������
 * 
 * Closeable		�ر����ӿ�
 * Flushable		ˢ�����ӿ�
 * Serializable		���л��ӿ�
 * 
 * ���ݵ����� (InputStream, Reader������)
 * ����Ŀ�ĵ�(OutputStream, Writerд��ȥ)
 * 
 * ���˷���
 * 
 * 1.list(),�г��¼�����
 * 2.listFiles(),�г��¼�File����
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
		
		//�г��¼�����
		String[] subDir = dir.list();
		for (String s : subDir) {
			System.out.println(s);
		}
		
		//�г��¼�File����
		File[] f = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				/*
				 * dir - ���ҵ����ļ����ڵ�Ŀ¼��name - �ļ������ơ�
				 * ����FilenameFilter�����
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
	
	
	//��ӡ���ＶĿ¼���ļ�������		�ݹ����
	/*
	 * 1.�ݹ�ͷ
	 * 2.�ݹ���
	 * 3.����ǰ����
	 */
	public static void printName(File src, int deep) {
		
		for (int i = 0; i < deep; i++) {	//ʵ��Ŀ¼�Ĳ�θ�
			System.out.println("-");
		}
		
		System.out.println(src.getName());
		
		if(src == null || !src.exists()) {	//�ݹ�ͷ
			return;
		}else if(src.isDirectory()) {	//Ŀ¼
			
			for(File s : src.listFiles()) {
				printName(s, deep + 1); 	//�ݹ���
			}
		}
	}
	
	private static long len = 0;
	/*
	 * ��ȡ��С
	 */
	public static void count(File src) {
		
		if(src != null && src.exists()) {
			
			if(src.isFile()) {		//��С
				len += src.length();
			}else {		//���Ｖ
				
				for(File f : src.listFiles()) {
					count(f);
					
				}
			}
		}
	}
}
