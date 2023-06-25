package GoogleSource;

import java.io.File;

public class DirCount {

	private long len;
	
	private String path;
	
	private File src;
	
	//�ļ�����
	private int fileSize;
	
	//�ļ��и���
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
					
			if(src.isFile()) {		//��С
			
				len += src.length();
				this.fileSize++;	//ͳ���ļ�����
				
			}else {		//���Ｖ
				
				this.dirSize++;		//ͳ���ļ��и���
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
