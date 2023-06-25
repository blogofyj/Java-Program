package Liaoxuefeng;
import java.io.*;
import java.nio.file.Path;

public class fileOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File f = new File("F:\\360Downloads\\Software\\ShadowsocksR-win-4.9.2");
//		System.out.println(f);
//		System.out.println(f.canRead());
//		System.out.println(f.getAbsolutePath());
//		System.out.println("..F:\\360Downloads\\Software\\ShadowsocksR-win-4.9.2");
		
		File f = new File("C:\\Windows");
		File[] fs1 = f.listFiles();
		printFiles(fs1);
		
		File[] fs2 = f.listFiles(new FilenameFilter(){//FilenameFilter类是接口
			//override
			public boolean accept(File dir, String name){
				return name.endsWith(".exe") /*|| new File(name).isDirectory()*/;
			}
		});
		
		printFiles(fs2);
		
	}
	
	static void printFiles(File[] files){
		if(files != null){
			for(File f : files){
				System.out.println(f);
			}
		}
	}
	
	static void anotherMethod(){
		Path p1 = java.nio.file.Paths.get(".", "project", "study");
		
		Path p2 = p1.toAbsolutePath();
		
		Path p3 = p2.normalize();
		
		File f = p3.toFile();
		
		for(Path p : java.nio.file.Paths.get("..").toAbsolutePath()){
			System.out.println(" " + p   );
		}
	}

}









