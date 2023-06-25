package Prophet_kin;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 
 * @author asus
 *File[] listFiles(FileFilter filter)
 *		作用：用来过滤文件 （File对象）
 *		boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个文件路径名列表中
 *		参数：File pathname: 使用listFiles方法遍历目录， 得到每一个文件对象
 *
 *File[] ListFiles(FilenameFilter filter)
 *		作用：用于过滤文件名称
 *		boolean accept(File dir, String name)
 *		测试指定文件是否应该包含在某一文件列表中
 */

public class FileFilterDemo {

	public static void main(String[] args) throws IOException {
		
		File[] files = new File(".").listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory() || pathname.getName().endsWith(".txt");
			}
			
		});
		
		//or
		new File(".").listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {//dir目录， name 文件名称
				
				//如何判断他是一个文件夹，只有把dir 和 name 再封装 成一个File对象
				return new File(dir, name).isDirectory()
						|| name.endsWith(".txt");
			}
			
		});
		
		//可以使用lambda （接口中只有一个抽象方法）
		File dir = new File(".");
		if(!dir.exists()) {
			dir.createNewFile();
//			dir.mkdirs();创建目录，父目录没有也一起创建，安全性高
		}
		
		File[] files1 = dir.listFiles((File d, String name) -> {
			return new File(d, name).isDirectory() || name.endsWith(".txt");
		});
		
		//进一步简化
		File[] files2 = dir.listFiles((d, name) -> new File(d, name).isDirectory() || name.endsWith(".txt"));
	}
	
	public static void getAllFile(File dir) {
		File[] files = dir.listFiles();
		for(File f : files) {
			if(f.isDirectory()) {
				getAllFile(f);
			}else {
				System.out.println(f);
			}
		}
	}
	
	//静态内部类
	public static class MyFileFilter implements FileFilter {

		@Override
		public boolean accept(File pathname) {
			if(pathname.isDirectory()) {
				return true;
			}
			return pathname.getName().toLowerCase().endsWith(".txt");
		}
		
	}
}

