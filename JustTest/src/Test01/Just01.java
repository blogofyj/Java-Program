package Test01;

import java.io.File;
import java.io.IOException;
/*
 * createNewFile(),	�����ڲŴ��������ڴ����ɹ�
 * delete(),ɾ���Ѿ����ڵ�
 * 
 * mkdir() ȷ���ϼ�Ŀ¼����
 * mkdirs() �ϼ�Ŀ¼���Բ����ڣ���ͬһ�𴴽�
 */

public class Just01 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		boolean flag = f.createNewFile();
		System.out.println(flag);
		
		File dir = new File("D:\\ProgramFiles\\JavaProgram\\JustTest\\test\\dir");
		boolean flag1 = dir.mkdir();
		System.out.println(flag1);
		dir.mkdirs();
		File f1 = new File("D:/ProgramFiles/JavaProgram/JustTest/test/dir/apple.txt");
		f1.createNewFile();
		f.delete();
		dir.delete();
		f1.delete();
	}
}
