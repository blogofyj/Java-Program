package IODemo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * �ļ��ַ�������
 * 1.����Դ
 * 2.ѡ����
 * 3.����
 * 4.�ͷ���Դ
 * 
 * ��ݼ�
 * 1.��Ӱ� ��Ctrl shift o 
 * 2.��Ӵ���飺alt shift z
 * 3.javaBean: Alt shift s
 * 4.ȫ��ĳ�����滻 :Ctrl f
 * 5.new�����ǰ�������: Ctrl 1
 * 6.�鿴���ĵ�ַ ��Alt enter
 * 7.ɾ�����д��� Ctrl D
 */

public class IOTest06 {

	public static void main(String[] args) throws IOException {
		
		File src = new File("abc.txt");
		System.out.println(src.exists());
		System.out.println(src.getAbsolutePath());
		
		Reader reader = null;
		
		try {
			reader = new FileReader(src);
			
			char[] flush = new char[1024];//��������
			int len = -1;
			
			while((len = reader.read(flush)) != -1) {
				//�ַ�����--���ַ���
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
			System.out.println("err");
			
		}
	}
}
