package IODemo01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * �ֽ�����������
 * ByteArrayInputStream
 * 1.����Դ ���ֽ����� ��Ҫ̫��
 * 2.ѡ����
 * 3.����
 * 4.�ͷ���Դ: ���Բ��ô���
 */

public class IOTest08 {

	public static void main(String[] args) {
	
		//����Դ
		byte[] src = "Hello the world".getBytes();
		
		//ѡ����
		InputStream is = null;
		
		try {
			is = new ByteArrayInputStream(src);
//			System.out.println(is.read()); H��ASCII��ֵ
			//����
			byte[] flush = new byte[5];//��������
			int len = -1;
			while((len = is.read(flush)) != -1) {
				String str = new String(flush);
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		is.close();���õ��ã��ǿշ���
	}
}
