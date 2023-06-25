package GoogleSource;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
//		File f = new File("C:\\Windows\\desktop");
		
		File f = new File("..");	//.��ʾ��ǰĿ¼��..��ʾ�ϼ�Ŀ¼
		f.getPath();	//����·��
		f.getAbsolutePath();	//����·��
		f.getCanonicalPath();	//�淶·��
		
		while(f.isFile()) {	//�ļ��Ƿ����
			if(f.isDirectory()) {	//�Ƿ���һ���Ѵ��ڵ�Ŀ¼
				System.out.println(f.canExecute());
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
				System.out.println(f.exists());
			}
		}
		
		if(f.createNewFile()) {	//�������ļ��ɹ�
			
			File ff = File.createTempFile("tmp-", "txt");  //������ʱ�ļ�
			
			ff.deleteOnExit();   //JVM�˳�ʱ�Զ�ɾ��
		}
		
		File[] f1 = f.listFiles();	//�г������ļ�����Ŀ¼
		if(f1 != null) {
			for (File file : f1) {
				System.out.println(file);
			}
		}
		
		File[] f2 = f.listFiles(new FilenameFilter() {	//����������д

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".exe");	//������exe��β���ļ�
			}
			
		});
		
		
		
	}
	
	public static void pathDemo() {
		Path p1 = Paths.get(".", "project", "study"); // ����һ��Path����
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath(); // ת��Ϊ����·��
        System.out.println(p2);
        Path p3 = p2.normalize(); // ת��Ϊ�淶·��
        System.out.println(p3);
        File f = p3.toFile(); // ת��ΪFile����
        System.out.println(f);
        for (Path p : Paths.get("..").toAbsolutePath()) { // ����ֱ�ӱ���Path
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
