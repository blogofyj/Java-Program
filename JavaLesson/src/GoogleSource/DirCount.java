package GoogleSource;

import java.io.File;

public class DirCount {

	private long len;
	
	private String path;
	
	private File src;
	
	//文件个数
	private int fileSize;
	
	//文件夹个数
	private int dirSize;

	public DirCount(String path) {
		super();
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}
	
	
	public long getLen() {
		return len;
	}

	public int getFileSize() {
		return fileSize;
	}

	public int getDirSize() {
		return dirSize;
	}

	private void count(File src) {
		
		if(src != null && src.exists()) {
					
			if(src.isFile()) {		//大小
			
				len += src.length();
				this.fileSize++;	//统计文件个数
				
			}else {		//子孙级
				
				this.dirSize++;		//统计文件夹个数
				for(File f : src.listFiles()) {
					count(f);
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		DirCount dir = new DirCount("D:/ProgramFiles/JavaProgram/JavaLesson");
		System.out.println(dir.getLen() + "-->" + dir.getFileSize() + "-->" + dir.getDirSize());
	}
	
}
