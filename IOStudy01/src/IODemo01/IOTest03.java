package IODemo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/*
 * �ַ�������(���Ĳ����������) �ļ��ַ�������
 * FileReader()
 * FileWriter()
 * 
 * 1.����Դ
 * 2.ѡ����
 * 3.����
 * 4.�ر���
 */

public class IOTest03 {
	public static void main(String[] args) throws IOException {
		
		File src = new File("abc.txt");
		
		Reader reader = null;
		
		try {
			reader = new FileReader(src);
			//����
			char[] flush = new char[1024];//1k�ֽ�
			int len = -1;
			
			while((len = reader.read(flush)) != -1) {
				//�ַ�����--���ַ���
//				String str = String.valueOf(flush);
//				String str = Arrays.toString(flush);
				String str = new String(flush, 0, len);
				System.out.println(str);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				} 
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
