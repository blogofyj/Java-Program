package Test01;

import java.io.File;

public class Test02 {
	
	public static void main(String[] args) {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
	}
	
}
