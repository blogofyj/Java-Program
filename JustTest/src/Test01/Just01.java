package Test01;

import java.io.File;
import java.io.IOException;
/*
 * createNewFile(),	不存在才创建，存在创建成功
 * delete(),删除已经存在的
 * 
 * mkdir() 确保上级目录存在
 * mkdirs() 上级目录可以不存在，连同一起创建
 */

public class Just01 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		boolean flag = f.createNewFile();
		System.out.println(flag);
		
		File dir = new File("D:\\ProgramFiles\\JavaProgram\\JustTest\\test\\dir");
		boolean flag1 = dir.mkdir();
		System.out.println(flag1);
		dir.mkdirs();
		File f1 = new File("D:/ProgramFiles/JavaProgram/JustTest/test/dir/apple.txt");
		f1.createNewFile();
		f.delete();
		dir.delete();
		f1.delete();
	}
}
