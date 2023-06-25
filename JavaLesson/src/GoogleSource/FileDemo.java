package GoogleSource;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
//		File f = new File("C:\\Windows\\desktop");
		
		File f = new File("..");	//.表示当前目录，..表示上级目录
		f.getPath();	//返还路径
		f.getAbsolutePath();	//绝对路径
		f.getCanonicalPath();	//规范路径
		
		while(f.isFile()) {	//文件是否存在
			if(f.isDirectory()) {	//是否是一个已存在的目录
				System.out.println(f.canExecute());
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
				System.out.println(f.exists());
			}
		}
		
		if(f.createNewFile()) {	//创建新文件成功
			
			File ff = File.createTempFile("tmp-", "txt");  //创建临时文件
			
			ff.deleteOnExit();   //JVM退出时自动删除
		}
		
		File[] f1 = f.listFiles();	//列出所有文件和子目录
		if(f1 != null) {
			for (File file : f1) {
				System.out.println(file);
			}
		}
		
		File[] f2 = f.listFiles(new FilenameFilter() {	//匿名对象重写

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".exe");	//返回以exe结尾的文件
			}
			
		});
		
		
		
	}
	
	public static void pathDemo() {
		Path p1 = Paths.get(".", "project", "study"); // 构造一个Path对象
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath(); // 转换为绝对路径
        System.out.println(p2);
        Path p3 = p2.normalize(); // 转换为规范路径
        System.out.println(p3);
        File f = p3.toFile(); // 转换为File对象
        System.out.println(f);
        for (Path p : Paths.get("..").toAbsolutePath()) { // 可以直接遍历Path
            System.out.println("  " + p);
        }
	}
	
	static void listDir(File dir, int indent) {
			
			File[] fs = dir.listFiles();
			if (fs != null) {
				for (File f : fs) {
					for(int i=0; i<indent; i++) {
						System.out.print("  ");
					}
					if(f.isDirectory()) {
						System.out.println(f.getName() + "/");
						
					}else {
						System.out.println(f.getName());
					}
					listDir(f, indent + 1);
					
				}
			}
		}

}
