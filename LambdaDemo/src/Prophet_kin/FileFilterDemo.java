package Prophet_kin;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 
 * @author asus
 *File[] listFiles(FileFilter filter)
 *		���ã����������ļ� ��File����
 *		boolean accept(File pathname) ����ָ������·�����Ƿ�Ӧ�ð�����ĳ���ļ�·�����б���
 *		������File pathname: ʹ��listFiles��������Ŀ¼�� �õ�ÿһ���ļ�����
 *
 *File[] ListFiles(FilenameFilter filter)
 *		���ã����ڹ����ļ�����
 *		boolean accept(File dir, String name)
 *		����ָ���ļ��Ƿ�Ӧ�ð�����ĳһ�ļ��б���
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
			public boolean accept(File dir, String name) {//dirĿ¼�� name �ļ�����
				
				//����ж�����һ���ļ��У�ֻ�а�dir �� name �ٷ�װ ��һ��File����
				return new File(dir, name).isDirectory()
						|| name.endsWith(".txt");
			}
			
		});
		
		//����ʹ��lambda ���ӿ���ֻ��һ�����󷽷���
		File dir = new File(".");
		if(!dir.exists()) {
			dir.createNewFile();
//			dir.mkdirs();����Ŀ¼����Ŀ¼û��Ҳһ�𴴽�����ȫ�Ը�
		}
		
		File[] files1 = dir.listFiles((File d, String name) -> {
			return new File(d, name).isDirectory() || name.endsWith(".txt");
		});
		
		//��һ����
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
	
	//��̬�ڲ���
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

