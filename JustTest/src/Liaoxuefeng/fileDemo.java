package Liaoxuefeng;

import java.io.File;
import java.io.IOException;

public class fileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(".\\sub\\javac");
		f.getPath();
		f.getAbsolutePath();
		f.getCanonicalPath();
		
		File f1 = new File("..");
		f1.isFile();
		f1.isDirectory();
		
		boolean ff = f1.canRead();
		boolean fff = f1.canWrite();
		boolean ffff = f1.canExecute();
		long fffff = f1.length();
		
		File name = File.createTempFile("tmp-", ".txt");
		
		name.deleteOnExit();//JVM退出时自动删除
		
	}

}
