package IODemo01;

import java.io.File;
import java.io.IOException;

public class JustTest {

	public static void main(String[] args) throws IOException {
		
		//"abc.txt"����·���� ������Ŀ��  (Ҫ�ڹ�����Ŀ�´����ļ�Ĭ�ϵĲ��ҵõ�)
		File f = new File("abc.txt");
		if(!f.exists()) {
			f.createNewFile();
		}else if(f.isFile()) {
			System.out.println("It's a File");
		}else {
			System.out.println("It's a dir");
		}
		/*
		 * ������ exists()
		 * ���ļ��� isFile();
		 * ��Ŀ¼�� isDirectory();
		 */
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		
//		f.delete();
		
		//����test�ļ��У���ΪDir�����ڣ����Ե���mkdir()ʧ�ܣ��������mkdirs(),������ͬDirһͬ����
		File dir = new File("D:/ProgramFiles/JavaProgram/IOStudy01/Dir/test");
		boolean b = dir.mkdir();
		System.out.println("���� "+ b);
		
		boolean bb = dir.mkdirs();
		System.out.println("���� " + bb);
		
		//�����ļ���
		File ff = new File("D:/ProgramFiles/JavaProgram/IOStudy01/mytest.txt");
		if(!ff.exists()) {
			ff.createNewFile();
		}
		
		ff.delete();
	}
}
