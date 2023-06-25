package IODemo01;

import java.io.File;
import java.io.IOException;

public class JustTest {

	public static void main(String[] args) throws IOException {
		
		//"abc.txt"代表路径在 工程项目下  (要在工程项目下创建文件默认的才找得到)
		File f = new File("abc.txt");
		if(!f.exists()) {
			f.createNewFile();
		}else if(f.isFile()) {
			System.out.println("It's a File");
		}else {
			System.out.println("It's a dir");
		}
		/*
		 * 存在吗 exists()
		 * 是文件吗 isFile();
		 * 是目录吗 isDirectory();
		 */
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		
//		f.delete();
		
		//创建test文件夹，因为Dir不存在，所以调用mkdir()失败，必须调用mkdirs(),它会连同Dir一同创建
		File dir = new File("D:/ProgramFiles/JavaProgram/IOStudy01/Dir/test");
		boolean b = dir.mkdir();
		System.out.println("创建 "+ b);
		
		boolean bb = dir.mkdirs();
		System.out.println("创建 " + bb);
		
		//创建文件夹
		File ff = new File("D:/ProgramFiles/JavaProgram/IOStudy01/mytest.txt");
		if(!ff.exists()) {
			ff.createNewFile();
		}
		
		ff.delete();
	}
}
